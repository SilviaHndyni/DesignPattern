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
public class semester_6 implements Command{
    private matakuliah mk;
    public semester_6(matakuliah mk){
        this.mk=mk;
    }

    @Override
    public void execute() {
       this.mk.semester_6();}
}
