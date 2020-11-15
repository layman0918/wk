package com.cykj.pojo;


public class THealthcare {

  private int id;
  private int babyId;
  private java.sql.Timestamp time;
  private double height;
  private double weigh;
  private double eyesight;
  private double temperature;
  private int situation;
  private int staffId;
  private String description;


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


  public java.sql.Timestamp getTime() {
    return time;
  }

  public void setTime(java.sql.Timestamp time) {
    this.time = time;
  }


  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }


  public double getWeigh() {
    return weigh;
  }

  public void setWeigh(double weigh) {
    this.weigh = weigh;
  }


  public double getEyesight() {
    return eyesight;
  }

  public void setEyesight(double eyesight) {
    this.eyesight = eyesight;
  }


  public double getTemperature() {
    return temperature;
  }

  public void setTemperature(double temperature) {
    this.temperature = temperature;
  }


  public int getSituation() {
    return situation;
  }

  public void setSituation(int situation) {
    this.situation = situation;
  }


  public int getStaffId() {
    return staffId;
  }

  public void setStaffId(int staffId) {
    this.staffId = staffId;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
