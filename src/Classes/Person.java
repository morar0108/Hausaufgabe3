package Classes;

import java.util.*;

public abstract class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return den String
     * die Funktion gibt zuruck einen String gebildet aus Name und Vorname der Person
     */
    @Override
    public String toString() {
        return "Person : Name = %s, Vorname = %s".formatted(firstName, lastName);
    }
}
