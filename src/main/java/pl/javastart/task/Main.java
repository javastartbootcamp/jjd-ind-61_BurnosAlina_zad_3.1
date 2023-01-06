package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        ChristmasTreeDescription tree1 = new ChristmasTreeDescription();
        tree1.treeColour = "Zielony";
        tree1.treeHight = 1.80;
        tree1.christmasBallsNumber = 158;
        ChristmasTreeDescription tree2 = new ChristmasTreeDescription();
        tree2.treeColour = "Zielono-bialy";
        tree2.treeHight = 2.00;
        tree2.christmasBallsNumber = 190;

        System.out.println("Pierwsza choinka ma kolor:  " + tree1.treeColour + "\n" +
                "Jej wysokosc to: " + tree1.treeHight + "m\n" + "Wisi na niej " + tree1.christmasBallsNumber +
        " bombek.");
        System.out.println("Druga choinka ma kolor:  " + tree2.treeColour + "\n" +
                "Jej wysokosc to: " + tree2.treeHight + "m\n" + "Wisi na niej " + tree2.christmasBallsNumber +
                " bombek.");

    }
}
