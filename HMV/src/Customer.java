import java.util.Objects;

public class Customer extends Person {

    //PROPERTIES -------------------------------------------------------------------------------------------------
    private static int idCont = 1;
    private int id;

    //CONSTRUCTORS -----------------------------------------------------------------------------------------------
    public Customer(String name, String surname, int dni){
        super(name, surname, dni);
        setId();
    }

    public Customer(){
        super();
        setId();
    }

    //GETTERS & SETTERS ------------------------------------------------------------------------------------------
    public int getId() {
        return id;
    }

    private void setId() {
        this.id = idCont;
        idCont++;
    }

    //TO STRING --------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "\n[ CUSTOMER ] \t\tID : " + getId()  + super.toString() ;
    }

    //EQUALS -----------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id;
    }

}
