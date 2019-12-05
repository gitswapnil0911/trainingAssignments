package com.jpmorgan.demo.exceptionhandelling;

public class RtimeExcHld {
    public static void main(String[] args) {
        int a=10, b=0,c;
        String s=null;
        try{
            c=a/b;
            s.length();
        }

        /*catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }*/
        catch (NullPointerException ne){
            System.out.println(ne.getMessage());
        }
        /*catch (Exception e){
            System.out.println(e.getMessage());
        }*/
        /*catch (Throwable t){
            System.out.println(t.getMessage());
        }*/
        finally {
            System.out.println("in Finally");
        }
        System.out.println("outside finally");
    }
}
