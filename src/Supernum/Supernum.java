package Supernum;

import java.util.ArrayList;


public class Supernum {

    /**
     * Supernum variable - array version
     */
    private ArrayList<Integer> Number = new ArrayList<Integer>();

    /**
     * Create empty Supernum
     */
    public Supernum() {



    }

    /**
     * Create Supernum
     * @param Number from String
     */
    public Supernum(String Number) {

        if (Parse.Check(Number)) {

            this.Number = Parse.ToSupernum(Number);

        }

    }

    /**
     * Set Supernum value
     * @param Number from String
     */
    public void Set(String Number) {

        if (Parse.Check(Number)) {

            this.Number = Parse.ToSupernum(Number);

        }

    }

    /**
     * Return Supernum value
     * @return in String
     */
    public String Get() {

        return Parse.ToString(Number);

    }

}
