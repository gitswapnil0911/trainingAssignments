package com.jpm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("aaa","bbb","ccc","ddd");
        //str.stream().map(String::toUpperCase).forEach(System.out::println);
        Stream s1=Stream.of("Hello");
        s1.forEach(System.out::println);

        Stream s2=Stream.of("aaa","bbb","ccc");
        s2.forEach(System.out::println);

        Stream s3=Stream.of(1,2,3,4,5);
        s3.forEach(System.out::println);

        String[] arr={"aaa","bbb","ccc","ddd"};
        Stream s4=Stream.of(arr);
        s4.forEach(System.out::println);

        String s = "ooo,aaa,sss,d,ffff,ggg";
        Stream s5=Stream.of(s.split(","));
        s5.forEach(System.out::println);

        //str.parallelStream().forEach(System.out::println);
        /*List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> s1= list.stream();
        Stream<Integer> oddstream=s1.filter(n -> (n%2) == 1);
        Stream<Integer> sqrstream= oddstream.map(n -> n*n);
        //int sum=sqrstream.reduce(0,(n1,n2) -> n1+n2);
        int sum=sqrstream.reduce(0,Integer::sum);//Using Method refrence
        System.out.println("Sum is "+sum);

        int add= list.stream().filter(n -> (n%2) == 1).map(n -> n*n).reduce(0,Integer::sum);//Correct way to write stream earlier method is just  to understand steps
        System.out.println("Sum is "+add);*/
    }
}
