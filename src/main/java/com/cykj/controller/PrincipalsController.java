package com.cykj.controller;

import com.cykj.pojo.TBaby;
import com.cykj.pojo.TKindergarten;
import com.cykj.pojo.TStaff;
import com.cykj.pojo.TableInf;
import com.cykj.service.PrincipalsService;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PrincipalsController {

    @Resource
    private PrincipalsService principalsServiceImpl;



//    ----------------------------------------------园所资格审批
    /**
     * 园所资格审批
     **/
    @RequestMapping("/kindergarten")
    public String kindergarten(HttpServletRequest req){
        TKindergarten tk=new TKindergarten();
        tk.setId(1);
        req.getSession().setAttribute("loginTStaff",tk);
        return "kindergarten";
    }
    /**
     * 申请审批
     **/
    @RequestMapping("/examination")
    public @ResponseBody String examination( int logId,String kName,String cName,String cId,String address,String tel,String school,
                                            String sanitation,String fire,String organization,String tax,String fund) throws IOException {
        int n = 0;
        String remsg = null;
        TKindergarten tk=new TKindergarten();
        tk.setId(logId);
        tk.setKindergartenName(kName);
        tk.setCorporationName(cName);
        tk.setCreditId(cId);
        tk.setAddress(address);
        tk.setTel(tel);
        tk.setSchoolLicense(school);
        tk.setSanitationLicense(sanitation);
        tk.setFireLicense(fire);
        tk.setOrganizationCodeLicense(organization);
        tk.setTaxRegistrationTaxRegistration(tax);
        tk.setFireLicense(fund);

        n=principalsServiceImpl.examination(tk);
        if (n>0){
            remsg="Success";
        }
        return remsg;
    }


    //    ---------------------------------职工信息
    /**
     * 查询职工信息表
     **/
    @RequestMapping("/staff")
    public String staff(HttpServletRequest req){
        TKindergarten tk=new TKindergarten();
        tk.setId(1);
        req.getSession().setAttribute("loginTStaff",tk);
        return "staff-table";
    }
    /**
     * 职工信息
     **/
    @RequestMapping("/findStaff")
    public @ResponseBody
    String findStaff(HttpServletRequest req, String page, String limit,  String staffName) throws IOException, ParseException {

        Map<String, Object> condition = new HashMap();
        if (staffName != null && !"".equals(staffName.trim())) {
            System.out.println("执行条件查询");
            condition.put("name", "%" + staffName + "%");
        }
        System.out.println(staffName);
        System.out.println("执行用户信息表");
        int pages= Integer.parseInt(page);
        int limits= Integer.parseInt(limit);
        int count=principalsServiceImpl.countStaff(condition);
        int page_temp = pages;
        int limit_temp = limits;
        if (count < pages * limits) {
            limits = count - (pages - 1) * limits;
        }
        pages = (page_temp - 1) * limit_temp;

        List<TStaff> staffList = principalsServiceImpl.findStaffAll(pages, limits, condition);
        TableInf tableInf = new TableInf(0, "用户列表数据信息", count, staffList);
        // resp.setContentType("text/html;charset=UTF-8");
        String remsg = new Gson().toJson(tableInf);

        return remsg;
    }
    /**
     * 删除职工
     **/
    @RequestMapping("/deleteStaff")
    public @ResponseBody String deleteStaff(int id) throws IOException {
        int n=0;
        String remsg=null;
        n=principalsServiceImpl.deleteStaff(id);
        if (n>0){
            System.out.println("删除成功");
            remsg="Success";
        }
        return remsg;
    }
    /**
     * 职工状态
     **/
    @RequestMapping("/updateStaffState")
    public @ResponseBody String updateStaffState(int id , int stateId) throws IOException {
        int n=0;
        String remsg=null;
        n=principalsServiceImpl.updateStaffState(id,stateId);
        if (n>0){
            if (stateId==101){
                System.out.println("启用成功");
                remsg="101";
            }else if (stateId==102){
                System.out.println("禁用成功");
                remsg="102";
            }

        }
        return remsg;
    }
    /**
     * 新增职工
     **/
    @RequestMapping("/insertStaff")
    public @ResponseBody String insertStaff(int logId,String Name,String education,String account,String sex,int role) throws IOException {
        int n=0;
        int sexInt=0;
        String remsg=null;
        if (sex.equals("男")){
            sexInt=112;
        }else if (sex.equals("女")){
            sexInt=113;
        }
        TStaff staff=new TStaff();
        staff.setParkId(logId);
        staff.setName(Name);
        staff.setAccount(account);
        staff.setSex(sexInt);
        staff.setRole(role);
        if (education!=null){
            int edInt= new Integer(education);
            staff.setEducation(edInt);
        }

        n=principalsServiceImpl.insertStaff(staff);
        if (n>0){
            remsg="Success";
        }
        return remsg;
    }
    /**
     * 编辑职工
     **/
    @RequestMapping("/updateStaffRole")
    public @ResponseBody String updateStaffRole(int id ,int role) throws IOException {
        int n=0;
        String remsg=null;

        n=principalsServiceImpl.updateStaffRole(id,role);
        if (n>0){
            remsg="Success";
        }
        return remsg;
    }






//    -----------------------------------------------------幼儿管理
    /**
     * 查询幼儿信息表
     **/
    @RequestMapping("/baby")
    public String baby(HttpServletRequest req){
        TKindergarten tk=new TKindergarten();
        tk.setId(1);
        req.getSession().setAttribute("loginTStaff",tk);
        return "baby-table";
    }
    /**
     * 幼儿信息
     **/
    @RequestMapping("/findBaby")
    public @ResponseBody
    String findBaby(HttpServletRequest req, String page, String limit,  String babyName, String beganTime ,String endTime) throws IOException, ParseException {

        Map<String, Object> condition = new HashMap();
        if (babyName != null && !"".equals(babyName.trim())) {
            System.out.println("执行宝宝名条件查询");
            condition.put("name", "%" + babyName + "%");
        }
        if (beganTime != null && !"".equals(beganTime.trim())) {
            System.out.println("执行起始时间条件查询");
            condition.put("beganTime", "%" + beganTime + "%");
        }
        if (endTime != null && !"".equals(endTime.trim())) {
            System.out.println("执行终止时间条件查询");
            condition.put("endTime", "%" + endTime + "%");
        }

        System.out.println(babyName);
        System.out.println("执行宝宝信息表");
        int pages= Integer.parseInt(page);
        int limits= Integer.parseInt(limit);
        int count=principalsServiceImpl.countBaby(condition);
        int page_temp = pages;
        int limit_temp = limits;
        if (count < pages * limits) {
            limits = count - (pages - 1) * limits;
        }
        pages = (page_temp - 1) * limit_temp;

        List<TBaby> babyList = principalsServiceImpl.findBabyAll(pages, limits, condition);
        TableInf tableInf = new TableInf(0, "宝宝列表数据信息", count, babyList);
        String remsg = new Gson().toJson(tableInf);

        return remsg;
    }
//    /**
//     * 删除幼儿
//     **/
//    @RequestMapping("/deleteBaby")
//    public @ResponseBody String deleteBaby(int id) throws IOException {
//        int n=0;
//        String remsg=null;
//        n=principalsServiceImol.deleteStaff(id);
//        if (n>0){
//            System.out.println("删除成功");
//            remsg="Success";
//        }
//        return remsg;
//    }
//    /**
//     * 新增幼儿
//     **/
//    @RequestMapping("/insertBaby")
//    public @ResponseBody String insertBaby(int logId,String Name,String education,String account,String sex,int role) throws IOException {
//        int n=0;
//        int sexInt=0;
//        String remsg=null;
//        if (sex.equals("男")){
//            sexInt=112;
//        }else if (sex.equals("女")){
//            sexInt=113;
//        }
//        TStaff staff=new TStaff();
//        staff.setParkId(logId);
//        staff.setName(Name);
//        staff.setAccount(account);
//        staff.setSex(sexInt);
//        staff.setRole(role);
//        if (education!=null){
//            int edInt= new Integer(education);
//            staff.setEducation(edInt);
//        }
//
//
//        n=principalsServiceImol.insertStaff(staff);
//        if (n>0){
//            remsg="Success";
//        }
//        return remsg;
//    }
//    /**
//     * 编辑幼儿
//     **/
//    @RequestMapping("/updateBabyRole")
//    public @ResponseBody String updateBabyRole(int id ,int role) throws IOException {
//        int n=0;
//        String remsg=null;
//
//        n=principalsServiceImol.updateStaffRole(id,role);
//        if (n>0){
//            remsg="Success";
//        }
//        return remsg;
//    }

//
}
