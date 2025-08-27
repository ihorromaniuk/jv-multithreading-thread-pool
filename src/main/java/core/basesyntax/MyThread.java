package core.basesyntax;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    private final Random random;

    public MyThread() {
        this.random = new Random();
    }

    @Override
    public String call() throws InterruptedException {
        Integer duration = (random.nextInt(5) + 1) * 100;
        Thread.sleep(duration);
        return String.format("Task duration was %s ms, execution finished at %s",
                duration,
                LocalTime.now());
    }
}
