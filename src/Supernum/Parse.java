package Supernum;


import java.util.ArrayList;

public class Parse {

    /**
     * Check string to be convert into Supernum
     * @param Number Long number
     * @return Yes or No
     */
    public static boolean Check(String Number) {

        char CharacterArray[] = Number.toCharArray();

        for (char Character: CharacterArray) {

            if (!(Character >= '0' && Character <= '9')) return false;

        }
        return true;

    }

    /**
     * ToSupernum String into Supernum
     * @param Number input String
     * @return output ArrayList<Integer>
     */
    public static ArrayList<Integer> ToSupernum(String Number) {

        char CharacterArray[] = Number.toCharArray();
        ArrayList<Integer> TempArrayList = new ArrayList<Integer>();

        for (int i = Number.length() - 1; i >= 0; i--) {

            TempArrayList.add(Character.getNumericValue(Number.charAt(i)));

        }

        return TempArrayList;

    }

    /**
     * Supernum into String
     * @param Number input Array
     * @return output String
     */
    public static String ToString(ArrayList<Integer> Number) {

        String TempString = "";

        for (Integer Char: Number) {

            TempString = String.valueOf(Char) + TempString;

        }

        return TempString;

    }

}
