package liga.medical;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@EnableRabbit
@Component
public class RabbitMqListener {

    Logger logger = LoggerFactory.getLogger(RabbitMqListener.class);

    @RabbitListener(queues = "medical")
    public void process(DeviceIdentificationDto dto) {
        logger.info("Recieved from medical: {}", dto);
    }
}
