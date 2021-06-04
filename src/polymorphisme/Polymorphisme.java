
package polymorphisme;

/**
 *
 * @author MOKLET-2
 */
public class Polymorphisme {


    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("persegi");
         
        final EmpatSisi degrees = new EmpatSisi();
        degrees.Mengmasuk();
        degrees.Mengkeluar();
        System.out.println("persegi panjang");
        
        
        final EmpatSudut who = new EmpatSudut();
        who.Mengmasuk();
        who.Mengkeluar();
        
    }
    
}
    
