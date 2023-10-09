// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        {
            int mass = 98;
            double height = 1.87;
            int heightAnotherType = (int)Math.round (height);
            int myBmi = service.calculate(mass, heightAnotherType);

            System.out.println(myBmi);
        }
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("love your self!");

    }
}