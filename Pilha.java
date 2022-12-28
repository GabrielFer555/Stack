/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilha;

/**
 *
 * @author Pichau
 */
public class Pilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pill p = new Pill(3);
        
        p.add("Um item");
        p.add("Dois itens");
        p.add("Três itens");
        
        p.print();
        p.remove();
        p.print();
    }
    
}
