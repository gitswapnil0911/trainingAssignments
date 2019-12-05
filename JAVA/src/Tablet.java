public class Tablet extends Medicine {
    @Override
    void displayLabel() {
        super.getDetails();
        System.out.println("Store in cool place");
    }
}
