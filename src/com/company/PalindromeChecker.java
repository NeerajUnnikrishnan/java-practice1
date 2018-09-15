package com.company;

public class PalindromeChecker{
    public static boolean PalindromeCheck(long input) {

        String inputToString = Long.toString(input);
        StringBuffer buffer = new StringBuffer(inputToString);
        buffer.reverse();
        String reverseInputString = buffer.toString();
        Long reverseInput = Long.parseLong(reverseInputString);

        if(reverseInput == input){
            return true;
        }

        return false;

    }

    public static boolean isEven(long num){
        if(num%2 ==1){
            return false;
        }
        else return true;
    }
}