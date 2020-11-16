package designpattern.TemplateMethod_Pattern;

public abstract class TemplateMethod {
    public final void tampil() {
        System.out.println(getNama());
        perbedaan();
    }
    
    public abstract String getNama();
    public abstract void perbedaan();
}
