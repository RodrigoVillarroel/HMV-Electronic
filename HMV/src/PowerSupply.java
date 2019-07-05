public class PowerSupply extends Product {

    //PROPERTIES -------------------------------------------------------------------------------------------------------
    private String tipo;
    private int watts;

    //CONSTRUCTORS -----------------------------------------------------------------------------------------------------
    public PowerSupply(String name,float priceUnit, float weight, String tipo, int watts) {
        super(name,priceUnit, weight);
        setTipo(tipo);
        setWatts(watts);
    }

    public PowerSupply() {
        super();
    }

    //GETTERS & SETTERS ------------------------------------------------------------------------------------------------
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    //TO STRING --------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        String messager = "\t\tTIPO : %s \t\tWATTS : %dW ";
        return 	"\t\t"+super.toString().concat(String.format(messager,getTipo(),getWatts()));
    }

    //EQUALS -----------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
