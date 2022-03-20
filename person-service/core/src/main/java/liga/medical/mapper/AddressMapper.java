package liga.medical.mapper;

import liga.medical.dto.AddressDto;
import liga.medical.model.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper extends MapStructMapper<Address, AddressDto> {
}
