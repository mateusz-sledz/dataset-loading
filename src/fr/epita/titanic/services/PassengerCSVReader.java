package fr.epita.titanic.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import fr.epita.titanic.datamodel.Passenger;

public class PassengerCSVReader {


     public List<Passenger> read(File file){
          List<Passenger> passengers = new ArrayList<>();
          try {
               List<String> lines = Files.readAllLines(file.toPath());
               lines.remove(0);

               String firstln = lines.get(0);
               firstln = firstln.replaceAll(",",";");
               firstln = firstln.replaceAll("; ", ", ");
               String[] splt = firstln.split(";");
               if(splt.length == 11) {  // not looking very elegant, yet quickest solution

                    for (String line : lines) {
                         line = line.replaceAll(",", ";");
                         line = line.replaceAll("; ", ", ");
                         String[] split = line.split(";");

                         //PassengerId,Pclass,Name,Sex,Age,SibSp,Parch,Ticket,Fare,Cabin,Embarked
                         Passenger instance = new Passenger();
                         instance.setPassengerId((split[0].length() == 0) ? null : Integer.parseInt(split[0]));
                         instance.setpClass((split[1].length() == 0) ? null : Integer.parseInt(split[1]));
                         instance.setName(split[2]);
                         instance.setSex(split[3]);
                         instance.setAge((split[4].length() == 0) ? null : Double.parseDouble(split[4]));
                         instance.setSibSp((split[5].length() == 0) ? null : Boolean.parseBoolean(split[5]));
                         instance.setParch((split[6].length() == 0) ? null : Integer.parseInt(split[6]));
                         instance.setTicket(split[7]);
                         instance.setFare((split[8].length() == 0) ? null : Double.parseDouble(split[8]));
                         instance.setCabin(split[9]);
                         instance.setEmbarked(split[10]);

                         passengers.add(instance);
                    }
               }
               else if(splt.length == 12){
                    for (String line : lines) {
                         line = line.replaceAll(",", ";");
                         line = line.replaceAll("; ", ", ");
                         String[] split = line.split(";");

                         //PassengerId,Survived,Pclass,Name,Sex,Age,SibSp,Parch,Ticket,Fare,Cabin,Embarked
                         Passenger instance = new Passenger();
                         instance.setPassengerId((split[0].length() == 0) ? null : Integer.parseInt(split[0]));
                         instance.setSurvived(Boolean.parseBoolean(split[1]));
                         instance.setpClass((split[2].length() == 0) ? null : Integer.parseInt(split[2]));
                         instance.setName(split[3]);
                         instance.setSex(split[4]);
                         instance.setAge((split[5].length() == 0) ? null : Double.parseDouble(split[5]));
                         instance.setSibSp((split[6].length() == 0) ? null : Boolean.parseBoolean(split[6]));
                         instance.setParch((split[7].length() == 0) ? null : Integer.parseInt(split[7]));
                         instance.setTicket(split[8]);
                         instance.setFare((split[9].length() == 0) ? null : Double.parseDouble(split[9]));
                         instance.setCabin(split[10]);
                         try{
                              instance.setEmbarked(split[11]);
                         }
                         catch(Exception e){
                              instance.setEmbarked(null);
                         }

                         passengers.add(instance);
                    }
               }

          } catch (IOException e) {
               e.printStackTrace();
          }


          return passengers;
     }
}
