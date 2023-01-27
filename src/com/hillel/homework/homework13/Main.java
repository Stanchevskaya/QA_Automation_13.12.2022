package com.hillel.homework.homework13;

interface LinuxOS { }
interface IOS { }
interface Smartphone {
    void call();
    void sms();
    void internet();
}
class Androids implements Smartphone, LinuxOS {
    public void call(){
        System.out.println("Calling from Android");
    }
    public void sms(){
        System.out.println("Sending SMS from Android");
    }
    public void internet(){
        System.out.println("Browsing internet from Android");
    }
}

class iPhones implements Smartphone, IOS {
    public void call(){
        System.out.println("Calling from iPhone");
    }
    public void sms(){
        System.out.println("Sending SMS from iPhone");
    }
    public void internet(){
        System.out.println("Browsing internet from iPhone");
    }
}
public class Main {
    public static void main(String[] args) {
        Androids android_instance = new Androids();
        iPhones iphone_instance = new iPhones();
    }
}


