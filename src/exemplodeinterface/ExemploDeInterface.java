/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplodeinterface;

/**
 *
 * @author Debora Venturini
 */
public class ExemploDeInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gol g1 = new Gol();
        g1.acelerar();
        g1.virarEsquerda();
        System.out.println("valor do gol: R$" + g1.getPreco());
        
        AnelDeCasamento a1 = new AnelDeCasamento();
        System.out.println("Valor do anel: R$"+ a1.getPreco());
        // TODO code application logic here
    }
    
}
