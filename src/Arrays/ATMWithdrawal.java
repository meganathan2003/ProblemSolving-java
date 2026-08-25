package Arrays;

import java.util.*;

class ATMWithdrawal {

    static int minimumNotes(int[] notes, int amount) {

        int count = 0;

        for (int note : notes) {

            count += amount / note;
            amount = amount % note;
        }

        return count;
    }

    static void main(String[] args) {

        int[] notes = {2000, 500, 200, 100};

        int amount = 4700;

        System.out.println(minimumNotes(notes, amount));
    }
}