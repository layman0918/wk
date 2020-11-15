package com.cykj.pojo;


public class TDailyFood {

  private int id;
  private int day;
  private String breakfast;
  private String lunch;
  private String snack;
  private int weeklyId;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }


  public String getBreakfast() {
    return breakfast;
  }

  public void setBreakfast(String breakfast) {
    this.breakfast = breakfast;
  }


  public String getLunch() {
    return lunch;
  }

  public void setLunch(String lunch) {
    this.lunch = lunch;
  }


  public String getSnack() {
    return snack;
  }

  public void setSnack(String snack) {
    this.snack = snack;
  }


  public int getWeeklyId() {
    return weeklyId;
  }

  public void setWeeklyId(int weeklyId) {
    this.weeklyId = weeklyId;
  }

}
