package model;

public class Segitiga extends Bangun2D{

    private double alas;
    private double tinggi;
    private double kiri;
    private double kanan;
    
    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSudut = 30;
    }

    public Segitiga(double alas, double tinggi, double kiri, double kanan){
        this.alas = alas;
        this.tinggi = tinggi;
        this.kiri = kiri;
        this.kanan = kanan;
    }

    public double getAlas(){
        return alas;
    }

    public void setAlas(double alas){
        this.alas = alas;
    }

    public double getTinggi(){
        return tinggi;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
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

    private double calculateArea(double alas, double tinggi){
        double area = (alas*tinggi)/2;
        return area;
    }

    private double calculateCircumference(double alas, double kiri, double kanan){
        double circumference = alas + kiri + kanan;
        return circumference;
    }

    public double resultArea(){
        double resultArea = calculateArea(alas, tinggi);
        return resultArea;
    }

    public double resultCircumference(){
        double resultCircumference = calculateCircumference(alas, kiri, kanan);
        return resultCircumference;
    }
}
