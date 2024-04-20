/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.factory.method;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Bike implements IFactory {
    public void miles(int miles) {
        System.out.println("Dirija a bike: " + miles + " km");
    }

    @Override
    public void cor(String cor) {
         System.out.println("cor da Bike: " + cor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tipo(String tipo) {
        System.out.println("Tipo da Bike: " + tipo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void id(int id) {
         //To change body of generated methods, choose Tools | Templates.
    System.out.println("numero da bike: " + id); //To change body of generated methods, choose Tools | Templates.
    
    }
}



