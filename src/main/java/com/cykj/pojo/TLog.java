package com.cykj.pojo;


public class TLog {

  private int id;
  private int optType;
  private int optId;
  private java.sql.Timestamp optTime;
  private int optMatter;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getOptType() {
    return optType;
  }

  public void setOptType(int optType) {
    this.optType = optType;
  }


  public int getOptId() {
    return optId;
  }

  public void setOptId(int optId) {
    this.optId = optId;
  }


  public java.sql.Timestamp getOptTime() {
    return optTime;
  }

  public void setOptTime(java.sql.Timestamp optTime) {
    this.optTime = optTime;
  }


  public int getOptMatter() {
    return optMatter;
  }

  public void setOptMatter(int optMatter) {
    this.optMatter = optMatter;
  }

}
