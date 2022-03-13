package liga.medical.core.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Patient patient;

    private int docNumber;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime createDttm;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime modifyDttm;

    private String doctor;

    private String diagnosis;

    @OneToMany
    @JoinColumn(referencedColumnName = "id")
    private List<MedicalHistory> medicalHistory;
}
