public class Truck {
    private String truckID;
    private double odemeter;
    private double mpg;
    private double fuel;
    private static final double CAPACITY=20.0;
    private static double totalFuel=0;

    public Truck (String n){
        truckID=n;
    }

    public Truck (String name,double o,double m, double f){
        truckID=name;
        odemeter=o;
        mpg=m;
        fuel=f;
    }
    public String getTruckID(String t){
        return truckID;
    }

    public double getOdometer(){
        return odemeter;
    }
    public double getMpg(){
        return mpg;
    }
    public double getFuel(){
        return fuel;
    }
    public void setMpg(double f){
        mpg=f;
    }
    public boolean enoughFuel(double designatedmiles){
        if (designatedmiles<=mpg*fuel){
            return true;
        }
        else
            return false;
    }
    public String drive(double designatedmiles){
        double usedfuel=0.0;
        if (enoughFuel(designatedmiles)){
            odemeter+=designatedmiles;
            usedfuel=designatedmiles/mpg;
            fuel-=usedfuel;
            return "Success";
        }
        else
            return "Truck "+truckID+" does not have enough fuel to drive "+designatedmiles+" miles.";
    }

    public void fill(){
        double neededfuel = CAPACITY-fuel;
        fuel+=CAPACITY-fuel;
        totalFuel+=neededfuel;

    }
    public String fill(double newfuel){
        if (newfuel>CAPACITY-fuel){
            return "Truck "+truckID+": Gallons exceeds tank capacity";
        }
        else
        return "Success";
    }
    public static double getTotalFuel(){
        return totalFuel;
    }
    public String toString(){
        return "Truck: "+truckID+"\nOdometer: "+odemeter+"\nMiles Per Gallon: "
                +mpg+"\nFuel: "+fuel;
    }
}
