import java.util.Scanner;

//class to contain methods to switch ft and lb to m and kg
class imperialToMetric{
    
    
    public void feetToMeter(double feet){
        double newMeter = feet * 0.304; 
        System.out.println(feet + " feet is approximately " + newMeter + " meters.");
    }
    public void lbToKilogram(double lb){
        double newKilogram = lb * 0.454;
        System.out.println(lb + " pounds is approximately " + newKilogram + " kilograms.");
    }
} 

class metricToImperial{
    
    public void meterToFeet(double meter){
        double newFoot = meter * 3.28;
        System.out.println(meter + " meters is approximaely " + newFoot + " feet.");
    }
    public void kilogramToLb(double kilogram){
        double newLb = kilogram * 2.2;
        System.out.println(kilogram + " kilograms is approximaely " + newLb + " pounds.");
    }
}



class Main{
    public static void main(String[] args){
        int exit = 0; 
        while (exit != -1){
            Scanner scnr = new Scanner(System.in);
            System.out.print("To convert imperial to metric press 1. To convert metric to imperial press 2. To exit program press -1: ");
            exit = scnr.nextInt();
            
            //decision to choose whether going to metric or imperial

            if (exit == 1){
                //Scanner secondScan = new Scanner(System.in);
                System.out.print("Press 1 to convert feet to meters, press 2 to convert pounds to kilograms: ");
                 int imperialConvert = scnr.nextInt();
                 //secondScan.close();

                 //further decision to see if changning weight or length

                if (imperialConvert == 1){
                    imperialToMetric feetToMeter = new imperialToMetric();
                    //Scanner itf = new Scanner(System.in);
                    System.out.print("Enter feet to be converted: ");
                    double meterConvert = scnr.nextDouble();
                    
                    feetToMeter.feetToMeter(meterConvert);

                }
                else{
                imperialToMetric lbToKilogram = new imperialToMetric();
                System.out.print("Enter pounds to be converted:");
                double poundConvert = scnr.nextDouble();
                lbToKilogram.lbToKilogram(poundConvert); 
                }
            }
            
            else if (exit == 2){
                System.out.print("press 1 to convert meters to feet, press 2 to convert kilograms to pounds: ");
                int metricConvert = scnr.nextInt();

                if (metricConvert == 1){
                    metricToImperial meterToFeet = new metricToImperial();
                    System.out.print("Enter meters to be converted: ");
                    double meterConvert = scnr.nextDouble();
                    meterToFeet.meterToFeet(meterConvert);
                }
                else{
                    metricToImperial kilogramToLb = new metricToImperial();
                    System.out.print("Enter kilograms to be converted: ");
                    double kilogramConvert = scnr.nextDouble();
                    kilogramToLb.kilogramToLb(kilogramConvert);
                }
            }

        }
    }
    
}