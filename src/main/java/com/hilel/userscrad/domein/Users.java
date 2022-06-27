package com.hilel.userscrad.domein;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Users {

    long id;
    String name;
    String email;
}
