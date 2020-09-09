package ru.bkmz.Collection.utils;

public class TimeSpeed {
    private long start, stop, result;
    private String name;

    public TimeSpeed(String name) {
        this.name = name;
    }

    public void start() {
        start = System.currentTimeMillis();
    }

    public void stop() {
        stop = System.currentTimeMillis();
    }

    public String result() {
        result = stop - start;
        return name + " : " + result;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
