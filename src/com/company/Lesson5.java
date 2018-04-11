package com.company;

public class Lesson5 {
    public static void main(String[] args) {
        int month=12;
        switch (month)
        {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                    System.out.println("March");
                    break;
            case 4:
                        System.out.println("April");
                        break;
            case 5:
                System.out.println("May");
                break;
                default:
                    System.out.println("Invalid Number");



        }
        System.out.println("Your month is" + month);

    }
}
