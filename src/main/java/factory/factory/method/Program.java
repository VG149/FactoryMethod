/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.factory.method;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Program {
    public static void main(String[] args) {
        VehicleFactory factory = new ConcreteVehicleFactory();

        IFactory scooter = factory.getVehicle("Scooter");
        scooter.Drive(10);

        IFactory bike = factory.getVehicle("Bike");
        bike.Drive(20);
    }
}

