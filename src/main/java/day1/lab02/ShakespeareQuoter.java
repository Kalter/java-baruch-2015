package day1.lab02;

public class ShakespeareQuoter implements Quoter{

    private String mQuote;

    @Override
    public void sayQuote() {
        System.out.println(mQuote);
    }

    public String getQuote() {
        return mQuote;
    }

    public void setQuote(String quote) {
        mQuote = quote;
    }
}
