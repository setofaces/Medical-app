package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PatientDto {

    @NotEmpty
    private String name;

    @NotEmpty
    private String gender;

    @Min(0)
    private int age;

    @NotEmpty
    private String city;

    @NotEmpty
    private String address;

    @NotNull
    private LocalDate birthDayDt;

    @NotEmpty
    private String birthPlace;

    private String registration;

    private int passportSeries;

    private int passportNumber;

    private String phoneNumber;

    private String anotherDocument;
}
