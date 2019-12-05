public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r[]=new Rectangle[5];
        r[0]= new Rectangle();
        r[1]= new Rectangle(2,3);
        r[2]= new Rectangle(12,13);
        r[3]= new Rectangle(32,23);
        r[4]= new Rectangle(42,53);

        for (Rectangle re:r) {
            re.displayRectangle();
        }

    }
}
