package unit6;
import java.util.Scanner;
import java.util.ArrayList;

public class ParkingLotRunner{
    public static void main(String[] args){
        ArrayList<String> Parking = InputArrayList.createArrayList("parking.txt");
        ParkingLot parkinglot = new ParkingLot();
        for(String s: Parking){
            String make = s.substring(0,s.indexOf(" ")).trim();
            s = s.substring(s.indexOf(" ")).trim();
            String model = s.substring(0,s.indexOf(" ")).trim();
            s = s.substring(s.indexOf(" ")).trim();
            String color = s.substring(0,s.indexOf(" ")).trim();
            s = s.substring(s.indexOf(" ")).trim();
            String liscenceplate = s.substring(0,s.indexOf(" ")).trim();
            s = s.substring(s.indexOf(" ")).trim();
            String SPOT = s;
            Automobile a = new Automobile(make,model,color,liscenceplate);
            parkinglot.parkCar(a,SPOT);
            
        }
        Automobile b = new Automobile("Buggatti","Chiron Super Sport","RoastBeef Brown","Slayer Gang ong");
        parkinglot.removeCar("A1");
        parkinglot.parkCar(b,"A1");
        parkinglot.getEmptySpots();
        parkinglot.countCarsByMake("Toyota");
        parkinglot.findCarByLicensePlate("HHH123");
        parkinglot.isDescriptionFound("Buggatti","Chiron Super Sport","RoastBeef Brown");


    }
}