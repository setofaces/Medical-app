package liga.medical.dto;

import lombok.Data;

@Data
public class AddressDto {
    Long id;

    Long contactId;

    Long countryId;

    String city;

    Integer index;

    String street;

    String building;

    String flat;
}
