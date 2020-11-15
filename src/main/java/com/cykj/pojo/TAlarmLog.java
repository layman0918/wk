package com.cykj.pojo;

//报警日志表
public class TAlarmLog {

  private int id;
  private String name;//日志名称
  private int babyId;//宝宝id
  private String position;//报警区域
  private String alarmTime;//报警时间
  private int kindergartenId;//园所id


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


  public int getBabyId() {
    return babyId;
  }

  public void setBabyId(int babyId) {
    this.babyId = babyId;
  }


  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public String getAlarmTime() {
    return alarmTime;
  }

  public void setAlarmTime(String alarmTime) {
    this.alarmTime = alarmTime;
  }


  public int getKindergartenId() {
    return kindergartenId;
  }

  public void setKindergartenId(int kindergartenId) {
    this.kindergartenId = kindergartenId;
  }

}
