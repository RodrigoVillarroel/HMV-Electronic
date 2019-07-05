public class Processor extends Product {

    //PROPERTIES -------------------------------------------------------------------------------------------------------
    private int quantityCore;
    private float speed;
    private String generation;

    //CONSTRUCTORS -----------------------------------------------------------------------------------------------------
    public Processor(String name,float priceUnit, float weight, int quantityCore, float speed, String generation) {
        super(name,priceUnit, weight);
        setQuantityCore(quantityCore);
        setSpeed(speed);
        setGeneration(generation);
    }

    public Processor() {
        super();
    }

    //GETTERS & SETTERS ------------------------------------------------------------------------------------------------
    public int getQuantityCore() {
        return quantityCore;
    }

    public void setQuantityCore(int quantityCore) {
        this.quantityCore = quantityCore;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    //TO STRING --------------------------------------------------------------------------------------------------------
    @Override
    public String toString()
    {
        String messagerFormat = "\t\tQUANTITY CORE : %d\t\tSPEED : %.2fGhz\t\tGENERATION : %s";
                return "\t\t"+super.toString().concat(String.format(messagerFormat,getQuantityCore(),getSpeed(),getGeneration()));
    }

    //EQUALS -----------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
