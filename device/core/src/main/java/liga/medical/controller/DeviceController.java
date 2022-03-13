package liga.medical.controller;

import liga.medical.DeviceIdentificationDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class DeviceController {

    Logger logger = LoggerFactory.getLogger(DeviceController.class);

    String hostname = "Unknown";

    private final AmqpTemplate template;

    public DeviceController(AmqpTemplate template) {
        this.template = template;
    }

    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestBody DeviceIdentificationDto dto) {
        logger.info("Sending to medical");
        template.convertAndSend("medical", dto);
        try {
            InetAddress address;
            address = InetAddress.getLocalHost();
            hostname = address.getHostName();
        } catch (UnknownHostException ex) {
            System.out.println("Hostname can not be resolved");
        }
        return ResponseEntity.ok(hostname + ": " + "Successfully sent to queue");
    }

}
