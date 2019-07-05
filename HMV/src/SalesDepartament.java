import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class SalesDepartament implements BaseActions {

    //PROPERTIES -------------------------------------------------------------------------------------------------------
    private int code = 2;
    private ArrayList<Receipt>receipts;

    //CONSTRUCTORS -----------------------------------------------------------------------------------------------------
    public SalesDepartament() {
        setReceipts();
    }

    //GETTERS & SETTERS ------------------------------------------------------------------------------------------------
    public int getCode() {
        return code;
    }

    public ArrayList<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts() {
        receipts = new ArrayList<Receipt>();
    }

    //METHODS OF INTERFACE ---------------------------------------------------------------------------------------------
    @Override
    public void addx(Object obj) {
        if(receipts!=null)
        {
            receipts.add((Receipt) obj);
        }
    }

    @Override
    public Object delete(int num) {
        Receipt x =null;
        if(receipts!=null) {
            x = (Receipt)search(num);
            if(x!=null)
            {
                receipts.remove(x);
            }
        }

        return x;
    }

    @Override
    public Object search(int num) {
        Receipt x = null;
        if(receipts!=null) {
            for (Receipt pro : receipts) {

                if (pro.getNumber() == num) {
                    x = new Receipt();
                    x = pro;
                }
            }
        }
        return x;
    }

    @Override
    public void list() {
        if(receipts!=null)
        {
            for (Receipt x: receipts
                 ) {
                System.out.println(x);
            }
        }
    }

    //METHODS ----------------------------------------------------------------------------------------------------------
    public Customer LoadCustomerForKeyboard()
    {
        int dato;
        String palabra;
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nINGRESE NOMBRE DEL CLIENTE : ");
        customer.setName(palabra=scanner.next());
        System.out.println("\nINGRESE APELLIDO DEL CLIENTE : ");
        customer.setSurname(palabra=scanner.next());
        System.out.println("\nINGRESE DNI : ");
        customer.setDni(dato=scanner.nextInt());
        System.out.println(customer);

        return customer;
    }
    public void listForStatus(boolean status)
    {
        if(receipts!=null)
        {
            for (Receipt x: receipts
                 ) {
                if(x.getPagado()==status)
                {
                    System.out.println(x);
                }
            }
        }
    }
    /*public Receipt EmitReceipts()
    {
        Receipt receipt = new Receipt();
        System.out.println("\nFACTURA :");
        receipt.setCustomer(LoadCustomerForKeyboard());
        if(receipt.getCustomer()!=null)
        {
            Item x = new Item()
            //buscar y cargar item cargar items
            //if(receipt.getItems!=null)
            //desea emitir factura?
            //if(option==1)
            //this.addx.receipt;
        }
    }*/

    //TO STRING --------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "\n[ SALES DEPARTAMENT ]" +
                "\nCODE :" + getCode() +
                "\nRECEIPTS :\n" + getReceipts();
    }

    //EQUALS -----------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesDepartament that = (SalesDepartament) o;
        return code == that.code;
    }

}
