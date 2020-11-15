package com.cykj.pojo;


public class THomework {

  private int id;
  private int name;
  private String content;
  private java.sql.Timestamp releaseTime;
  private int classId;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getName() {
    return name;
  }

  public void setName(int name) {
    this.name = name;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public java.sql.Timestamp getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(java.sql.Timestamp releaseTime) {
    this.releaseTime = releaseTime;
  }


  public int getClassId() {
    return classId;
  }

  public void setClassId(int classId) {
    this.classId = classId;
  }

}
