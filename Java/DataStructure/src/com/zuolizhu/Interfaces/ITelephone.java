package com.zuolizhu.Interfaces;

public interface ITelephone {
    /**
     * The code below is called signature
     * It is not the actual class
     */
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
