package liga.medical.model;

import lombok.Data;

@Data
public class Contact {
    Long id;

    String phoneNumber;

    String email;

    String profileLink;
}
