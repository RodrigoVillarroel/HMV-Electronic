public class Rom extends Product {

    //PROPERTIES -------------------------------------------------------------------------------------------------------
    private String tipo;
    private float speed;
    private int capacity;

    //CONSTRUCTORS -----------------------------------------------------------------------------------------------------
    public Rom(String name,float priceUnit, float weight,String tipo, float speed, int capacity) {
        super(name,priceUnit, weight);
        setTipo(tipo);
        setSpeed(speed);
        setCapacity(capacity);
    }

    public Rom() {
        super();

    }

    //GETTERS & SETTERS ------------------------------------------------------------------------------------------------
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //TO STRING
    @Override
    public String toString() {
        String messager = "\t\tTIPO : %s \t\tCAPACITY : %dGB \t\tSPEDD : %.2fGhz";
        return "\t\t"+super.toString().concat(String.format(messager,getTipo(),getCapacity(),getSpeed()));
    }

    //EQUALS -----------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
