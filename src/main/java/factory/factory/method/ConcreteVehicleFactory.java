/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.factory.method;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ConcreteVehicleFactory extends VehicleFactory {
    @Override
    public IFactory getVehicle(String vehicle) {
        switch (vehicle) {
            case "Scooter":
                return new Scooter();
            case "Bike":
                return new Bike();
            default:
                throw new RuntimeException("Vehicle " + vehicle + " cannot be created");
        }
    }
}

