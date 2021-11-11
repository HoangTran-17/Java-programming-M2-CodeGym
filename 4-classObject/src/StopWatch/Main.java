package StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch demo = new StopWatch();

        long start = demo.start();
        int Sum = 0;
        for (int i = 0; i < Math.pow(10,3); i++) {
            Sum += i;
        }
        long end = demo.stop();

        System.out.println(end - start);
    }
}
