package fr.epita.titanic.statistics;

import fr.epita.titanic.datamodel.Passenger;

import java.util.List;

public class Calculations {
    private final List<Passenger> passengers;


    public Calculations(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public String averageAge(){
        class SD {
            double get(double mean, int datapoints)
            {
                double sum = 0;
                for(Passenger passenger : passengers){
                    if (passenger.getAge() != null)
                        sum += Math.pow((passenger.getAge() - mean), 2);
                }
                return Math.sqrt(sum/datapoints);
            }
        }

        int i = 0;
        double average = 0;
        for(Passenger passenger : passengers){
            if (passenger.getAge() == null)
                i ++;
            else average += passenger.getAge();
        }

        average = average/(passengers.size() - i);
        double sd = new SD().get(average, passengers.size() - i);

        return "Average age: " + String.format("%.2f", average) + "\n" + "Standard deviation: " +
                String.format("%.2f", sd) ;
    }

    public String sexDistribution(){
        double males = 0;
        double females = 0;
        for(Passenger passenger : passengers){
            if(passenger.getSex().equals("male"))
                males += 1;
            else females += 1;
        }
        double all = males + females;

        return "Sex Distribution:\n" + "Females: " + String.format("%.2f", 100*females/all) + "% \n" + "Males: " +
                String.format("%.2f", 100*males/all) + " %";
    }
}
