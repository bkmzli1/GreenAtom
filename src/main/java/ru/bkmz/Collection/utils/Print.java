package ru.bkmz.Collection.utils;

public class Print {
    private TimeSpeed  getAddTime;
    private TimeSpeed searchTime;
    private TimeSpeed deleteTime;

    public Print(String nameClass) {
        getAddTime = new TimeSpeed("add "+nameClass);
        searchTime = new TimeSpeed("search "+nameClass);
        deleteTime = new TimeSpeed("delete "+nameClass);
    }

    public void print() {
        System.out.println( getAddTime.result());
        System.out.println(searchTime.result());
        System.out.println(deleteTime.result());
        System.out.println();
    }

    public TimeSpeed getAddTime() {
        return getAddTime;
    }

    public void setAddTime(TimeSpeed getAddTime) {
        this.getAddTime = getAddTime;
    }

    public TimeSpeed getSearchTime() {
        return searchTime;
    }

    public void setSearchTime(TimeSpeed searchTime) {
        this.searchTime = searchTime;
    }

    public TimeSpeed getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(TimeSpeed deleteTime) {
        this.deleteTime = deleteTime;
    }
}
