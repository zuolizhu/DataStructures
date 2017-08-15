package com.zuolizhu.OOP.Constructor;

public class VipCustomer {
    private String vipName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default Name", 123000, "default@vip.com");
    }

    public VipCustomer(double creditLimit, String emailAddress) {
        this("Unknown Name", creditLimit, emailAddress);
    }

    public VipCustomer(String vipName, double creditLimit, String emailAddress) {
        this.vipName = vipName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getVipName() {
        return vipName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
