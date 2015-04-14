package day2.lab04;

import org.springframework.stereotype.Component;

@Component
public class ShakespeareQuoter implements Quoter{
    @Override
    public String sayQuote() {
        return "2b|!2b";
    }
}
