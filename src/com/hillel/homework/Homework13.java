package com.hillel.homework;

public class Homework13 {

    interface Smartphones {
        void call();
        void sms();
        void internet();
}
    interface LinuxOS {
    }
    interface IOS {
    }
    static class Androids implements Smartphones {
        public void call() { /* implementation */ }
        public void sms() { /* implementation */ }
        public void internet() { /* implementation */ }
    }
    static class iPhones implements Smartphones, IOS {
        public void call() { /* implementation */ }
        public void sms() { /* implementation */ }
        public void internet() { /* implementation */ }
    }
    public class Main {
        public static void main(String[] args) {
            Androids android = new Androids();
            iPhones iPhone = new iPhones();
        }

    }

}
