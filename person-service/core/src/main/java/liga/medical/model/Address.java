package liga.medical.model;

import lombok.Data;

@Data
public class Address {
    Long id;

    Long contactId;

    Long countryId;

    String city;

    Integer index;

    String street;

    String building;

    String flat;
}
