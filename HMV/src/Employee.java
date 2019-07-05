import java.util.Objects;

public class Employee extends Person {

    //PROPERTIES -------------------------------------------------------------------------------------------------------
    private static int idCont = 1;
    private int id;
    private int sector;
    private boolean activo;
    private float baseSalary;

    //CONSTRUCTORS -----------------------------------------------------------------------------------------------------
    public Employee(String name, String surname, int dni, int sector, float baseSalary) {
        super(name, surname, dni);
        setId();
        setSector(sector);
        setBaseSalary(baseSalary);
        setActivo(true);
    }

    public Employee() {
        super();
        setId();
        setActivo(true);
    }

    //GETTERS & SETTERS ------------------------------------------------------------------------------------------------
    public int getId() {
        return id;
    }

    private void setId() {
        this.id = idCont;
        idCont++;
    }

    public int getSector() {
        return sector;
    }

    public void setSector(int sector) {
        if(sector>0)
            this.sector = sector;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
            this.baseSalary = baseSalary;
    }



    //TO STRING --------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "\n[ EMPLOYEE ] \t\tID : " + getId() + super.toString()+ "\t\tSECTOR : " + getSector() + "\t\tBASE SALARY : " + getBaseSalary() ;
    }

    //EQUALS -----------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
