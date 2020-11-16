/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Command_Pattern;

/**
 *
 * @author ELDI
 */
public class semester_7 implements Command{
       private matakuliah mk;
    public semester_7(matakuliah mk){
        this.mk=mk;
    }

    @Override
    public void execute() {
      this.mk.semester_7();}
    
}
