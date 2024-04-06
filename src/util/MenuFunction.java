package util;

import model.Lingkaran;
import model.Persegi;
import model.Segitiga;
import model.Trapesium;

public class MenuFunction {

    public void showPersegiArea(){
        double sisi = InputFunction.getDoubleInput("Masukkan panjang sisi: ");
        Persegi persegi = new Persegi(sisi, sisi);
        System.out.println("Luas Persegi = SisixSisi");
        System.out.println("Luas Persegi = "+persegi.getWidth()+"x"+persegi.getHeight());
        System.out.println("Luas Persegi = "+persegi.resultArea());
    }

    public void showPersegiCircumference(){
        double sisi = InputFunction.getDoubleInput("Masukkan panjang sisi: ");
        Persegi persegi = new Persegi(sisi, sisi);
        System.out.println("Keliling Persegi = 4xSisi");
        System.out.println("Keliling Persegi = 4x"+persegi.getHeight());
        System.out.println("Keliling Persegi = "+persegi.resultCircumference());
    }

    public void showPersegiPanjangArea(){
        double panjang = InputFunction.getDoubleInput("Masukkan panjang sisi: ");
        double lebar = InputFunction.getDoubleInput("Masukkan lebar sisi: ");
        Persegi persegi = new Persegi(panjang, lebar);
        System.out.println("Luas Persegi Panjang = PanjangxLebar");
        System.out.println("Luas Persegi Panjang = "+persegi.getWidth()+"x"+persegi.getHeight());
        System.out.println("Luas Persegi Panjang = "+persegi.resultArea());
    }

    public void showPersegiPanjangCircumference(){
        double panjang = InputFunction.getDoubleInput("Masukkan panjang sisi: ");
        double lebar = InputFunction.getDoubleInput("Masukkan lebar sisi: ");
        Persegi persegi = new Persegi(panjang, lebar);
        System.out.println("Keliling Persegi Panjang = 2x(Panjang+Lebar)");
        System.out.println("Keliling Persegi Panjang = 2x("+persegi.getWidth()+"+"+persegi.getHeight()+")");
        System.out.println("Keliling Persegi Panjang = "+persegi.resultCircumference());
    }

    public void showLingkaranArea(){
        double jari2 = InputFunction.getDoubleInput("Masukkan panjang jari-jari: ");
        Lingkaran lingkaran = new Lingkaran(jari2);
        System.out.println("Luas Lingkaran = πxrxr");
        System.out.println("Luas Lingkaran = 3.14x"+lingkaran.getJari2()+"x"+lingkaran.getJari2());
        System.out.println("Luas Lingkaran = "+lingkaran.resultArea());
    }

    public void showLingkaranCircumference(){
        double jari2 = InputFunction.getDoubleInput("Masukkan panjang jari-jari: ");
        Lingkaran lingkaran = new Lingkaran(jari2);
        System.out.println("Keliling Lingkaran = πx2xr");
        System.out.println("Keliling Lingkaran = 3.14x2x"+lingkaran.getJari2());
        System.out.println("Keliling Lingkaran = "+lingkaran.resultArea());
    }

    public void showTrapesiumArea(){
        double alas = InputFunction.getDoubleInput("Masukkan alas: ");
        double atas = InputFunction.getDoubleInput("Masukkan sisi atas: ");
        double tinggi = InputFunction.getDoubleInput("Masukkan tinggi: ");

        Trapesium trapesium = new Trapesium();
        trapesium.setAlas(alas);
        trapesium.setAtas(atas);
        trapesium.setTinggi(tinggi);

        System.out.println("Luas Trapesium = (alas+atas)xtinggi/2");
        System.out.println("Luas Trapesium = ("+trapesium.getAlas()+"+"+trapesium.getAtas()+")x"+trapesium.getTinggi()+"/2");
        System.out.println("Luas Trapesium = "+trapesium.resultArea());
    }

    public void showTrapesiumCircumference(){
        double alas = InputFunction.getDoubleInput("Masukkan alas: ");
        double atas = InputFunction.getDoubleInput("Masukkan sisi atas: ");
        double kiri = InputFunction.getDoubleInput("Masukkan sisi kiri: ");
        double kanan = InputFunction.getDoubleInput("Masukkan sisi kanan: ");

        Trapesium trapesium = new Trapesium();
        trapesium.setAlas(alas);
        trapesium.setAtas(atas);
        trapesium.setKiri(kiri);
        trapesium.setKanan(kanan);

        System.out.println("Keliling Trapesium = alas+atas+kiri+kanan");
        System.out.println("Keliling Trapesium = "+trapesium.getAlas()+"+"+trapesium.getAtas()+"+"+trapesium.getKiri()+"+"+trapesium.getKanan());
        System.out.println("Keliling Trapesium = "+trapesium.resultCircumference());
    }

    public void showSegitigaArea(){
        double alas = InputFunction.getDoubleInput("Masukkan alas: ");
        double tinggi = InputFunction.getDoubleInput("Masukkan tinggi: ");

        Segitiga segitiga = new Segitiga(alas, tinggi);

        System.out.println("Luas Segitiga = alasxtinggi/2");
        System.out.println("Luas Segitiga = "+segitiga.getAlas()+"x"+segitiga.getTinggi()+"/2");
        System.out.println("Luas Segitiga = "+segitiga.resultArea());

    }

    public void showSegitigaCircumference(){
        double alas = InputFunction.getDoubleInput("Masukkan alas: ");
        double tinggi = InputFunction.getDoubleInput("Masukkan tinggi: ");
        double kiri = InputFunction.getDoubleInput("Masukkan sisi kiri: ");
        double kanan = InputFunction.getDoubleInput("Masukkan sisi kanan: ");

        Segitiga segitiga = new Segitiga(alas, tinggi, kiri, kanan);

        System.out.println("Keliling Segitiga = alas+atas+kiri+kanan");
        System.out.println("Keliling Segitiga = "+segitiga.getAlas()+"+"+segitiga.getTinggi()+"+"+segitiga.getKiri()+"+"+segitiga.getKanan());
        System.out.println("Keliling Segitiga = "+segitiga.resultCircumference());
    }
}
