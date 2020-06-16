package livenoite1606des6q3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class LiveNoite1606Des6Q3 {

    /**
     * Escrever um algoritmo que lê 10 valores, um de cada vez, e conta quantos
     * deles estão no intervalo [10,20] e quantos deles estão fora do intervalo,
     * escrevendo estas informações.
     */
    public static void main(String[] args) {
        int cont, num, contDentro, contFora;
        contDentro = 0; contFora = 0; cont = 1;
        
        while(cont <= 10) {// for(cont=1;cont<=10;cont++){}
            num = Integer.parseInt(JOptionPane.showInputDialog("Informe um nº:"));
            if (num >= 10 && num <= 20) {
                contDentro++;
            } else {
                contFora++;
            }//fim do if
            cont++;
        }//fim do loop
        
        JOptionPane.showMessageDialog(null, "Existe " + contDentro + " numero "
                    + " no intervalo de 10 a 20\nExiste " + contFora 
                + " numero fora do intervalo de 10 a 20");
        
    }
}
