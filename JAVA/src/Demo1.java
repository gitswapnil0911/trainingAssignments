public class Demo1 {
    public String createString(String sep,String...arr){
        String s="";
        for(String ele:arr){
            s = s+ele+sep;
        }
        return s;
    }

    public static void main(String[] args) {
        Demo1 dm= new Demo1();
        System.out.println(dm.createString(",","aaa","bbb"));
    }
}
