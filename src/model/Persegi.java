package model;

import interfaces.Calculation;

public class Persegi implements Calculation{
    
    @Override
    public void calculateArea() {
        // TODO Add specific command here
    }

    @Override
    public void calculateCircumference() {
        // TODO Add specific command here
    }

    private double width;
    private double height;
    private double area;
    private double circumference;

    public Persegi(){

    }

    public Persegi(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    private void calculateArea(double width, double height){
        this.area = width*height;
    }

    private void calculateCircumference(double width, double height){
        this.circumference = 2*(width+height);
    }

    public double resultArea(){
        calculateArea(width, height);
        return area;
    }

    public double resultCircumference(){
        calculateCircumference(width, height);
        return circumference;
    }

    
}