package com.company;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class Lesson7 {
    public static void main(String[] args) {
        int x =54;
        System.out.println(Math.sqrt(x));
        double result = Math.sqrt(62);
        double powered = Math.pow(x,3);
        System.out.println(powered);

        //area of a circle
        double area = 3.142*Math.pow(7,2); //7*7

        System.out.println(11/5.0);

        powered = Math.round(powered);
        System.out.println(powered);

        int z = (int) powered; // type casting
        System.out.println(z);

        String y = "10";

        int v = Integer.parseInt(y);

        String k = "12.66";
        double s = Double.parseDouble(k);

    }
}
