package com.quizgame;

public class LesMethods {










    static public boolean estComposéUniquementDeNombres(String str) {

        String b = "";
        b = str;
        boolean a = false;

        if (str != null) {

            if (!str.isEmpty()) {

                b = b.replaceAll("\\D", "");
                if (str.length() == b.length()) {
                    a = true;
                }
            }

        }
        return a;
    }

}
