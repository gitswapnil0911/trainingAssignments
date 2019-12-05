public class VarArgsDemo {
public int add(int...arr){
    int sum=0;
    for (int ele:arr)
        sum += ele;
    return sum;
}

    public static void main(String[] args) {
        VarArgsDemo d1= new VarArgsDemo();
        System.out.println(d1.add(10,20,30));
    }
}
