package liga.medical.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class IllnessDto {
    Long id;

    Long medicalCardId;

    Long typeId;

    Character heaviness;

    LocalDateTime appearanceDttm;

    LocalDate recoveryDt;
}
