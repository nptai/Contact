package com.nptai95.contact;

import java.io.Serializable;

/**
 * Created by nptai95 on 6/10/2016.
 */
public class Contact implements Serializable{
    String email;
    String name;
    String phoneNumber;

    public Contact(String email, String name, String phone) {
        this.email = email;
        this.name = name;
        this.phoneNumber = phone;
    }
}
