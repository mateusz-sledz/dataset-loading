package fr.epita.titanic.statistics;

import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.services.PassengerCSVReader;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException{

        PassengerCSVReader PassengerReader = new PassengerCSVReader();
        System.out.println("Choose dataset for statistics:");
        System.out.println("1. Train dataset\n2. Test dataset");
        System.out.println("Type 1 or 2: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        File file;
        if(choice.equals("1")){
            file = new File("./titanic-training/train.csv");
        }
        else if(choice.equals("2")) {
            file = new File("./titanic-training/test.csv");
        }
        else {
            throw new IOException("Choice invalid");
        }

        List<Passenger> passengers = PassengerReader.read(file);

        Calculations calculations = new Calculations(passengers);
        System.out.println(calculations.averageAge());
        System.out.println(calculations.sexDistribution());
    }
}
