package StopWatch;


public class StopWatch {
     long startTime, endTime;

    private long getStartTime() {
        return startTime;
    }

    private long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public long start() {
        startTime = System.nanoTime();
        return startTime;
    }

    public long stop() {
        long endTime = System.nanoTime();
        return endTime;
    }

    public long getElapsedDate() {
        return (endTime - startTime);
    }


}
