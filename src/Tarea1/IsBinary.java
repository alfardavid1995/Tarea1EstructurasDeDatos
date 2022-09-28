/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author css124646
 */
public class IsBinary {
    
    public boolean isbinary(int numeroAEvaluar, int index, boolean response ){
        String numeroAEvaluarString = numeroAEvaluar+"";
        System.out.println("numero a evaluar = " + numeroAEvaluar);
        System.out.println("index = "+ index);
        System.out.println("numero evaluado = " + numeroAEvaluarString.charAt(index));
        
        if ((numeroAEvaluarString.charAt(index)=='1'||numeroAEvaluarString.charAt(index)=='0')&& index<numeroAEvaluarString.length() && response){
            response = true;
            index++;
            System.out.println("llegamos aca");
            if (index==numeroAEvaluarString.length()){
               return response;
            }
            return isbinary(numeroAEvaluar, index, response);
            
        }else{
            return response = false;
        }
    }
    
}
