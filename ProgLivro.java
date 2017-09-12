/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proglivro;

import javax.swing.JOptionPane;


/**
 *
 * @author marcos
 */
public class ProgLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double n1,n2,n3,maior;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
        
        ExemploSobrecarga e1 = new ExemploSobrecarga();
        
        maior = e1.calculaNumeroMaior(n1, n2);
        
        
        
        JOptionPane.showMessageDialog(null, "Maior numero digitado: " + maior);
                             
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro numero: "));
        
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Numero: "));
        
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor: "));
        
        ExemploSobrecarga e2 = new ExemploSobrecarga();
        
        maior = e2.calculaNumeroMaior(n1, n2, n3);
        
        JOptionPane.showMessageDialog(null, "Maior numero digitado " + maior);
        
       
    }
    
    
}
