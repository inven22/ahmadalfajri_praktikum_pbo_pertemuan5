/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus1;

/**
 *
 * @author ahmad al fajri
 */
public class Restoran {

    private Makanan[] food;
    private static byte id = 0;

    public static byte getId() {
        return id;
    }

    public static void setId(byte id) {
        Restoran.id = id;
    }

    public Restoran() {
        food = new Makanan[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.food[id] = new Makanan(nama, harga, stok);
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                System.out.print(i + 1 + " ");
                this.food[i].displayMakananInfo();
                System.out.println("");
            }
        }
    }

    public void pemesanan(int idMakanan, int jumlah) {
        if (idMakanan >= 1 && idMakanan <= this.food.length) {
            for (int i = 0; i < this.food.length; i++) {
                if (i == idMakanan - 1) {
                    this.food[i].kurangiStok(jumlah);
                    break; // Menghentikan iterasi setelah item ditemukan
                }
            }
        } else {
            System.out.println("ID makanan tidak valid.");
        }
    }

    public boolean isOutOfStock(int id) {
        if (food[id].getStok() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void nextId() {
        id++;
        setId(id);
    }
}
