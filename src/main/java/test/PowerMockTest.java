package test;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Utility.class)
public class PowerMockTest {

    @Test
    public void TestStaticMethod_WithPowerMockito() {

        String call = " Hi there, I'm using PowerMock with Mockito ";
        String callExpectation = " Call Expectation. ";

        PowerMockito.mockStatic(Utility.class);
        PowerMockito.when(Utility.staticMethod(call)).thenReturn(callExpectation);

        String actualCall = Utility.staticMethod(call);
        assertEquals(callExpectation, actualCall);
    }
}