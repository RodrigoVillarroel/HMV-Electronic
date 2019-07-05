import java.util.Objects;

public class Item {

    //PROPERTIES -------------------------------------------------------------------------------------------------------
    private Product product;
    private int cant;

    //CONSTRUCTORS -----------------------------------------------------------------------------------------------------
    public Item(Product product, int cant) {
        setProduct(product);
        setCant(cant);
    }

    public Item(){}

    public Item(Product product)
    {
        setProduct(product);
    }

    //GETTERS & SETTERS ------------------------------------------------------------------------------------------------
    public Product getProduct() {

        return product;
    }

    public void setProduct(Product product) {
        if(product!=null)
            this.product = product;
    }

    public int getCant() {

        return cant;
    }

    public void setCant(int cant) {
        if(cant>=0)
            this.cant = cant;
        else
            System.out.println("Debe ingresar una cantidad mayor a 0");
    }


    //METHODS ----------------------------------------------------------------------------------------------------------
    public float calculatePrecio(){
        return getProduct().getPriceUnit()*getCant();
    }

    //TO STRING --------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {

        return "\n"+getProduct().getClass().getName()+"\nID : "+getProduct().getId()+"\nNAME :"+getProduct().getName()+"\nPRICE UNIT : "+getProduct().getPriceUnit()+"\nCANT : "+getCant()+ "\nPRICE TOTAL: "+calculatePrecio();
    }

    //EQUALS -----------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(product, item.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }
}
