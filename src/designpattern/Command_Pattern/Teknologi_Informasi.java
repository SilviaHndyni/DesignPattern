/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

/**
 *
 * @author ELDI
 */
public class Teknologi_Informasi implements matakuliah{

    @Override
    public void semester_1() {
        System.out.println("1.Logika Algoritma\n"+
                "2.kalkulus\n"
                +"3.Aljabr\n"+
                "4.Konsep Pemrograman\n"+
                "5.PTW\n"
                +"6.PTI\n"+
                "7.Pengantar Organisasi dan Arsitektur Komputer\n"+
                "8.Bahasa Indonesia\n");
    }

    @Override
    public void semester_2() {
         System.out.println("1.Basis Data\n"+
                "2.Pemrograman Berorientasi Objek\n"
                +"3.Keterampilan Berkomunikasi\n"+
                "4.Pengantar Sistem Digital\n"+
                "5.Sistem Informasi Manajemen\n"
                +"6.Ilmu Sosial Dasar dan Budaya Dasar\n"+
                "7.Struktur Data\n"+
                "8.Pancasila\n");
       }

    @Override
    public void semester_3() {
       System.out.println(
               "1.Pemrograman Visual\n"+
                "2.Jaringan Komputer dan Komunikasi Data\n"
                +"3.Bahasa Kueri Terstruktur\n"+
                "4.Metode Numerik\n"+
                "5.SStatistika\n"
                +"6.IPemrograman Web\n"+
                "7.Agama\n"+
                "8.Bahasa Inggris\n");}

    @Override
    public void semester_4() {
     System.out.println(
               "1.Kewirausahaan dan e-bisnis\n"+
                "2.Jaringan nirkabel\n"
                +"3.Anilisis dan peramcangan sistem\n"+
                "4.Riset Operasi\n"+
                "5.Sistem operasi\n"
                +"6.Interaksi manusia dan komputer\n"+
                "7.Tata kelola TI\n"+
                "8.Pendidikan kewarganegaraan\n");}

    @Override
    public void semester_5() {
          System.out.println(
               "1.RPL\n"+
                "2.DW\n"
                +"3.kecerdasan buatan\n"+
                "4.CC\n"+
                "5.Metodologi penelitian\n");
       }

    @Override
    public void semester_6() {
           System.out.println(
               "1.Sistem Penunjang Keputusan\n"+
                "2.Manajemen Proyek TI\n"
                +"3.Sistem Cerdas\n"+
                "4.Sistem Informasi Geografis\n"+
                "5.Proyek Kelompok\n");
        }

    @Override
    public void semester_7() {
       System.out.println(
               "1.Pengolahan Citra Digital\n"+
                "2.pkl\n"
                );}

    @Override
    public void semester_8() {
  System.out.println("Tugas Akhir\n");}
}
