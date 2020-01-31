public class Truck {
    private String truckID;
    private double odemeter;
    private double mpg;
    private double fuel;
    private static final double CAPACITY=20.0;
    private static double totalFuel=0;

    public Truck (){
        truckID="";
        odemeter=0.0;
        mpg=0.0;
        fuel=0.0;
    }
    public String getTruckID(String t){
        return truckID;
    }
    public double getOdemeter(double o){
        return odemeter;
    }
    public double getmpg(double m){
        return mpg;
    }
    public double getfuel(double f){
        return fuel;
    }
    public void setmpg(double f){
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
        if (enoughFuel(designatedmiles)){
            designatedmiles=mpg*fuel-designatedmiles;


        }
    }
}
