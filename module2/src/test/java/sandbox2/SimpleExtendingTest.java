package sandbox2;

import sandbox1.AbstractTest;

public class SimpleExtendingTest extends AbstractTest {

    @Override
    protected Object createObject() {
        return "SimpleExtendingTest@" + System.currentTimeMillis();
    }

}
