public class Usebox {
    public static void main(String[] args) {
        Box b1 = new Box(1,2,3);
        b1.displayBox();
        System.out.println("Volume is : "+b1.calcVol());
        Box b2= new Box(9,8,7);
        System.out.println(b1.calcVol() + "\n" + b2.calcVol()); //Shows memory address
        b1.setLength(100);
        System.out.println(b1.calcVol());
        System.out.println(b1.getLength());

    }
}
