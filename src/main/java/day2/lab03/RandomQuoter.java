package day2.lab03;

import java.util.Random;

public class RandomQuoter {
    private String mRandomQuote;

    public RandomQuoter(Random random) {
        mRandomQuote = Integer.toHexString(new Random().nextInt());
    }



    public RandomQuoter() {
    }

    public String getRandomQuote() {
        return mRandomQuote;
    }
}
