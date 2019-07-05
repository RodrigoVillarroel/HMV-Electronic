import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class AdministrationDepartment implements BaseActions {

    //PROPERTIES -------------------------------------------------------------------------------------------------------
    private int code = 1;
    private ArrayList<Employee> employees;

    //CONSTRUCTORS -----------------------------------------------------------------------------------------------------
    public AdministrationDepartment() {
        setEmployees();
    }

    //GETTERS & SETTERS ------------------------------------------------------------------------------------------------

    public int getCode() {
        return code;
    }

    public ArrayList<Employee> getEmployees() {
            return this.employees;
    }

    private void setEmployees() {
        employees = new ArrayList<Employee>();
    }

    //METHODS OF INTERFACE ---------------------------------------------------------------------------------------------
    @Override
    public Object search(int num) throws Exception {
        Employee x = null;
        try {
            if(employees!=null) {
                for (Employee pro : employees) {

                    if (pro.getId() == num) {
                        x = new Employee();
                        x = pro;
                    }
                }
            }
        }catch (NullPointerException e)
        {
            throw e;
        }catch (Exception i)
        {
            throw new Exception("Hubo un inconveniente con el listado de Empleados, intente mas tarde!");
        }

        return x;
    }

    @Override
    public void addx(Object obj) {
        if(employees!=null)
        {
            employees.add((Employee) obj);
        }
    }

    @Override
    public Object delete(int num) throws Exception {
        Employee x =null;
        try {
            if(employees!=null) {
                x = (Employee) search(num);
                if(x!=null)
                {
                    employees.remove(x);
                }
            }
        }catch (NullPointerException e)
        {
            throw e;
        }catch (Exception i)
        {
            throw new Exception("Hubo un inconveniente con el listado de Empleados, intente mas tarde!");
        }


        return x;
    }

    @Override
    public void list() {
        if(employees!=null)
            for (Employee x: employees
            ) {
                System.out.println(x);
            }
    }

    //METHODS ----------------------------------------------------------------------------------------------------------

    public Employee searchForDni(int dni) throws Exception {
        Employee employee = null;
        try {
            if (employees != null) {
                for (Employee x : employees
                ) {
                    if (x.getDni() == dni) {
                        employee = new Employee();
                        employee = x;
                    }
                }
            }
        }catch (NullPointerException e)
        {
            throw e;
        }catch (Exception i)
        {
            throw new Exception("Hubo un inconveniente con el listado de Empleados, intente mas tarde!");
        }
        return employee;
    }

    public ArrayList<Employee> searchForDepartament (int sector)
    {
        ArrayList<Employee> empl = null;
        if(employees!=null)
        {
            empl = new ArrayList<Employee>();
            for (Employee x: employees
                 ) {
                if(x.getSector()==sector)
                {
                    empl.add(x);
                }
            }
        }
        return empl;
    }

    public Employee saerchForSurname(String surname)
    {
        Employee employee = null;
        if(employees!=null)
        {
            for (Employee x : employees
            ) {
                if(x.getSurname().equals(surname) )
                {
                    employee = new Employee();
                    employee = x;
                }
            }
        }
        return employee;
    }

    /*public void IncreaseSalary(Employee x,float rise )
    {
        employees.indexOf(x);
        if(x!=null)
        {
            e
        }
    }*/

    public Employee loadEmployeForKeyboar()
    {
        Employee nuevo = new Employee();
        String palabra;
        int option;
        System.out.println("\nINGRESE NOMBRE:");
        Scanner scanner = new Scanner(System.in);
        palabra = scanner.next();
        nuevo.setName(palabra);
        System.out.println("\nINGRESE APELLIDO:");
        palabra = scanner.next();
        nuevo.setSurname(palabra);
        System.out.println("\nINGRESE DNI:");
        option = scanner.nextInt();
        nuevo.setDni(option);
        System.out.println("\nINGRESE SECTOR:");
        option = scanner.nextInt();
        nuevo.setSector(option);
        System.out.println("\nINGRESE SALARIO:");
        float salary = scanner.nextFloat();
        nuevo.setBaseSalary(salary);
        System.out.println(nuevo);
        return nuevo;
    }

    public void listForStatus(boolean status)
    {
        if(employees!=null)
        {
            for (Employee x : employees)
            {
                if(x.isActivo()==status)
                {
                    System.out.println(x);
                }
            }
        }
    }

    public void increaseSalary(int dni, int rise) throws Exception
    {
        Employee emp = searchForDni(dni);
        if(emp!=null)
        {
            emp.setBaseSalary(emp.getBaseSalary() + (emp.getBaseSalary()*(float)(rise / 100)));
            System.out.println(emp);
        }else{
            System.out.println("\nEL EMPLEADO NO SE ENCONTRO");
        }

    }
    //TO STRING --------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "\n[ ADMINISTRATION DEPARTAMENT ]" +
                "\nCODE : " + getCode() +
                "\nEMPLOYEES : \n" + getEmployees() ;
    }

    //EQUALS -----------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdministrationDepartment that = (AdministrationDepartment) o;
        return code == that.code;
    }

}

