package liga.medical.dto;

import lombok.Data;

@Data
public class ContactDto {
    Long id;

    String phoneNumber;

    String email;

    String profileLink;
}
