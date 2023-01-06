package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        ChristmasTree tree1 = new ChristmasTree("Zielony", 1.8, 158);
        ChristmasTree tree2 = new ChristmasTree("Zielono-bialy", 2.00, 190);
        System.out.println("Pierwsza choinka ma kolor:  " + tree1.colour + "\n" +
                "Jej wysokosc to: " + tree1.height + "m\n" + "Wisi na niej " + tree1.christmasBallsNumber +
                " bombek.");
        System.out.println("Druga choinka ma kolor:  " + tree2.colour + "\n" +
                "Jej wysokosc to: " + tree2.height + "m\n" + "Wisi na niej " + tree2.christmasBallsNumber +
                " bombek.");
    }
}
