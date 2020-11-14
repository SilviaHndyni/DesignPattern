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
public class Sistem_Informasi implements matakuliah{

    @Override
    public void semester_1() {
          System.out.println("1.Kalkulus\n"+
                "2.Fisika\n"
                +"3.kimia\n"+
                "4.biologi\n"+
                "5.PSI\n"
                +"6.AP\n"
                ); }

    @Override
    public void semester_2() {
    System.out.println("1.MTP\n"+
                "2.SD\n"
                +"3.agama\n"+
                "4.basis data\n"+
                "5.SO"
                +"6.FPB\n"
                ); }

    @Override
    public void semester_3() {
       System.out.println("1.B.ing\n"+
                "2.mtk\n"
                +"3.SI\n"+
                "4.PBO\n"+
                "5.APS\n"
                +"6.JK\n"
                ); }

    @Override
    public void semester_4() {
        System.out.println("1.KWN\n"+
                "2.PaNCASILA\n"
                +"3.PM\n"+
                "4.PW\n"+
                "5.PW\n"
                +"6.KMO\n"
                ); }

    @Override
    public void semester_5() {
        System.out.println("1.FI\n"+
                "2.EP\n"
                +"3.AVD\n"+
                "4.PM\n"+
                "5.PAP\n"
                +"6.KSI\n"
                ); }

    @Override
    public void semester_6() {
       System.out.println("1.agama\n"+
                "2.PPL\n"
                +"3.TKTI\n"+
                "4.Metpen\n"+
                "5.PKL\n"
                ); }

    @Override
    public void semester_7() {
     System.out.println("1.KwuBSI\n"+
                "2.KI\n"
                ); }

    @Override
    public void semester_8() {
         System.out.println("TA\n"
                
                ); 
    }
}
