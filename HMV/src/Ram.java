public class Ram extends Product {

    //PROPERTIES -------------------------------------------------------------------------------------------------------
    private float speed;
    private int capacity;

    //CONSTRUCTORS -----------------------------------------------------------------------------------------------------
    public Ram(String name,float priceUnit, float weight, float speed, int capacity) {
        super(name,priceUnit, weight);
        setSpeed(speed);
        setCapacity(capacity);
    }

    public Ram() {
        super();
    }

    //GETTERS & SETTERS ------------------------------------------------------------------------------------------------
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

    //TO STRING --------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        String messagerFormat = "\t\tCAPACITY : %dGB\t\tSPEED : %.2fGhz";
        return "\t\t" +super.toString().concat(String.format(messagerFormat,getCapacity(),getSpeed()));
    }

    //EQUALS -----------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
