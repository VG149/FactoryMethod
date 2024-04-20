/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.factory.method;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Random;
public class Program {
    public static void main(String[] args) {
        VehicleFactory factory = new ConcreteVehicleFactory();
        int min = 1001;
        int max = 1999;
        int id_scooter = (int)Math.floor(Math.random() * (max - min + 1) + min);
        IFactory scooter = factory.getVehicle("Scooter");
        scooter.miles(10);
        scooter.cor("preta");
        scooter.tipo("Honda");
        scooter.id(id_scooter);

        int id_bike = (int)Math.floor(Math.random() * (max - min + 1) + min);
        IFactory bike = factory.getVehicle("Bike");
        bike.miles(20);
        bike.cor("azul");
        bike.tipo("Bike Eletrica");
        bike.id(id_bike);
    }
}

