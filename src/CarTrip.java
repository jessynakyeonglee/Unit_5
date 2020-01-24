public class CarTrip {
    private double myStartOdometer;
    private double myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip(double s, double e, double t, double g){
        myStartOdometer = s;
        myEndOdometer = e;
        myTime = t;
        myGallonsUsed = g;
    }

    public CarTrip(){
        myStartOdometer = 0.0;
        myEndOdometer = 0.0;
        myTime = 0.0;
        myGallonsUsed = 0.0;
    }

    public double getMyStartOdometer(){
        return myStartOdometer;
    }

    public double getMyEndOdometer(){
        return myEndOdometer;
    }

    public double getMyTime(){
        return myTime;
    }

    public double getMyGallonsUsed(){
        return myGallonsUsed;
    }

    public void setMyStartOdometer(double myStartOdometer) {
        this.myStartOdometer = myStartOdometer;
    }

    public void setMyEndOdometer(double myEndOdometer) {
        this.myEndOdometer = myEndOdometer;
    }

    public void setMyTime(double myTime) {
        this.myTime = myTime;
    }

    public void setMyGallonsUsed(double myGallonsUsed) {
        this.myGallonsUsed = myGallonsUsed;
    }

    public double getTripDistance(){
        return myEndOdometer - myStartOdometer;
    }

    public double getAverageSpeed(){
        if (myTime == 0)
            return 0.0;
        return (myEndOdometer - myStartOdometer)/myGallonsUsed;
    }

    public double getGasMileage(){
        if (myGallonsUsed == 0)
            return 0.0;
        return (myEndOdometer-myStartOdometer)/myGallonsUsed;
    }

    public double getTotalGasPrice(double PricePerGallon){
        return PricePerGallon*myGallonsUsed;
    }

    public String toString(){
        return "Distance travelled: " + (myEndOdometer-myStartOdometer) + " miles";
    }

}

