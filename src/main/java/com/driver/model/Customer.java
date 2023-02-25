package com.driver.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="customer")
public class Customer {
    private int customerId;
    private String userName;
    private String password;
    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    private List<TripBooking> tripBooking;
    @ManyToOne
    @JoinColumn
    private Admin admin;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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