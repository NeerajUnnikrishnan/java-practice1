package com.company;

public class RangeChecker{
        public static String Check(int input) {

            if (input % 2 == 0 && input >= 20 && input <= 30) {
                return "Tom";
            }
            return "Jerry";
        }
}
