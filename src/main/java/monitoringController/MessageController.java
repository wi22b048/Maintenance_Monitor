package monitoringController;

import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {
    static final String DEFAULT_MESSAGE = "Everything operates as expected";

    private MonitorMessage currentMessage = new MonitorMessage(DEFAULT_MESSAGE);

    @GetMapping("/api/message")
    public String getMessage(){
        return currentMessage.getMessage();
    }

    @GetMapping("/api/message/set")
    public String setMessage(String message){
        currentMessage.setMessage(message);

        return "ok";
    }

    @GetMapping("/api/message/reset")
    public String resetMessage(){
        currentMessage.setMessage(DEFAULT_MESSAGE);

        return "ok";
    }
}
