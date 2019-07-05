import java.util.Objects;

public class Quota {

    //PROPERTIES -------------------------------------------------------------------------------------------------------
    private int id;
    private static int idCont = 1;
    private float monto;
    private boolean pagado;

    //CONSTRUCTORS -----------------------------------------------------------------------------------------------------
    public Quota(float monto)
    {
        setId();
        setMonto(monto);
    }
    //GETTERS & SETTERS ------------------------------------------------------------------------------------------------
    public int getId() {
        return id;
    }

    private void setId() {
        this.id = idCont;
        idCont++;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }


    //METHODS ----------------------------------------------------------------------------------------------------------

    //TO STRING --------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return  "\n[ QUOTA ]" +
                "\t\tID :" + getId() +
                "\t\tMONTO :" + getMonto() +
                "\t\tPAGADO : " + isPagado() ;
    }

    //EQUALS -----------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quota quota = (Quota) o;
        return id == quota.id;
    }

}
