/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author anggit rief irfandy
 */
public class TumpukanApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println();
        tumpukan.push(100);
        tumpukan.baca();
        System.out.println();
        tumpukan.pop();
        tumpukan.baca();
        System.out.println();
        tumpukan.push(60);
        tumpukan.baca();
        System.out.println();
        tumpukan.push(80);
        tumpukan.baca();
        System.out.println();
        tumpukan.pop();
        tumpukan.baca();
        System.out.println();
        long nilai3 = tumpukan.peek();
        System.out.println("nilaiTOP= "+nilai3);
    }
    
}
