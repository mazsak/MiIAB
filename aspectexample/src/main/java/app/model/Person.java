package app.model;

import org.hibernate.annotations.Immutable;

@Immutable
public class Person {

    private String username;
    private String surname;
    private String email;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void set(){
        setUsername("Jakub");
        setSurname("Conor");
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
