package com.driver.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="driver")
public class Driver {
  private int driverId;
  private String  mobile;
  private String password;
  @OneToOne
  @JoinColumn
  private Cab cab;
  @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
  private List<TripBooking> tripBooking;
  @ManyToOne
  @JoinColumn
  private Admin admin;

  public Driver(int driverId, String mobile) {
    this.driverId = driverId;
    this.mobile = mobile;
  }

  public int getDriverId() {
    return driverId;
  }

  public void setDriverId(int driverId) {
    this.driverId = driverId;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Cab getCab() {
    return cab;
  }

  public void setCab(Cab cab) {
    this.cab = cab;
  }

  public List<TripBooking> getTripBooking() {
    return tripBooking;
  }

  public void setTripBooking(List<TripBooking> tripBooking) {
    this.tripBooking = tripBooking;
  }

  public Admin getAdmin() {
    return admin;
  }

  public void setAdmin(Admin admin) {
    this.admin = admin;
  }
}
