package day2.lab03;

public abstract class SpeakingRobot implements Robot{

    public abstract RandomQuoter getQuoter();
    @Override
    public String  speak() {
        return  getQuoter().getRandomQuote();
    }
}
