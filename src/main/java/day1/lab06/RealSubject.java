package day1.lab06;

import day1.lab08.Benchmark;

public class RealSubject implements Subject {
    @Override
    @Benchmark
    public int longMethod() throws InterruptedException {
        int count = 0;
        for (int i = 0; i <5; i++) {
            Thread.sleep(1000);
        }
        return count;
    }
}
