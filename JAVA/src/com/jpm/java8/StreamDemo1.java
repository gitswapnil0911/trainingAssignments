package com.jpm.java8;

import java.io.InputStream;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamDemo1 {
    public static void main(String[] args) {
        int sum= IntStream.iterate(2, n -> n + 2)
        .limit(20)
                .reduce(0,Integer::sum);
        System.out.println(sum);

       /* NOT COMPLETED
       Random r=new Random(2);
        int rnd=IntStream.generate(r::nextInt)
                .limit(5)
                .
*/
    }
}
