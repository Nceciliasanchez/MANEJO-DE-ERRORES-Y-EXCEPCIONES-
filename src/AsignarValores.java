
package suma;

import java.util.Scanner;

class suma {

    public static void main(String[] args) {
        
        int c=0, d=0, e=0 ,promedio ;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introdusca tres valores:");
        
        c = s.nextInt();
        
        d = s.nextInt();
        
        e = s.nextInt();
        promedio= ( c+d+e)/3;
        System.out.println("El promedio total es:"+promedio);
   }
    
}
    

