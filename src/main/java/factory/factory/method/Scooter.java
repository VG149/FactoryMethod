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
    public void Drive(int miles) {
        System.out.println("Drive the Scooter: " + miles + " km");
    }
}
