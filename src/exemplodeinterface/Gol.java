/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplodeinterface;

/**
 *
 * @author Debora Venturini
 */
public class Gol implements Automovel, ItemCaro{
    
    @Override
    public void virarEsquerda(){
        
        System.out.print("Virando a esquerda");
    }
    
    @Override
    public void acelerar(){
        System.out.println("Acelerando");
    }
    
    @Override
    public double getPreco(){
        return 150000;
    }
}
