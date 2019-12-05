import com.jpm.demo.A;
import com.jpm.demo.B;

import javax.xml.transform.sax.SAXSource;

public class Demo {
    public static void main(String[] args) {
        Box b1 =new Box(10,20,30);
        Box b2 =new Box(10,20,30);
        System.out.println(b1.equals(b2));
        A a = new A();
        B b =new B();
    }
}
