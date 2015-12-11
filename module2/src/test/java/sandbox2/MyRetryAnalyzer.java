package sandbox2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Nadezhda.Burnasheva on 12/11/2015.
 */
public class MyRetryAnalyzer implements IRetryAnalyzer {
    AtomicInteger count = new AtomicInteger(2);

    public boolean isRetryAvailable() {
        return (count.intValue() > 0);
    }

    @Override
    public boolean retry(ITestResult result) {
        return count.decrementAndGet() > 0;
    }
}