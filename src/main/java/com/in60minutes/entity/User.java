package com.in60minutes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "exception")
public class User {

    @Id
    @GeneratedValue
    private int userId;

    @NotBlank(message = "username shouldn't be null")
    private String userName;

    @Email(message = "invalid email address")
    private String email;

    @Pattern(regexp = "^\\d{10}$", message="invalied mobile number entered")
    private String mobile;

    @NotBlank
    private String gender;

    @NotBlank
    private String name;

    @Min(18)
    @Max(60)
    private int age;

    @NotBlank
    private String natuionality;


    public User() {
    }

    public User(int userId, String userName, String email, String mobile, String gender, String name, int age, String natuionality) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.mobile = mobile;
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.natuionality = natuionality;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNatuionality() {
        return natuionality;
    }

    public void setNatuionality(String natuionality) {
        this.natuionality = natuionality;
    }
}
