package sandbox2;

import org.testng.annotations.Test;
import sandbox1.AbstractTest;

public class ComplexExtendingTest {

    @Test (retryAnalyzer = MyRetryAnalyzer.class)
    public void additionalTest() {
        assert "smth" != null;
    }

    @Test (retryAnalyzer = MyRetryAnalyzer.class)
    public void oneTest() {
        assert true;
    }

    @Test (retryAnalyzer = MyRetryAnalyzer.class)
    public void twoTest() {
        assert true;
    }

}
