/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus1;

/**
 *
 * @author ahmad al fajri
 */
public class Makanan {

    private String namaMakanan;
    private double hargaMakanan;
    private int stok;

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }

    public int getStok() {
        return stok;
    }

    public Makanan(String namaMakanan, double hargaMakanan, int stok) {
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.stok = stok;
    }

    public void displayMakananInfo() {
        System.out.print(namaMakanan + " (Stok: " + stok + ")\tRp. " + hargaMakanan);
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && jumlah <= stok) {
            stok -= jumlah;
            System.out.println("Stok " + namaMakanan + " dikurangi sebanyak " + jumlah);
        } else {
            System.out.println("Stok " + namaMakanan + " tidak cukup.");
        }
    }
}
