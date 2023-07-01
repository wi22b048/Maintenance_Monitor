package unitTests;

import monitoringController.MonitorMessage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetMessageTest {
    @Test
    public void testSetMessage(){
        String expected = "New message";
        MonitorMessage message = new MonitorMessage("Old message");

        message.setMessage(expected);

        String result = message.getMessage();

        assertEquals(expected, result);
    }
}
