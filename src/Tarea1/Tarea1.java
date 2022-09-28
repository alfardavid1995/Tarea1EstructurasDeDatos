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
        
               // Given Number N
        int N =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para determinar si es binario"));

        // Function Call
        IsBinary comprobarSiEsBinario = new IsBinary();
        boolean resultado=comprobarSiEsBinario.isbinary(N, 0, true);
        JOptionPane.showMessageDialog(null, "el resultado es: " + resultado );
        
        
        

    }
}
    

