package com.cykj.mapper;

import com.cykj.pojo.TBaby;
import com.cykj.pojo.TKindergarten;
import com.cykj.pojo.TStaff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface PrincipalsMapper {
//职工
    int countStaff(@Param("condition")  Map<String, Object> condition);
    List<TStaff> findStaffAll(@Param("pages") int pages, @Param("limits") int limits, @Param("condition") Map<String, Object> condition);
    int deleteStaff(@Param("id")int id);
    int updateStaffState(@Param("id") int id,@Param("stateId") int stateId);
    int insertStaff(@Param("staff") TStaff staff);
    int updateStaffRole(@Param("id") int id, @Param("role") int role);
//资格申请
    int examination( @Param("tk") TKindergarten tk);

//    宝宝表
    int countBaby(@Param("condition")  Map<String, Object> condition);
    List<TBaby> findBabyAll(@Param("pages")  int pages, @Param("limits")  int limits, @Param("condition")  Map<String, Object> condition);
}
