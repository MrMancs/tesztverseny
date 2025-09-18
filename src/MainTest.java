import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class MainTest {
    @Before
    public void testBefore(){
        Main.isRunningTest = true;
    }

    @Test
    public void testMain() throws IOException {
        Main.main(null);

    }

    @Test
    public void testHandler() {
        Handler handler = new Handler();
        handler.setValaszok(handler.getValaszok());
        handler.valaszai("Bullshit");
    }

    @After
    public void testAfter(){
        Main.isRunningTest = false;
    }
}