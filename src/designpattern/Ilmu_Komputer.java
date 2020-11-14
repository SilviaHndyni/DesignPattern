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
public class Ilmu_Komputer implements matakuliah{

    @Override
    public void semester_1() {
         System.out.println("1.AGAMA\n"+
                "2.B.indo\n"
                +"3.ISBD\n"+
                "4.MTK dasar\n"+
                "5.Fisika\n"
                +"6.Algoritma Pemrograman dasar\n"+
                "7.PSK\n");}

    @Override
    public void semester_2() {
         System.out.println("1.PKN\n"+
                "2.IKD\n"
                +"3.B.INGGRIS 1\n"+
                "4.Kalulus 1\n"+
                "5.Algorotma pemrograman\n "
                +"6.Logika MTK\n"+
                "7.Organisasi Komputer\n");}

    @Override
    public void semester_3() {
        System.out.println("1.Kalkulus II\n"+
                "2.Aljabar Linier dan Matriks\n"
                +"3.Sistem Informasi\n"+
                "4.Pemrograman Visual\n"+
                "5.Struktur data\n"
                +"6.Konsep Hardware\n"+
                "7.B.inggris II\n");}

    @Override
    public void semester_4() {
         System.out.println("1.Mtk distrit\n"+
                "2.Sistem digital\n"
                +"3.Statistika\n"+
                "4.Sistem Operasi\n"+
                "5.Basis data\n"
                +"6.Jaringan Komputer\n");}
        

    @Override
    public void semester_5() {
         System.out.println("1.Metode Numerik\n"+
                "2.PBO\n"
                +"3.Keamanan Komputer\n"+
                "4.PKB\n"+
                "5.Teori Bahasa dan otamata\n"
                +"6.Komputer dan Masyarakat\n"+
                 "7.KWU\n");}

    @Override
    public void semester_6() {
       System.out.println("1.RPL\n"+
                "2.Metpen\n"
                +"3.IMK\n"+
                "4.KKN\n"+
                "5.APS\n"
                );}

    @Override
    public void semester_7() {
        System.out.println("1.MPTI\n"+
                "2.KP\n"
                +"3.Etika Profesi\n");}

    @Override
    public void semester_8() {
        System.out.println("Skripsi\n");
     }

   
}
