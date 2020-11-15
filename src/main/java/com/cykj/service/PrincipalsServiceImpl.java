package com.cykj.service;


import com.cykj.mapper.PrincipalsMapper;
import com.cykj.pojo.TBaby;
import com.cykj.pojo.TKindergarten;
import com.cykj.pojo.TStaff;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PrincipalsServiceImpl implements PrincipalsService{

    @Resource
    private PrincipalsMapper principalsMapper;

//    职工信息表
    @Override
    public int countStaff(Map<String, Object> condition) {
        return principalsMapper.countStaff(condition);
    }
    @Override
    public List<TStaff> findStaffAll(int pages, int limits, Map<String, Object> condition) {
        return principalsMapper.findStaffAll(pages,limits,condition);
    }
    @Override
    public int deleteStaff(int id) {
        return principalsMapper.deleteStaff(id);
    }
    @Override
    public int updateStaffState(int id, int stateId) {
        return principalsMapper.updateStaffState(id,stateId);
    }
    @Override
    public int insertStaff(TStaff staff) {
        return principalsMapper.insertStaff(staff);
    }
    @Override
    public int updateStaffRole(int id, int role) {
        return principalsMapper.updateStaffRole(id,role);
    }

//    审批资格
    @Override
    public int examination(TKindergarten tk) {
        return principalsMapper.examination(tk);
    }

//    宝宝信息表
    @Override
    public int countBaby(Map<String, Object> condition) {
        return principalsMapper.countBaby(condition);
    }

    @Override
    public List<TBaby> findBabyAll(int pages, int limits, Map<String, Object> condition) {
        return principalsMapper.findBabyAll(pages,limits,condition);
    }

}
