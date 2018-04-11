package com.company;

public class Lesson6 {
    public static void main(String[] args) {
        //text lesson
        String fname = "Eliud";
        String lname = "Korir";
        String regnu = "001";
        System.out.println(fname+ " " + lname +" " +regnu );
        String fullnames =  fname +" "+ lname;
        System.out.println(fullnames);
        String sentence = "The quick brown fx jumped over a lazy dog";
        //functions
        System.out.println(sentence.length());
        sentence = "Hi there  ";
        sentence = sentence.trim();
        //if statement
        if (sentence.isEmpty())
        {
            System.out.println(sentence+ " "+ "Fill in your sentence");
        }
        else
        {
            System.out.println(sentence+ " "+"Your sentence is good");
        }
        String spaceless = sentence.replace(" ","74");
        System.out.println(spaceless);
    }
}
