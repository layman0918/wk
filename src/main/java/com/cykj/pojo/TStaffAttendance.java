package com.cykj.pojo;

//职工考勤
public class TStaffAttendance {

  private int id;
  private int staffId;//职工id
  private String date;//考勤时间
  private String amArrive;//上午到达时间
  private String amLeave;//上午离开时间
  private String pmArrive;//下午到达时间
  private String pmLeave;//下午离开时间

  public TStaffAttendance() {

  }

  public TStaffAttendance(int id, int staffId, String date, String amArrive, String amLeave, String pmArrive, String pmLeave) {
    this.id = id;
    this.staffId = staffId;
    this.date = date;
    this.amArrive = amArrive;
    this.amLeave = amLeave;
    this.pmArrive = pmArrive;
    this.pmLeave = pmLeave;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getStaffId() {
    return staffId;
  }

  public void setStaffId(int staffId) {
    this.staffId = staffId;
  }


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  public String getAmArrive() {
    return amArrive;
  }

  public void setAmArrive(String amArrive) {
    this.amArrive = amArrive;
  }


  public String getAmLeave() {
    return amLeave;
  }

  public void setAmLeave(String amLeave) {
    this.amLeave = amLeave;
  }


  public String getPmArrive() {
    return pmArrive;
  }

  public void setPmArrive(String pmArrive) {
    this.pmArrive = pmArrive;
  }


  public String getPmLeave() {
    return pmLeave;
  }

  public void setPmLeave(String pmLeave) {
    this.pmLeave = pmLeave;
  }

}
