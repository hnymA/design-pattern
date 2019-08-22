package part4.strategy.a2;

public class Main {

    public static void main(String[] args) {
        String[] data = {
            "Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
        };
        SortAndPrint sap = new SortAndPrint(data, new SelectionSorter());
        sap.execute();
    }
}