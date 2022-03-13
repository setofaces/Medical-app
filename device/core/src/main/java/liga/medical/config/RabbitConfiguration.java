package liga.medical.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfiguration {

    Logger logger = LoggerFactory.getLogger(RabbitConfiguration.class);

    @Bean
    public ConnectionFactory connectionFactory() {
        return new CachingConnectionFactory("localhost");
    }

    @Bean
    public RabbitTemplate jsonRabbitTemplate() {return new RabbitTemplate(connectionFactory());}

    @Bean
    public Queue appQueue() {
        return new Queue("medical");
    }

}
