package monitoringController;

import org.springframework.web.bind.annotation.*;

@RestController
public class DisplayMessage {
    static final String DEFAULT_MESSAGE = "Everything operates as expected";

    private MonitorMessage currentMessage = new MonitorMessage(DEFAULT_MESSAGE);

    @GetMapping("/api/message")
    public String getMessage(){
        return currentMessage.getMessage();
    }
}
