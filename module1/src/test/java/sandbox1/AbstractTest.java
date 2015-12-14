package sandbox1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public abstract class AbstractTest {

    protected Object object;

    @BeforeMethod
    protected void prepareObject() {
        object = createObject();
    }

    protected abstract Object createObject();

    @Test
    public void test() {
        assert object != null;
    }

    @Test
    public void testPlus() {
        assert 1+3 == 5;
    }

}
