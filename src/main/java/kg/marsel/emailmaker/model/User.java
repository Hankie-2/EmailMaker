package kg.marsel.emailmaker.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    Long id;

    String name;

    String surname;

    String patronymic;

    String company;

}
