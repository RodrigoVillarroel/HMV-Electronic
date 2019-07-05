import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.util.*;

public class Receipt implements BaseActions{

    //PROPERTIES -------------------------------------------------------------------------------------------------------
    private Customer customer;
    static int contN = 1;
    private int number;
    private String date;
    private List<Item> items;
    private Quota[] quotas;
    float montoTotal;
    Boolean pagado;


    //CONSTRUCTORS -----------------------------------------------------------------------------------------------------
    public Receipt(Customer customer,String date) {
        setCustomer(customer);
        setNumber();
        setItems();
        setDate(date);
    }

    public Receipt() {
        setNumber();
        setItems();
    }

    //SETTERS & GETTERS ------------------------------------------------------------------------------------------------

    public List<Item> getItems() {
        return items;
    }

    private void setItems() {
        items = new ArrayList<Item>();
    }

    public Quota[] getQuotas() {
        return quotas;
    }

    public void setQuotas(int nun) {
        this.quotas = new Quota[nun];
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if(customer != null)
            this.customer = customer;
        //this.customer = customer != null ? this.customer = null ;
    }

    public int getNumber() {
        return number;
    }

    private void setNumber() {
        this.number = contN;
        contN++;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }

    //METHODS ----------------------------------------------------------------------------------------------------------
    public void addItem(Item itemToAdd){
        try{
            if (this.items.contains(itemToAdd)) {
                addCant(itemToAdd);
            } else
                this.items.add(itemToAdd);
        }
        catch (Exception E){
            System.out.println(E.getMessage());
        }
    }

    private void addCant(Item itemToAdd){
        for(Item it : this.items){
            if(it.equals(itemToAdd))
                it.setCant(it.getCant()+itemToAdd.getCant());
        }
    }

    public void deleteItem(Item itemToErase){
        try{
            if (this.items.contains(itemToErase))
                this.items.remove(itemToErase);
        }
        catch (Exception E){
            System.out.println(E.getMessage());
        }
    }

    public void listItems(){
        if(items!=null) {
            for (Item it : items)
                System.out.println(it);
        }
    }

    public float calcularTotal(){
        float total = 0;
        if(items!=null) {
            for (Item it : items) {
                total += it.calculatePrecio();
            }
        }
        return total;
    }

    public void addQuota(float value)
    {
        for (int i = 0; i<getQuotas().length;i++)
        {
            Quota x = new Quota(value);
            quotas[i]=x;
        }
    }
    // METHODS OF INTERFACE --------------------------------------------------------------------------------------------
    @Override
    public Object search(int num) {
        Item x = null;
        if(items!=null) {
            for (Item pro : items) {

                if (pro.getProduct().getId() == num) {
                    x = new Item();
                    x = pro;
                }
            }
        }
        return x;
    }

    @Override
    public Object delete(int num) {
        Item x =null;
        if(items!=null) {
            x = (Item) search(num);
            if(x!=null)
            {
                items.remove(x);
            }
        }

        return x;
    }

    @Override
    public void list() {
        if(items!=null)
            for (Item x: items
            ) {
                System.out.println(x);
            }
    }

    @Override
    public void addx(Object obj) {
        if(items!=null)
        {
            items.add((Item) obj);
        }
    }



    //TO STRING --------------------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return "\nRECEIPT : " + getCustomer() +
                "\nNRO : " + getNumber() +
                "\nDATE : " + getDate() + getItems() +
                Arrays.toString(getQuotas()) +
                "\nMONTO TOTAL : " + getMontoTotal() +
                "\nPAGADO :" + getPagado();
    }

    //EQUALS -----------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipt receipt = (Receipt) o;
        return number == receipt.number;
    }
}
