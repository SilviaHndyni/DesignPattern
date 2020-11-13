package designpattern;

<<<<<<< HEAD
=======
/**
 *
 * @author ACER
 */

import java.util.Scanner;

>>>>>>> aea1404c056c6ecd5e0bf40f6247f494324ff586
public class DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat scanner baru
        Scanner input = new Scanner(System.in);

        System.out.println("===Data Akademik===");
        
        System.out.println("Masukkan Nama Mahasiswa : ");
        String nama = input.next();

        System.out.println("Masukkan NIM Mahasiswa : ");
        int nim = input.nextInt();

        System.out.println("Masukkan Jumlah SKS Mahasiswa : ");
        int sks = input.nextInt();

        Mahasiswa singleton = Mahasiswa.getInstance(nama, nim, sks);

        System.out.println(singleton.Nama);
        System.out.println(singleton.NIM);
        System.out.println(singleton.JmlhSKS);
    }
}
