package pl.olejarz.springsecuritybasics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("/notification")
    public String notification() {
        return "Notification about test";
    }

    @GetMapping("/notification2")
    public String notificationAnother() {
        return "Different notifications with authorization";
    }

}
