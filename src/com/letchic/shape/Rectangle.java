package com.letchic.shape;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;
    public Rectangle(){
    };
    public Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    };
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float getArea(){
        return length*width;
    }

    public float getPerimetr(){
        return 2*(length+width);
    }
@Override
    public String toString(){
    return "Rectangle[length="+length+",width="+width+"]";
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Math.abs(rectangle.length - length) > 0.00001) return false;
        return Math.abs(rectangle.width - width) <= 0.00001;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (length != +0.0f ? Float.floatToIntBits(length) : 0);
        result = 31 * result + (width != +0.0f ? Float.floatToIntBits(width) : 0);
        return result;
    }
}