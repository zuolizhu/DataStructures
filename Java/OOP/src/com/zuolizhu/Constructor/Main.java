package com.zuolizhu.Constructor;

public class Main {
    public static void main(String[] args) {
        BankAccount imPoor = new BankAccount("1234-5432-1111", 215000, "ZZ","zzhu9@albany.edu", "(000)-000-1234");
        imPoor.deposit(50.0);
        imPoor.withdrawal(20.0);
    }
}
