package com.sesac.SeSAC.repository;

import com.sesac.SeSAC.model.DangerInfo;
import com.sesac.SeSAC.model.RunningInfo;
import com.sesac.SeSAC.model.User;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class RunningInfoRepository {

    private final EntityManager em;

    public void save(RunningInfo runningInfo){
        em.persist(runningInfo);
    }

    public List<RunningInfo> findByUserId(Long userId){
        List<RunningInfo> result = em.createQuery("select r from running_info r where r.userId = :userId", RunningInfo.class)
                .setParameter("userId", userId)
                .getResultList();
        return result;
    }

}
