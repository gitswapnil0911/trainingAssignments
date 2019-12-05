public class DemoArry {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        for (int ele : arr) {
            System.out.println(ele);

            String names[] = {"S","A","B"};
            String arr1[] = new String[3];

            Box barr[]= new Box[3];
            barr[0]=new Box(10,20,30);
            barr[1]=new Box(110,120,130);
            barr[2]=new Box(210,220,230);

            for (Box box : barr){
                System.out.println(box);
            }
        }
    }
}
