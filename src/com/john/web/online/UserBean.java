package com.john.web.online;

public class UserBean {
  private int id;
  private String userName;
  
  public UserBean() {}
  public UserBean(int id , String userName) {
    this.id = id;
    this.userName = userName;
  }
  
  public int getId() {return id;}
  public void setId(int id) {this.id = id;}
  public String getUserName() {return userName;}
  public void setUserName(String userName) {this.userName = userName;}
}
