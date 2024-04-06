package view;

import util.InputFunction;
import util.MenuFunction;

public class MainMenu {

    MenuFunction menuFunction = new MenuFunction();

    public void showMainMenu() {
        while (true) {
            System.out.println("Bangun Datar   ");
            System.out.println("====================");
            System.out.println("Pilih Bangun: ");
            System.out.println("[1] Persegi");
            System.out.println("[2] Persegi Panjang");
            System.out.println("[3] Lingkaran");
            System.out.println("[4] Trapesium");
            System.out.println("[5] Segitiga");
            System.out.println("[6] Keluar");
            int pilihan = InputFunction.getIntegerInput("Pilihan: ");
            if (pilihan == 1) {
                showChildMenu("Persegi");
            } else if (pilihan == 2) {
                showChildMenu("PersegiPanjang");
            } else if (pilihan == 3) {
                showChildMenu("Lingkaran");
            } else if (pilihan == 4) {
                showChildMenu("Trapesium");
            } else if (pilihan == 5) {
                showChildMenu("Segitiga");
            } else if (pilihan == 6) {
                break;
            } else {
                System.out.println("Tidak ada menu tersebut");
            }
        }
    }

    public void showChildMenu(String bangun) {
        while (true) {
            System.out.println("Pilih Aksi");
            System.out.println("--------------");
            System.out.println("[1] Luas");
            System.out.println("[2] Keliling");
            System.out.println("[3] Kembali");
            int pilihan = InputFunction.getIntegerInput("Pilihan: ");
            if (pilihan == 1) {
                if (bangun.equalsIgnoreCase("persegi")) {
                    menuFunction.showPersegiArea();
                }else if (bangun.equalsIgnoreCase("persegipanjang")) {
                    menuFunction.showPersegiPanjangArea();
                }else if(bangun.equalsIgnoreCase("lingkaran")){
                    menuFunction.showLingkaranArea();
                }else if(bangun.equalsIgnoreCase("trapesium")){
                    menuFunction.showTrapesiumArea();
                }else if(bangun.equalsIgnoreCase("segitiga")){
                    menuFunction.showSegitigaArea();
                }
            }else if(pilihan == 2){
                if (bangun.equalsIgnoreCase("persegi")) {
                    menuFunction.showPersegiCircumference();
                }else if (bangun.equalsIgnoreCase("persegipanjang")) {
                    menuFunction.showPersegiPanjangCircumference();
                }else if(bangun.equalsIgnoreCase("lingkaran")){
                    menuFunction.showLingkaranCircumference();
                }else if(bangun.equalsIgnoreCase("trapesium")){
                    menuFunction.showTrapesiumCircumference();
                }else if(bangun.equalsIgnoreCase("segitiga")){
                    menuFunction.showSegitigaCircumference();
                }
            }else if(pilihan == 3){
                break;
            }else{
                System.out.println("Tidak ada menu tersebut");
            }
            
        }

    }
}
