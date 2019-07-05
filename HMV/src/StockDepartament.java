import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class StockDepartament implements ProductActions {

    //PROPERTIES -------------------------------------------------------------------------------------------------------
    private int code = 3;
    private ArrayList<Item> products;

    //CONSTRUCTORS -----------------------------------------------------------------------------------------------------
    public StockDepartament() {
        setProducts();
    }

    //GETTERS & SETTERS ------------------------------------------------------------------------------------------------
    public int getCode() {
        return code;
    }

    public List<Item> getProducts() {
        return products;
    }

    public void setProducts() {
        products = new ArrayList<Item>();
    }

    //METHODS OF INTERFACE ---------------------------------------------------------------------------------------------
    @Override
    public Object search(int num) {
        Item x = null;
        if (products != null) {
            for (Item pro : products) {

                if (pro.getProduct().getId() == num) {
                    x = new Item();
                    x = pro;
                }
            }
        }
        return x;
    }

    @Override
    public void addx(Object obj) {
        if (products != null) {
            products.add((Item) obj);
        }
    }

    @Override
    public Object delete(int num) {
        Item x = null;
        if (products != null) {
            x = (Item) search(num);
            if (x != null) {
                products.remove(x);
            }
        }

        return x;
    }

    @Override
    public void list() {
        if (products != null) {
            for (Item x : products
            ) {
                System.out.println(x);
            }
        } else
            System.out.println("NO SE ENCONTRARON PRODUCTOS...");

    }

    @Override
    public Object searchForName(String x) {
        Item pro = null;
        if (products != null) {
            for (Item it : products
            ) {
                if (it.getProduct().getName().equals(x)) {
                    pro = new Item();
                    pro = it;
                }
            }
        }
        return pro;
    }

    @Override
    public Object searchTypeProduct(String x) {
        ArrayList<Item> p = null;
        if (products != null) {
            p = new ArrayList<>();
            for (Item pro : products
            ) {
                if (pro.getProduct().getClass().getName() == x) {
                    p.add(pro);
                }
            }
        }
        return p;
    }

    @Override
    public int getQuantityProduct(String x) {
       /* int quantity = 0;
        if(products!=null)
        {
            ArrayList a = null;
            a=
        }
    }*/
        return 0;
    }

    @Override
    public void decreaseQuantity(int id, int quantity) {
        if (products != null) {
            Item it = (Item) search(id);
            if (it != null) {
                if (quantity <= it.getCant())
                    it.setCant(it.getCant() - quantity);
                else
                    System.out.println("la cantidad a eliminar es superior al stock");
            }
        }
    }

    @Override
    public void increaseQuantity(int id, int quantity) {
        if (products != null) {
            Item it = (Item) search(id);
            if (it != null) {
                if (quantity <= it.getCant())
                    it.setCant(it.getCant() + quantity);
            }
        }
    }
    //METHODS ----------------------------------------------------------------------------------------------------------

    public void addProcesorForKeyboard() {
        Scanner scanner = new Scanner(System.in);
        Item aIngresar = new Item();
        Processor processor = new Processor();
        System.out.println("\nPROCESSOR:");
        System.out.println("\nIngrese nombre:");
        processor.setName(scanner.next());
        System.out.println("\nIngrese peso:");
        processor.setWeight(scanner.nextFloat());
        System.out.println("\nIngrese valor:");
        processor.setPriceUnit(scanner.nextFloat());
        System.out.println("\nIngrese generacion:");
        processor.setGeneration(scanner.next());
        System.out.println("\nIngrese cantidad de nucleos:");
        processor.setQuantityCore(scanner.nextInt());
        System.out.println("\nIngrese velocidad:");
        processor.setSpeed(scanner.nextFloat());
        System.out.println("\nIngrese cantidad de unidades:");
        aIngresar.setCant(scanner.nextInt());
        //System.out.println(aIngresar);
        System.out.println("\ndesea cargarlo?\n 1 - si \n2 - no");

        if (scanner.nextInt() == 1) {
            aIngresar.setProduct(processor);
            addx(aIngresar);
        }
    }

    public void addRamForKeyboard() {
        Scanner scanner = new Scanner(System.in);
        Item aIngresar = new Item();
        Ram ram = new Ram();
        System.out.println("\nRAM:");
        System.out.println("\nIngrese nombre:");
        ram.setName(scanner.next());
        System.out.println("\nIngrese peso:");
        ram.setWeight(scanner.nextFloat());
        System.out.println("\nIngrese valor:");
        ram.setPriceUnit(scanner.nextFloat());
        System.out.println("\nIngrese velocidad:");
        ram.setSpeed(scanner.nextFloat());
        System.out.println("\nIngrese capacidad: ");
        ram.setCapacity(scanner.nextInt());
        System.out.println("\nIngrese cantidad de unidades:");
        aIngresar.setCant(scanner.nextInt());

        System.out.println("\ndesea cargarlo?\n 1 - si \n2 - no");

        if (scanner.nextInt() == 1) {
            aIngresar.setProduct(ram);
            addx(aIngresar);
        }

    }


    public void  addRomForKeyboard() {
        Scanner scanner = new Scanner(System.in);
        Item aIngresar = new Item();
        Rom rom = new Rom();
        System.out.println("\nROM:");
        System.out.println("\nIngrese nombre:");
        rom.setName(scanner.next());
        System.out.println("\nIngrese peso:");
        rom.setWeight(scanner.nextFloat());
        System.out.println("\nIngrese valor:");
        rom.setPriceUnit(scanner.nextFloat());
        System.out.println("\nIngrese velocidad:");
        rom.setSpeed(scanner.nextFloat());
        System.out.println("\nIngrese capacidad: ");
        rom.setCapacity(scanner.nextInt());
        System.out.println("\nIngrese tipo: ");
        rom.setTipo(scanner.next());
        System.out.println("\nIngrese cantidad de unidades:");
        aIngresar.setCant(scanner.nextInt());

        System.out.println("\ndesea cargarlo?\n 1 - si \n2 - no");

        if (scanner.nextInt() == 1) {
            aIngresar.setProduct(rom);
            addx(aIngresar);
        }
    }

    void addPowerSupplyForKeyboard(){
        Scanner scanner = new Scanner(System.in);
        Item aIngresar = new Item();
        PowerSupply powerSupply = new PowerSupply();
        System.out.println("\nPOWER SUPPLY:");
        System.out.println("\nIngrese nombre:");
        powerSupply.setName(scanner.next());
        System.out.println("\nIngrese peso:");
        powerSupply.setWeight(scanner.nextFloat());
        System.out.println("\nIngrese valor:");
        powerSupply.setPriceUnit(scanner.nextFloat());
        System.out.println("\nIngrese watts:");
        powerSupply.setWatts(scanner.nextInt());
        System.out.println("\nIngrese tipo: ");
        powerSupply.setTipo(scanner.next());
        System.out.println("\nIngrese cantidad de unidades:");
        aIngresar.setCant(scanner.nextInt());

        System.out.println("\ndesea cargarlo?\n 1 - si \n2 - no");

        if (scanner.nextInt() == 1) {
            aIngresar.setProduct(powerSupply);
            addx(aIngresar);
        }
    }

    void addSmartphoneForKeyboard(){
        Processor x = new Processor();
    }

    void addComputerForKeyboard(){
        Processor x = new Processor();
    }

    //TO STRING --------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "\n[ STOCK DEPARTAMENT ]" +
                "\nCODE :" + getCode() +
                "\nPRODUCTS:\n" + getProducts();
    }

    //EQUALS -----------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockDepartament that = (StockDepartament) o;
        return code == that.code;
    }
}
