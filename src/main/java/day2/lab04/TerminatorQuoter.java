package day2.lab04;


import org.springframework.stereotype.Component;

@Component
public class TerminatorQuoter implements Quoter{
    @Override
    public String sayQuote() {
        return "I'll be back!";
    }
}
