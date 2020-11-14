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
                
        matakuliah ti= new Teknologi_Informasi();
        matakuliah si= new Sistem_Informasi();
        matakuliah ilkom= new Ilmu_Komputer();
        matakuliah tekpen= new Teknologi_Pendidikan();
        semestertemplate sm = new semestertemplate();
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Menu Prodi");
        System.out.println("1.Teknologi Informasi");
        System.out.println("2.Sistem Informasi");
        System.out.println("3.Ilmu Komputer");
        System.out.println("4.Pendidikan Teknologi");
        int a;
        int b;
        a=scan.nextInt();
        if(a==1){
            System.out.println("PRODI TEKNOLOGI INFORMASI");
            sm.start();
                
                b=scan.nextInt();
                if(b==1){
        Command command= new semester_1(ti);
        command.execute();
                }else if(b==2){
            Command command= new semester_2(ti);
        command.execute();
        }else if(b==3){
            Command command= new semester_3(ti);
        command.execute();
        }else if(b==4){
            Command command= new semester_4(ti);
        command.execute();
        }else if(b==5){
            Command command= new semester_5(ti);
        command.execute();
        }else if(b==6){
            Command command= new semester_6(ti);
        command.execute();
        }else if(b==7){
            Command command= new semester_7(ti);
        command.execute();
        }else if(b==8){
            Command command= new semester_8(ti);
        command.execute();
        }
        }else if(a==2){
              System.out.println("PRODI SISTEM INFORMASI");
           sm.start();
                b=scan.nextInt();
                           if(b==1){
        Command command= new semester_1(si);
        command.execute();
                }else if(b==2){
            Command command= new semester_2(si);
        command.execute();
        }else if(b==3){
            Command command= new semester_3(si);
        command.execute();
        }else if(b==4){
            Command command= new semester_4(si);
        command.execute();
        }else if(b==5){
            Command command= new semester_5(si);
        command.execute();
        }else if(b==6){
            Command command= new semester_6(si);
        command.execute();
        }else if(b==7){
            Command command= new semester_7(si);
        command.execute();
        }else if(b==8){
            Command command= new semester_8(si);
        command.execute();
        }
            
    }else if(a==3){
        System.out.println("PRODI Ilmu Komputer");
            sm.start();
                b=scan.nextInt();
                           if(b==1){
        Command command= new semester_1(ilkom);
        command.execute();
                }else if(b==2){
            Command command= new semester_2(ilkom);
        command.execute();
        }else if(b==3){
            Command command= new semester_3(ilkom);
        command.execute();
        }else if(b==4){
            Command command= new semester_4(ilkom);
        command.execute();
        }else if(b==5){
            Command command= new semester_5(ilkom);
        command.execute();
        }else if(b==6){
            Command command= new semester_6(ilkom);
        command.execute();
        }else if(b==7){
            Command command= new semester_7(ilkom);
        command.execute();
        }else if(b==8){
            Command command= new semester_8(ilkom);
        command.execute();
        }
    }else if(a==4){
        System.out.println("PRODI SISTEM Teknologi Pendidikan");
           sm.start();
                b=scan.nextInt();
                           if(b==1){
        Command command= new semester_1(si);
        command.execute();
                }else if(b==2){
            Command command= new semester_2(tekpen);
        command.execute();
        }else if(b==3){
            Command command= new semester_3(tekpen);
        command.execute();
        }else if(b==4){
            Command command= new semester_4(tekpen);
        command.execute();
        }else if(b==5){
            Command command= new semester_5(tekpen);
        command.execute();
        }else if(b==6){
            Command command= new semester_6(tekpen);
        command.execute();
        }else if(b==7){
            Command command= new semester_7(tekpen);
        command.execute();
        }else if(b==8){
            Command command= new semester_8(tekpen);
        command.execute();
        }
                           
    }
            }
        }

    }
}
