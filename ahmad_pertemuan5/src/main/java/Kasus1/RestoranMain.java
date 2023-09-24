/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus1;

/**
 *
 * @author ahmad al fajri
 */
public class RestoranMain {

    public static void main(String[] args) {
        Restoran menu = new Restoran();

        menu.tambahMenuMakanan("Spaghetti", 1000, 20);
        Restoran.nextId();

        menu.tambahMenuMakanan("Dimsum", 1000, 20);
        Restoran.nextId();

        menu.tambahMenuMakanan("Starbucks", 1000, 0); // Ubah 00 menjadi 0
        Restoran.nextId();

        menu.tambahMenuMakanan("Chatime", 1000, 20);

        menu.tampilMenuMakanan();

        System.out.println();

        menu.pemesanan(4, 3);
        menu.pemesanan(2, 1);
        menu.tampilMenuMakanan();
    }
}
