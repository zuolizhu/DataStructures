package com.zuolizhu.Interfaces;

public class Main {
    /**
     * Interface self is abstract method, there is no actual code to implementation
     */
    public static void main(String[] args) {
        ITelephone zzPhone;
        zzPhone = new DeskPhone(1234567);
//        zzPhone.powerOn();
        zzPhone.callPhone(1234567);
        zzPhone.answer();

        zzPhone = new MobilePhone(62123123);
        zzPhone.powerOn();
        zzPhone.callPhone(62123123);
        zzPhone.answer();
    }
}
