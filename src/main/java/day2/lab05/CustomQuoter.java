package day2.lab05;

import day2.lab04.Quoter;

public class CustomQuoter implements Quoter {

    private StringBuilder mStringBuilder;

    public CustomQuoter(StringBuilder stringBuilder) {
        mStringBuilder = stringBuilder;
    }

    @Override
    public String sayQuote() {
        return mStringBuilder.toString();
    }
}
