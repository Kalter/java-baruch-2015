package day1.lab06;

public class BenchmarkProxySubject implements Subject {

    private RealSubject subject;

    public BenchmarkProxySubject(RealSubject subject) {
        this.subject = new RealSubject();
    }

    public BenchmarkProxySubject() {
    }

    @Override
    public int longMethod() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        int count = subject.longMethod();
        System.out.println("Time: " + (System.currentTimeMillis() - startTime));
        return count;
    }
}
