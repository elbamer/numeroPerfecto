
package numeroperfecto;


public class NumeroPerfecto {

   
    static boolean validar(int n)         {
        int sumatoria=0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
            sumatoria=sumatoria+i;
            }
        }
        if(sumatoria==n){
            return true;
        }
        return false;
        
    }
    
    public static void main (String [] args ) {
        System.out.println("digite numero");
        int numero = new java.util.Scanner(System.in) .nextInt();
        if(validar(numero)==true)
            System.out.println("el numero es perfecto");
        else
            System.out.println("no es perfecto");
    }
    
}
