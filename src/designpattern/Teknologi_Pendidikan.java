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
public class Teknologi_Pendidikan implements matakuliah{

    @Override
    public void semester_1() {
       System.out.println("1.AGAMA\n"+
                "2.B.indo\n"
                +"3.Ilmu Alamiah dasar\n"+
                "4.Pancasia\n"+
                "5.Pengantar kurikulum\n"
                +"6.pengantar media pembelajaran\n"+
                "7.PTP\n"+
               "8.Pengantar pendidikan\n");}

    @Override
    public void semester_2() {
        System.out.println("1.PKN\n"+
                "2.b.ing\n"
                +"3.PPD\n"+
                "4.KP\n"+
                "5.DG\n"
                +"6.MF\n"+
                "7.PP\n"+
                "8.BnP\n");}

    @Override
    public void semester_3() {
        System.out.println("1.eval p\n"+
                "2.KMP\n"
                +"3.SIM\n"+
                "4.PTMTG\n"+
                "5.PP\n"
                +"6.PNMP\n"+
                "7.PBK\n"
                +"8.DI\n"
                +"9.SP\n");}

    @Override
    public void semester_4() {
    System.out.println("1.PTP\n"+
                "2.FP\n"
                +"3.DPPDP\n"+
                "4.PBA\n"+
                "5.DDITP\n"
                +"6.MPDT\n"+
                "7.MAR\n"+
            "8.EV\n"+
            "9.PSDM\n"+
            "10.PK\n");}

    @Override
    public void semester_5() {
        System.out.println("1.MSB\n"
                +"3.MP\n"+
                "4.MTDV\n"+
                "5.MK\n"
                +"6.E-learning\n"+
                "7.PTDJJ\n"+
            "8.AKP\n"+
            "9.MMT\n"+
            "10.AK\n");}

    @Override
    public void semester_6() {
      System.out.println("1.BPKI\n"+
                "2.MPP\n"
                +"3.KTP\n"+
                "4.PWP\n"+
                "5.POD\n"
                +"6.PTP\n"+
                "7.MK\n"+
            "8.BM\n"+
            "9.PSDM\n"+
            "10.BK\n");}

    @Override
    public void semester_7() {
      System.out.println("1.PTP\n"+
                "2.PPL\n"
               +"MPPTP\n");}

    @Override
    public void semester_8() {
    System.out.println("skripsi\n");}

  
}
