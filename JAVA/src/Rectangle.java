public class Rectangle {
int length;
int breadth;

    public Rectangle(){
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int calArea(){
        return length*breadth;
    }

    public int calPeri(){
        return 2*(length+breadth);
    }

    public void displayRectangle() {
        System.out.println("Rectangle length=" + length + " breadth" + breadth + " Area is " + calArea() + " Perimeter is " + calPeri());
    }
}
