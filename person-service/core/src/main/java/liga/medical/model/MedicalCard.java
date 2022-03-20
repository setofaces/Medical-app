package liga.medical.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MedicalCard {
    Long id;

    Character clientStatus;

    Character medStatus;

    LocalDate registryDt;

    String comment;
}
