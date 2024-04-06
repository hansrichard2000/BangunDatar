package model;

public class Trapesium {
    private double alas;
    private double atas;
    private double kiri;
    private double kanan;
    private double tinggi;

    public Trapesium(){

    }

    public Trapesium(double alas, double atas, double kiri, double kanan, double tinggi){
        this.alas = alas;
        this.atas = atas;
        this.kiri = kiri;
        this.kanan = kanan;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return alas;
    }

    public void setAlas(double alas){
        this.alas = alas;
    }

    public double getAtas(){
        return atas;
    }

    public void setAtas(double atas){
        this.atas = atas;
    }

    public double getKiri(){
        return kiri;
    }

    public void setKiri(double kiri){
        this.kiri = kiri;
    }

    public double getKanan(){
        return kanan;
    }

    public void setKanan(double kanan){
        this.kanan = kanan;
    }

    public double getTinggi(){
        return tinggi;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    private double calculateArea(double alas, double atas, double tinggi){
        double area = ((alas+atas)*tinggi)/2;
        return area;
    }

    private double calculateCircumference(double alas, double atas, double kiri, double kanan){
        double circumference = alas + atas + kiri + kanan;
        return circumference;
    }

    public double resultArea(){
        double resultArea = calculateArea(alas, atas, tinggi);
        return resultArea;
    }

    public double resultCircumference(){
        double resultCircumference = calculateCircumference(alas, atas, kiri, kanan);
        return resultCircumference;
    }
}
