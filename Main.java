package com.company;

abstract class TranspotCompany{
    public abstract IDeliveryMethod createTransport();
}
class SeaFactory extends TranspotCompany{
    public Boat createTransport() {
        return new Boat();
    }
}
class RoadFactory extends TranspotCompany{
    public Car createTransport() {
        return new Car();
    }
}
class AirFactory extends TranspotCompany{
    public Plane createTransport() {
        return new Plane();
    }
}
abstract class IDeliveryMethod{
    public abstract void getInfo();
}
class Boat extends IDeliveryMethod{
    @Override
    public void getInfo() {
        System.out.println("Судно");
    }
}
class Plane extends IDeliveryMethod{
    @Override
    public void getInfo() {
        System.out.println("Самолет");
    }
}
class Car extends IDeliveryMethod {
    @Override
    public void getInfo() {
        System.out.println("Грузовик");
    }
}
public class Main {

    public static void main(String[] args) {
        TranspotCompany plane = new AirFactory();
        TranspotCompany boat = new SeaFactory();
        TranspotCompany car = new RoadFactory();
        IDeliveryMethod samolet = plane.createTransport();
        IDeliveryMethod sydno = boat.createTransport();
        IDeliveryMethod gruzovik = car.createTransport();
        samolet.getInfo();
        sydno.getInfo();
        gruzovik.getInfo();
    }
}