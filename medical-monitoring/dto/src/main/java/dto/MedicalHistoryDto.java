package dto;

import lombok.Data;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class MedicalHistoryDto {

    @NotNull
    private int docNumber;

    @NotNull
    private LocalDateTime createDttm;

    @NotNull
    private LocalDateTime modifyDttm;

    private String doctor;

    private String diagnosis;

}
