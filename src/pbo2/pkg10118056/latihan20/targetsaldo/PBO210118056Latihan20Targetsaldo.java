/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan20.targetsaldo;

/**
 *
 * @author 
 * NAMA     : Mirrazibrahim
 * KELAS    : IF-2
 * NIM      : 10118056
 */
public class PBO210118056Latihan20Targetsaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,target,bunga;
        target=3500000;
        bunga= (int) (target*0.08);
        target=target+bunga;
        i=1;
        while(target<=6500000){
            System.out.println("saldo di bulan ke-" + i + " " +target);
            i++;
            bunga= (int) (target*0.08);
            target +=bunga;
        }
    }
    
}
