package day1.lab02;

import java.util.List;

public class TerminatorQuoter implements Quoter {

    private List<String> mQuotes;

    @Override
    public void sayQuote() {
        System.out.println(mQuotes);
    }

    public List<String> getQuotes() {
        return mQuotes;
    }

    public void setQuotes(List<String> quotes) {
        this.mQuotes = quotes;
    }
}
