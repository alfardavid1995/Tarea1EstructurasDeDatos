/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea1;

import javax.swing.JOptionPane;

/**
 *
 * @author css124646
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        suma s = new suma();
        Eliminar e = new Eliminar();
        
        //elimina vocales
        String cad = JOptionPane.showInputDialog("Digite una frase");
        char[] array = cad.toCharArray();
        array = e.sacarConsonantes(0, array);
        String string = String.valueOf(array);
        System.out.println(string);
        
        //suma de numeros 1 al N
        int num;
        do{
           num =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        }while(num<=0);
        System.out.println("Suma desde 1 hasta " + num + " = " + s.suma1N(num));
        
        //numero binario
               // Given Number N
        int N =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para determinar si es binario"));

        // Function Call
        IsBinary comprobarSiEsBinario = new IsBinary();
        boolean resultado=comprobarSiEsBinario.isbinary(N, 0, true);
        JOptionPane.showMessageDialog(null, "el resultado es: " + resultado );
        
        
        

    }
}
    

