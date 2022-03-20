package liga.medical.mapper;

import liga.medical.dto.ContactDto;
import liga.medical.model.Contact;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContactMapper extends MapStructMapper<Contact, ContactDto> {
}
