package designpattern.TemplateMethod_Pattern;

public class Guru extends TemplateMethod{
    @Override
    public String getNama() {
        return "Guru :";
    }

    @Override
    public void perbedaan() {
        System.out.println("1. Tugas utama guru adalah mendidik, mengajar, membimbing, mengarahkan, melatih, menilai, dan mengevaluasi peserta didik");
        System.out.println("2. Wajib memiliki kualifikasi pendidikan minimum sarjana (S1) atau diplomat empat (D-IV)");
    }
}
