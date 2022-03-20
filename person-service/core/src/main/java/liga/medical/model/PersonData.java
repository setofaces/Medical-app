package liga.medical.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PersonData {
    Long id;

    String lastName;

    String firstName;

    LocalDate birthDt;

    Integer age;

    Character sex;

    Long contactId;

    Long medicalCardId;

    Long parentId;
}
