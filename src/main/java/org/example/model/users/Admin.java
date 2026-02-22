package org.example.model.users;

import java.time.LocalDate;

public class Admin extends User {

    public Admin(String name, int phoneNumber, LocalDate birthDay, String username, String email) {
        super( name, phoneNumber, birthDay, username, email);
    }


}
