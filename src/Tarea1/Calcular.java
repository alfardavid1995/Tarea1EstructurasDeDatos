package Tarea1;

public class Calcular {
    public double calcExponencial(int n, int x){
        double result = 0;
        for(int i=0; i<n; i++){
            result = result + (Math.pow(x,i) / factorial(i));
        }
        return result;
    }
    
    
    public double factorial(int num){
        double result = 1;
        for(int i=1; i<=num; i++){
            result=result*i;
        }
        return result;
    }
}
