public interface ProductActions extends BaseActions {

    Object searchTypeProduct (String x) throws Exception;
    Object searchForName (String name) throws Exception;
    int getQuantityProduct (String x) throws Exception;
    void decreaseQuantity(int id, int quantity)throws Exception;
    void increaseQuantity(int id, int quantity)throws Exception;

}
