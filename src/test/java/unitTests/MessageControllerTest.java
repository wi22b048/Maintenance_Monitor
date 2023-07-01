package unitTests;

import monitoringController.MessageController;
import monitoringController.MonitorMessage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageControllerTest {
    @Test
    void testGetMessage(){
        String defaultMessage = "Everything operates as expected!";
        MonitorMessage monitorMessage = new MonitorMessage(defaultMessage);

        String message = monitorMessage.getMessage();

        assertEquals(message, defaultMessage);
    }

    @Test
    void testSetMessage(){
        MessageController controller = new MessageController();
        String newMessage = "Service checks: No power until 5:00 pm";

        controller.setMessage(newMessage);
        String message = controller.getMessage();

        assertEquals(message, newMessage);
    }
}
