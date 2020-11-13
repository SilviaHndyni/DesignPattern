/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

/**
 *
 * @author Siti Rohmah
 */
public final class Mahasiswa {
    //deklarasi variabel
    private static Mahasiswa instance; // mendeklarasikan instance
    public String Nama;
    public int NIM, JmlhSKS;
    
    // mengambil data
    private Mahasiswa(String Nama, int NIM, int JmlhSKS) {
      this.Nama = Nama;
      this.NIM = NIM;
      this.JmlhSKS = JmlhSKS;
    }

    public static Mahasiswa getInstance(String Nama, int NIM, int JmlhSKS) {
        if (instance == null) {
            instance = new Mahasiswa(Nama, NIM, JmlhSKS);
        }
        return instance;
    }
}
