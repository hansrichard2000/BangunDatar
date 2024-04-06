package model;

public class Lingkaran {
    private double jari2;

    public Lingkaran(){

    }

    public Lingkaran(double jari2){
        this.jari2 = jari2;
    }

    public double getJari2(){
        return jari2;
    }

    public void setJari2(double jari2){
        this.jari2 = jari2;
    }

    private double calculateArea(double jari2){
        double area = Math.PI*jari2*jari2;
        return area;
    }

    private double calculateCircumference(double jari2){
        double circumference = Math.PI*2*jari2;;
        return circumference;
    }

    public double resultArea(){
        double resultArea = calculateArea(jari2);
        return resultArea;
    }

    public double resultCircumference(){
        double resultCircumference = calculateCircumference(jari2);
        return resultCircumference;
    }
}
