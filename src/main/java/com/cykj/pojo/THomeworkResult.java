package com.cykj.pojo;


public class THomeworkResult {

  private int id;
  private int babyId;
  private int homeworkId;
  private int result;
  private java.sql.Timestamp submitTime;
  private int score;


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


  public int getHomeworkId() {
    return homeworkId;
  }

  public void setHomeworkId(int homeworkId) {
    this.homeworkId = homeworkId;
  }


  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }


  public java.sql.Timestamp getSubmitTime() {
    return submitTime;
  }

  public void setSubmitTime(java.sql.Timestamp submitTime) {
    this.submitTime = submitTime;
  }


  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

}
