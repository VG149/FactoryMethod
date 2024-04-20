/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.factory.method;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Scooter implements IFactory {
    public void miles(int miles) {
        System.out.println("dirija a Scooter:" + miles + " km");
    }

    @Override
    public void cor(String cor) {
         System.out.println("cor da Scooter: " + cor); //To change body of generated methods, choose Tools | Templates.
   }

    @Override
    public void tipo(String tipo) {
        System.out.println("Marca da Scooter: " + tipo); //To change body of generated methods, choose Tools | Templates.
     }

    @Override
    public void id(int id) {
    System.out.println("numero da SCooter: " + id); //To change body of generated methods, choose Tools | Templates.
    }
}
