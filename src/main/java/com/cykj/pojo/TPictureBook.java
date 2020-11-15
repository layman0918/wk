package com.cykj.pojo;


public class TPictureBook {

  private int id;
  private String name;
  private String url;
  private java.sql.Timestamp createTime;
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


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
