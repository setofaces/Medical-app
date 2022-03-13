package liga.medical.core.mapper;

import dto.MedicalHistoryDto;
import dto.PatientDto;
import liga.medical.core.entity.MedicalHistory;
import liga.medical.core.entity.Patient;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructMapper {
    PatientDto patientToPatientDto(Patient patient);

    Patient patientDtoToPatient(PatientDto patientDto);

    List<PatientDto> patientsToPatientDtos(List<Patient> patients);

    MedicalHistoryDto medicalHistoryToMedicalHistoryDto(MedicalHistory medicalHistory);

    MedicalHistory medicalHistoryDtoToMedicalHistory(MedicalHistoryDto medicalHistoryDto);

    List<MedicalHistoryDto> medicalHistoriesToMedicalHistoryDtos(List<MedicalHistory> medicalHistories);
}
