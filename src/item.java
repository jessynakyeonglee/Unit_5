public class item {
    private String PartNumber;
    private String PartDescription;
    private double PricePerItem;

    public item(String a, String b, double c){
        PartNumber = a;
        PartDescription = b;
        PricePerItem = c;
    }
    public double getTotalPrice(int quantity){
        return quantity*PricePerItem;
    }
    public String toString(){
        return "Item: " + PartNumber +"\nPrice: $" + PricePerItem
                + "\nDescription: " + PartDescription + "\n";
    }
}