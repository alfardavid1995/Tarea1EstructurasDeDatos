
package Tarea1;

public class suma {

    public static double suma1N(int n){
           if(n == 1)  
              return 1;
           else
              return n + suma1N(n-1);
    }
}
