package sandbox2;


import org.testng.annotations.Test;

/**
 * Created by Nadezhda.Burnasheva on 12/11/2015.
 */
public class IgnoredTest {

    @Test(retryAnalyzer = MyRetryAnalyzer.class)
    public void testShouldBeIgnored(){
        assert true;
    }

    @Test
    public void testShouldFail() {
        assert false;
    }
}
