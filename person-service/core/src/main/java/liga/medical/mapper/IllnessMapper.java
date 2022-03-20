package liga.medical.mapper;

import liga.medical.dto.IllnessDto;
import liga.medical.model.Illness;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IllnessMapper extends MapStructMapper<Illness, IllnessDto> {
}
