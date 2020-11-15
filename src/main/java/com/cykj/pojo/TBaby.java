package com.cykj.pojo;


public class TBaby {

  private int id;
  private String name;//宝宝姓名
  private int sex;//宝宝性别
  private int classId;//班级id
  private String birthday;//宝宝生日
  private String image;//宝宝图片
  private String createTime;//创建时间
  private int state;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }


  public int getClassId() {
    return classId;
  }

  public void setClassId(int classId) {
    this.classId = classId;
  }


  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
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
