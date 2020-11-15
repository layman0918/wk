package com.cykj.pojo;

//职工信息
public class TStaff {

  private int id;
  private String account;//账号
  private String password;//密码
  private String name;//姓名
  private int parkId;//幼儿园id
  private int education;//学历
  private int age;//年龄
  private int sex;//性别
  private int title;//资质
  private int role;//角色
  private String createTime;//创建时间
  private int state;//状态


  public TStaff() {
  }

  public TStaff(int id, String account, String password, String name, int parkId, int education, int age, int sex, int title, int role, String createTime, int state) {
    this.id = id;
    this.account = account;
    this.password = password;
    this.name = name;
    this.parkId = parkId;
    this.education = education;
    this.age = age;
    this.sex = sex;
    this.title = title;
    this.role = role;
    this.createTime = createTime;
    this.state = state;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getParkId() {
    return parkId;
  }

  public void setParkId(int parkId) {
    this.parkId = parkId;
  }

  public int getEducation() {
    return education;
  }

  public void setEducation(int education) {
    this.education = education;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }

  public int getTitle() {
    return title;
  }

  public void setTitle(int title) {
    this.title = title;
  }

  public int getRole() {
    return role;
  }

  public void setRole(int role) {
    this.role = role;
  }

  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }
}
