package com.cykj.pojo;


public class TWeeklyFood {

  private int id;
  private java.sql.Date startTime;
  private java.sql.Date endTime;
  private int parkId;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public java.sql.Date getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Date startTime) {
    this.startTime = startTime;
  }


  public java.sql.Date getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Date endTime) {
    this.endTime = endTime;
  }


  public int getParkId() {
    return parkId;
  }

  public void setParkId(int parkId) {
    this.parkId = parkId;
  }

}
