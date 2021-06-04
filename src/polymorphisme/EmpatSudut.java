
package polymorphisme;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class EmpatSudut extends EmpatSisi {
    public void Mengmasuk() {
        
        final Scanner input = new Scanner(System.in);
        System.out.print("Panjang : ");
        this.panjang = input.nextInt();
        
        System.out.print("Lebar   : ");
        this.lebar = input.nextInt();
        
        this.luas = this.panjang * this.lebar;
        this.keliling = 2 * this.panjang + 2 * this.lebar;
    }
    
    public void Mengkeluar() {
        
        System.out.println("-----==========-----");
        
        System.out.println("Panjang  : " + this.panjang);
        System.out.println("Lebar    : " + this.lebar);
        System.out.println("Luas     :" + this.luas);
        System.out.println("Keliling :" + this.keliling);
    }
}
    
