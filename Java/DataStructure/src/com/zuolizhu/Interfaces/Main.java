package com.zuolizhu.Interfaces;

public class Main {
    /**
     * Interface self is abstract method, there is no actual code to implementation
     */
    public static void main(String[] args) {
        ITelephone zzPhone;
        zzPhone = new DeskPhone(1234567);
        zzPhone.powerOn();
        zzPhone.callPhone(666123);
        zzPhone.answer();
    }
}
