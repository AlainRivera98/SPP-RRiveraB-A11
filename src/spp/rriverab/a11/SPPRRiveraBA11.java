//Nombre: Roberto Alain Rivera Bravo
//Matrícula: A01411516
//Carrera: IMT11

package spp.rriverab.a11;
import javax.swing.*;

public class SPPRRiveraBA11 {


    public static void main(String[] args) {
        Object[] entradas = {"Opción 1", "Opción 2", "Opción 3"};
        
        Object input1 = JOptionPane.showInputDialog(null, "Introduce una opción", "Input 1", JOptionPane.PLAIN_MESSAGE, null, entradas,entradas[1]);         
        
        String input2 = JOptionPane.showInputDialog(null, "Introduce una cadena", "Input 2", JOptionPane.PLAIN_MESSAGE);
        
        
        int option = JOptionPane.showConfirmDialog(null, "¿Confirmas esta opcion?");
        if(option == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Has capturado " +input1, "Message", JOptionPane.PLAIN_MESSAGE);
        }else if(option == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Has seleccionado no", "", JOptionPane.WARNING_MESSAGE);
        } 
        
        JOptionPane.showMessageDialog(null, "Has capturado " +input2, "Message", JOptionPane.PLAIN_MESSAGE);
        
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué opción eliges? ", "Opciones ", JOptionPane.DEFAULT_OPTION       // Tipo de opciones
        ,JOptionPane.QUESTION_MESSAGE, null, entradas, null);
 
        JOptionPane.showMessageDialog(null, "Ha escogido "+entradas[opcion]);
        
    }
    

    
}
