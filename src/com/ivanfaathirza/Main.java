package com.ivanfaathirza;

/**
 *
 * @author
 * NAMA     : Ivan Faathirza
 * KELAS    : IF1
 * NIM      : 10119003
 * Deskripsi Program: menampilkan perusahaan handphone menggunakan konsep inheritance dan polymorphism
 */

public class Main {

    public static void main(String[] args) {
        Android android = new Android("Samsung", "Android", "grand", 3000000);
        android.setKeyStore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : ".concat(android.getKeyStore()).concat("\n"));

        BlackBerry blackBerry = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        blackBerry.setPinBB("BHS249");
        blackBerry.displayProduct();
        System.out.println("PIN : ".concat(blackBerry.getPinBB()).concat("\n"));

        WindowsPhone windowsPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        windowsPhone.setWpKeyStore("UUUQIJWORJ");
        windowsPhone.displayProduct();
        System.out.println("Wp Key Store : ".concat(windowsPhone.getWpKeyStore()));
    }
}
