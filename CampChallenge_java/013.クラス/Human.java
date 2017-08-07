/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author horiguchikentarou
 */
public class Human {
    
    public String name = "";
    public int age = 0;
    
    public void Human(String n, int a) {
        
        this.name = n;
        this.age = a;
    }
    
    
    public void setHuman(String n, int a){
        
        System.out.println(n);
	System.out.println(a);
    }

    public static void main(String[] args) {
        
        Human hito = new Human();
        
        hito.age = 40;
        hito.setHuman("添田亮司", 34);
    }
}

class Human_2 extends Human {
    
    public void clearHuman() {
        
        name = "";
        
        String s = String.valueOf(this.age);
        s ="";
    }
}    

