package liga.medical.mapper;

import liga.medical.dto.PersonDataDto;
import liga.medical.model.PersonData;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonDataMapper extends MapStructMapper<PersonData, PersonDataDto> {
}
