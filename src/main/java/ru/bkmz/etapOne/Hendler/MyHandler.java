package ru.bkmz.etapOne.Hendler;

public class MyHandler implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("Асинхронный привет!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Асинхронный пока!");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
