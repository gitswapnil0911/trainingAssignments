public class Box {
    private int length;
    private int width;
    private int height;

    public int calcVol(){
        return length * width * height;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

        public boolean equals(Object obj) {
        Box b =(Box)obj;
        if ((this.length==b.length) && (this.height==b.height) && (this.width==b.width)) {
            return true;
        }else
            return false;
    }

    public int getLength() {
        return length;
    }

    public void displayBox(){
        System.out.println("Length : " + length + "Width : " + width + "Height : "+ height + "Vol : " + calcVol());
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }


}
