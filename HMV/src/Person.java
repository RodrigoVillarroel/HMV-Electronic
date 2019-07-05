import java.util.Objects;

public abstract class Person {

    //PROPERTIES -------------------------------------------------------------------------------------------------------
    private String name;
    private String surname;
    private int dni;

    //CONSTRUCTORS -----------------------------------------------------------------------------------------------------
    public Person(String name, String surname, int dni) {
        setName(name);
        setSurname(surname);
        setDni(dni);
    }

    public Person() {
    }

    //GETTERS & SETTERS ------------------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null)
            this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname!=null)
            this.surname = surname;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        if(dni>0)
            this.dni = dni;
    }

    //TO STRING --------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "\t\tNAME : " + getName() + "\t\tSURNAME : " + getSurname() + "\t\tDNI : " + getDni() ;
    }

    //EQUALS -----------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return dni == person.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
