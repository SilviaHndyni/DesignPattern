package designpattern;

import java.util.Scanner;


public class DesignPattern {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat scanner baru
        Scanner input = new Scanner(System.in);
        int pilihan = 1;
        while(pilihan != 0){
            System.out.println("-----------Design Pattern-----------");
            System.out.println("1. Singleton Pattern");
            System.out.println("2. Template Method Pattern");
            System.out.println("3. Command Pattern");
            System.out.print("Masukkan pilihan design pattern : ");
            pilihan = input.nextInt();
            if(pilihan == 1){
                System.out.println("\n-------Singleton Pattern-------");                
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
                System.out.println();
            }
            
            else if(pilihan == 2){
                System.out.println("\n-------Template Method Pattern-------"); 
                System.out.println();
            }
            
            else if(pilihan == 3){
                System.out.println("\n-------Command Pattern-------"); 
                System.out.println();
            }
        }

    }
}
