public class hardware {
    public static void main(String[] args){
        item circularSaw = new item("4343", "Circular Saw", 122.50);
        item hammer = new item("9876", "Hammer", 19.75);
        item level = new item("1239", "Level", 12.99);

        System.out.println(circularSaw.getTotalPrice(2) + hammer.getTotalPrice(5) + level.getTotalPrice(12));
        System.out.println(circularSaw);
        System.out.println(hammer);
        System.out.println(level);
    }
}
