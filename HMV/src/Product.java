public class Product {

    //PROPERTIES -------------------------------------------------------------------------------------------------------
    private static int idCont = 1;
    private int id;
    private String name;
    private float priceUnit;
    private float weight;

    //CONSTRUCTORS -----------------------------------------------------------------------------------------------------
    public Product(String name,float priceUnit, float weight) {
        setName(name);
        setId();
        setPriceUnit(priceUnit);
        setWeight(weight);
    }

    public Product()
    {
        setId();
    }

    //GETTERS & SETTERS ------------------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = idCont;
        idCont++;
    }

    public float getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(float priceUnit) {
        this.priceUnit = priceUnit;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    //TO STRING --------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {

        String messagerFormat = "\t\tID : %d\t\tNAME : %s\t\tWEIGHT : %.2f\t\tUNIT PRICE : %.2f";
        return String.format(messagerFormat,getId(),getName(),getWeight(),getPriceUnit());
    }

    //EQUALS -----------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

}
