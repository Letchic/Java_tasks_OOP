package com.letchic;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int [] getXY() {
        int [] xy = {x,y};
        return xy;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance (int x, int y){
        double difPowX = Math.pow((this.x-x),2);
        double difPowY = Math.pow((this.y-y),2);
        return Math.sqrt(difPowX+difPowY);
    }

    public double distance (MyPoint point){
        double difPowX = Math.pow((this.x-point.getX()),2);
        double difPowY = Math.pow((this.y-point.getY()),2);
        return Math.sqrt(difPowX+difPowY);
    }

    public double distance (){
        double difPowX = Math.pow(this.x,2);
        double difPowY = Math.pow(this.y,2);
        return Math.sqrt(difPowX+difPowY);
    }

    @Override
    public String toString() {
        return "(x=" + x +", y=" + y +")";
    }
}
