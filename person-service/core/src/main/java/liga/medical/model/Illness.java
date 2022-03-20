package liga.medical.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Illness {
    Long id;

    Long medicalCardId;

    Long typeId;

    Character heaviness;

    LocalDateTime appearanceDttm;

    LocalDate recoveryDt;
}
