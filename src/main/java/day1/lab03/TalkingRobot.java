package day1.lab03;

import day1.lab02.Quoter;

import javax.annotation.PostConstruct;
import java.util.List;

public class TalkingRobot implements Robot {

    List<Quoter> mQuoters;

    @Override
    @PostConstruct
    public void talk() {
        System.out.println("I;m robot "+ toString());
        for(Quoter quoter : mQuoters){
            quoter.sayQuote();
        }
    }
    public void setQuoters(List<Quoter> quoters) {
        this.mQuoters = quoters;
    }
}
