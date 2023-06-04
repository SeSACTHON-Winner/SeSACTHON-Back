package com.sesac.SeSAC.repository;

import com.sesac.SeSAC.model.DangerInfo;
import com.sesac.SeSAC.model.RunningInfo;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DangerInfoRepository {

    private final EntityManager em;

    public void save(DangerInfo dangerInfo){
        em.persist(dangerInfo);
    }

    public DangerInfo findOne(Long id){
        return em.find(DangerInfo.class, id);
    }


    public List<DangerInfo> findByUserId(Long userId){
        List<DangerInfo> result = em.createQuery("select d from danger_info d where d.userId = :userId", DangerInfo.class)
                .setParameter("userId", userId)
                .getResultList();
        return result;
    }

}
