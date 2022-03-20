package liga.medical.mapper;

import liga.medical.dto.MedicalCardDto;
import liga.medical.model.MedicalCard;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedicalCardMapper extends MapStructMapper<MedicalCard, MedicalCardDto> {
}
