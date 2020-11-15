package com.cykj.pojo;


public class TMessage {

  private int id;
  private String title;
  private String content;
  private int classId;
  private int parkId;
  private java.sql.Timestamp releaseTime;
  private java.sql.Timestamp createTime;
  private int state;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public int getClassId() {
    return classId;
  }

  public void setClassId(int classId) {
    this.classId = classId;
  }


  public int getParkId() {
    return parkId;
  }

  public void setParkId(int parkId) {
    this.parkId = parkId;
  }


  public java.sql.Timestamp getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(java.sql.Timestamp releaseTime) {
    this.releaseTime = releaseTime;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }

}
