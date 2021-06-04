
package polymorphisme;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class EmpatSisi {
    
    int sisi,panjang,lebar,luas,keliling;
    
    public void Mengmasuk() {
        
        final Scanner input = new Scanner(System.in);
        
        System.out.print("sisi : ");
        
        this.sisi = input.nextInt();
        this.luas = this.sisi * this.sisi;
        this.keliling = this.sisi * 4;
    }
    
    public void Mengkeluar() {
        
        System.out.println("*************************");
        
        System.out.println("sisi    : " + this.sisi);
        System.out.println("Luas    :" + this.luas);
        System.out.println("Keliling:" + this.keliling);
    }
}
