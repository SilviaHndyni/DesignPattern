package designpattern;

public class Dosen extends TemplateMethod{
    @Override
    public String getNama() {
        return "Dosen :";
    }

    @Override
    public void perbedaan() {
        System.out.println("1. Tugas utama dosen yaitu mentransformasikan, mengembangkan, dan menyebarluaskan ilmu pengetahuan, teknologi, dan seni melalui pendidikan, penelitian, dan pengabdian kepada masyarakat");
        System.out.println("2. Wajib memiliki kualifikasi pendidikan minimum magister (S2)");    
    }
}
