package com.cykj.pojo;


public class TChat {

  private int id;
  private int sendId;
  private int receiveId;
  private java.sql.Timestamp sendTime;
  private String content;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getSendId() {
    return sendId;
  }

  public void setSendId(int sendId) {
    this.sendId = sendId;
  }


  public int getReceiveId() {
    return receiveId;
  }

  public void setReceiveId(int receiveId) {
    this.receiveId = receiveId;
  }


  public java.sql.Timestamp getSendTime() {
    return sendTime;
  }

  public void setSendTime(java.sql.Timestamp sendTime) {
    this.sendTime = sendTime;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

}
