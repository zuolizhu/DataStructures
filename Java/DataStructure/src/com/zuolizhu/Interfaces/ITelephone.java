package com.zuolizhu.Interfaces;

public interface ITelephone {
    /**
     * The code below is called signature
     * It is not the actual class
     */
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
