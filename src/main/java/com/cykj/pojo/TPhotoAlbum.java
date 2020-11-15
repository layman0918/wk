package com.cykj.pojo;


public class TPhotoAlbum {

  private int id;
  private String name;
  private String description;
  private String url;
  private java.sql.Timestamp uploadTime;
  private int classId;


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


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public java.sql.Timestamp getUploadTime() {
    return uploadTime;
  }

  public void setUploadTime(java.sql.Timestamp uploadTime) {
    this.uploadTime = uploadTime;
  }


  public int getClassId() {
    return classId;
  }

  public void setClassId(int classId) {
    this.classId = classId;
  }

}
