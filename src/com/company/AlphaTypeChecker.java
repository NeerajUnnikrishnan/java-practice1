package com.company;

public class AlphaTypeChecker {
        public static String Check(char ch) {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            return "Vowel";
        else
            return "Consonant";
    }
}
