public class Dessert {
    public int flavor;
    public int price;
    public static int numDesserts;

    public Dessert(int f, int p) {
        flavor = f;
        price = p;
        numDesserts++;
    }

    public void printDessert() {
        String outString = flavor + " " + price + " " + numDesserts;
        System.out.println(outString);
    }

    public static void main(String[] args) {
        System.out.println("I love dessert!");

    }

}