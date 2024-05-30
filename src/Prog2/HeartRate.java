package Prog2;

import java.time.LocalDate;
import java.time.Period;

public class HeartRate {
    private static int RHR = 70;
    private static double LB = 0.5;
    private static double UB = 0.85;

    String firstname;
    String lastname;
    LocalDate dateOfDate;

    public HeartRate(String firstname, String lastname, LocalDate dateOfDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfDate = dateOfDate;
    }

    public long getAge(){
        Period peroid = Period.between(dateOfDate, LocalDate.now() );
        return peroid.getYears();
    }

    public double MHR(){
        return 220-this.getAge();
    }
    public double AHR(){
        return MHR()-RHR;
    }
    public double LBTHR(){
        return AHR()*LB+RHR;
    }
    public double UBTHR(){
        return AHR()*UB+RHR;
    }
}
