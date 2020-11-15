package com.cykj.pojo;


public class TSecurityVideo {

  private int id;
  private String name;
  private java.sql.Timestamp startDate;
  private java.sql.Timestamp endDate;
  private java.sql.Timestamp uploadTime;
  private String url;
  private int quizId;
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


  public java.sql.Timestamp getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }


  public java.sql.Timestamp getEndDate() {
    return endDate;
  }

  public void setEndDate(java.sql.Timestamp endDate) {
    this.endDate = endDate;
  }


  public java.sql.Timestamp getUploadTime() {
    return uploadTime;
  }

  public void setUploadTime(java.sql.Timestamp uploadTime) {
    this.uploadTime = uploadTime;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public int getQuizId() {
    return quizId;
  }

  public void setQuizId(int quizId) {
    this.quizId = quizId;
  }


  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }

}
