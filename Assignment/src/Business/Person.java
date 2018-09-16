/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

public class Person {
  Classdemographic classdemo = new Classdemographic();
  ClassAddress classadd = new ClassAddress();
  Classsaving classsave = new Classsaving();
  Classchecking classcheck = new Classchecking();
  Classlicence classlis = new Classlicence();
  Classmedical classmedi = new Classmedical();

    public void setClassadd(ClassAddress classadd) {
        this.classadd = classadd;
    }

    public void setClasssave(Classsaving classsave) {
        this.classsave = classsave;
    }

    public void setClasscheck(Classchecking classcheck) {
        this.classcheck = classcheck;
    }

    public void setClasslis(Classlicence classlis) {
        this.classlis = classlis;
    }

    public void setClassmedi(Classmedical classmedi) {
        this.classmedi = classmedi;
    }

    public ClassAddress getClassadd() {
        return classadd;
    }

    public Classsaving getClasssave() {
        return classsave;
    }

    public Classchecking getClasscheck() {
        return classcheck;
    }

    public Classlicence getClasslis() {
        return classlis;
    }

    public Classmedical getClassmedi() {
        return classmedi;
    }
  
    public Classdemographic getClassdemo() {
        return classdemo;
    }

    public void setClassdemo(Classdemographic classdemo) {
        this.classdemo = classdemo;
    }

    

    
}

  

   
    

