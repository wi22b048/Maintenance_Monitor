package unitTests;

import monitoringController.MonitorMessage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DisplayMessageTest {
    @Test
    public void testGetMessage(){
        String expected = "Getting message!";
        MonitorMessage message = new MonitorMessage(expected);

        String result = message.getMessage();

        assertEquals(expected, result);
    }
}
