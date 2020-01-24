public class CarTripTester {
    public static void main(String[] args) {
        CarTrip carTrip = new CarTrip(250, 1000, 36.5, 475);
        System.out.println(carTrip.getAverageSpeed());
        System.out.println(carTrip.getGasMileage());
        System.out.println(carTrip.getMyEndOdometer());
        System.out.println(carTrip.getMyGallonsUsed());
        System.out.println(carTrip.getMyStartOdometer());
        System.out.println(carTrip.getMyTime());
        System.out.println(carTrip.getTotalGasPrice(2.55));
        System.out.println(carTrip.getTripDistance());
        System.out.println(carTrip.toString());
    }
}