import java.util.Scanner;

public class StrDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();

        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());


            String[] pallindromstring;
            pallindromstring=s1.split("\\s");
            String fin="";
            for(int i=0;i<s1.length();i++){
                fin += s1.charAt(s1.length()-i-1);
            }
        System.out.println(fin);
            if(s1.equals(fin))
            System.out.println("Equals");
            else
                System.out.println("not");


           }
}
