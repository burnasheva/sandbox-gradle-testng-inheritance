package sandbox2;

import org.testng.annotations.Test;
import sandbox1.AbstractTest;

public class ComplexExtendingTest extends AbstractTest {

    @Override
    protected Object createObject() {
        return "ComplexExtendingTest@" + System.currentTimeMillis();
    }

    @Test (retryAnalyzer = MyRetryAnalyzer.class)
    public void additionalTest() {
        assert object != null;
    }

}
