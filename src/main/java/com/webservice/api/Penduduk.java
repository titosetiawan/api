package com.webservice.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// tanda sebagai entity dan tabel penduduk
@Entity
@Table(name = "penduduk")
public class Penduduk {

    // membuat entity baru dengan nama id yang mempunyai properties sebagai primary dan auto_increment.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    // membuat entity baru dengan nama first_name
    @Column(name = "first_name")
    private String firstName;

    // membuat entity baru dengan nama last_name
    @Column(name = "last_name")
    private String lastName;

    // membuat entity baru dengan nama address
    @Column(name = "address")
    private String address;

    // setter gettter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}