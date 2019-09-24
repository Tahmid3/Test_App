package de.test_app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserToDo {

    private String username;
    private String password;
    private String password2;
}
