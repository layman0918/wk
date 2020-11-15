package com.cykj.pojo;


public class TAttendance {

  private int id;
  private int babyId;
  private java.sql.Date date;
  private String amCheck;
  private int amParent;
  private String pmCheck;
  private int pmParent;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getBabyId() {
    return babyId;
  }

  public void setBabyId(int babyId) {
    this.babyId = babyId;
  }


  public java.sql.Date getDate() {
    return date;
  }

  public void setDate(java.sql.Date date) {
    this.date = date;
  }


  public String getAmCheck() {
    return amCheck;
  }

  public void setAmCheck(String amCheck) {
    this.amCheck = amCheck;
  }


  public int getAmParent() {
    return amParent;
  }

  public void setAmParent(int amParent) {
    this.amParent = amParent;
  }


  public String getPmCheck() {
    return pmCheck;
  }

  public void setPmCheck(String pmCheck) {
    this.pmCheck = pmCheck;
  }


  public int getPmParent() {
    return pmParent;
  }

  public void setPmParent(int pmParent) {
    this.pmParent = pmParent;
  }

}
