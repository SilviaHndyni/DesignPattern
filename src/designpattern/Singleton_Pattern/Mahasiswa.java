/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Singleton_Pattern;

/**
 *
 * @author Siti Rohmah
 */
public final class Mahasiswa {
    //deklarasi variabel
    private static Mahasiswa instance; // mendeklarasikan instance
    public String semester, dospem;
    
    // mengambil data
    private Mahasiswa(String semester, String dospem) {
      this.semester = semester;
      this.dospem = dospem;
    }

    public static Mahasiswa getInstance(String semester, String dospem) {
        if (instance == null) {
            instance = new Mahasiswa(semester, dospem);
        }
        return instance;
    }
}
