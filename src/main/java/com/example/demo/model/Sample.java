package com.example.demo.model;

public class Sample {
    private String name;
    private int age;
    private String phoneNo;
    private String emailId;

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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNo='" + phoneNo + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public Sample(String name, int age, String phoneNo, String emailId) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.emailId = emailId;
    }

    public Sample() {
    }
}