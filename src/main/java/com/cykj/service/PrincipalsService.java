package com.cykj.service;

import com.cykj.pojo.TBaby;
import com.cykj.pojo.TKindergarten;
import com.cykj.pojo.TStaff;

import java.util.List;
import java.util.Map;

public interface PrincipalsService {
    //职工信息表
    int countStaff(Map<String,Object> condition);
    List<TStaff> findStaffAll(int pages, int limits, Map<String, Object> condition);
    int deleteStaff(int id);
    int updateStaffState(int id, int stateId);
    int insertStaff(TStaff staff);
    int updateStaffRole(int id, int role);
//园所资格申请
    int examination(TKindergarten tk);
//宝宝信息表
    int countBaby(Map<String, Object> condition);
    List<TBaby> findBabyAll(int pages, int limits, Map<String, Object> condition);
}
