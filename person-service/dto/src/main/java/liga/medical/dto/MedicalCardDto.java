package liga.medical.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MedicalCardDto {
    Long id;

    Character clientStatus;

    Character medStatus;

    LocalDate registryDt;

    String comment;
}
