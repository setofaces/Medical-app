package liga.medical.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LogEntity {

    private Long id;

    private LocalDateTime eventDate;

    private String methodName;

    private String className;

    private String userName;
}
