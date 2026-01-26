package org.example.HomeWork10.Task1;

import java.util.Objects;

public class User {
    public String id;
    public String name;
    public String e_mail;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.e_mail = email;
    }

    @Override                  // без Стринга, org.example.HomeWork10.Task1.User@7229724f,
    public String toString() { // со Стрингом User{id=1, name='NameName', email='e-mail@email.com'}
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", email='" + e_mail + '\'' + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, e_mail);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        User user = (User) obj;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(e_mail, user.e_mail);
    }
}
