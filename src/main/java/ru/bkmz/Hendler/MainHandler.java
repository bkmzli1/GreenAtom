package ru.bkmz.Hendler;

public class MainHandler {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyHandler(),"Runnable");
        thread.start();

        while (true){
            System.out.println("Работает основная программа:");
            Thread.sleep(1000);
        }
    }
}
