package Supernum;

import java.awt.image.AreaAveragingScaleFilter;
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

    /**
     * Add Number to Number
     * @param Number Number to add
     */
    public void Addition(String Number) {

        ArrayList<Integer> Array = Parse.ToSupernum(Number);
        ArrayList<Integer> Tmp = new ArrayList<Integer>();

        int F = this.Number.size();
        int S = Array.size();
        int T = F > S ? F : S;
        int Inc = 0;

        Tmp.add(0);

        for (int P = 0; P < T; P++) {

            if (P <= F - 1) Tmp.set(P, this.Number.get(P) + Tmp.get(P));
            if (P <= S - 1) Tmp.set(P, Array.get(P) + Tmp.get(P));

            if (Tmp.get(P) > 10) {

                Inc++;
                Tmp.set(P, Tmp.get(P) % 10);

            }

            // Не трогать ! Без этого хуёво работает !
            if (P != T - 1) Tmp.add(Inc);
            Inc = 0;

        }

        this.Number = Tmp;

    }

}
