
import sun.awt.AWTAccessor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {


        //###################################################################################################

        //PROCESSORS
        Processor a = new Processor("Kirin", 1200.f, 0.12f, 2, 1.6f, "5ta");
        Processor b = new Processor("Amd", 3500.f, 0.250f, 4, 2.2f, "5ta");
        Processor c = new Processor("Intel", 4000.f, 0.250f, 4, 2.4f, "5ta");
        Processor d = new Processor("SnapDragon", 1500.f, 0.1f, 2, 2.0f, "5ta");

        //RAM
        Ram e = new Ram("KingStone", 2000.0f, 0.2f, 1.2f, 2);
        Ram f = new Ram("Corsair", 2500.0f, 0.2f, 1.4f, 4);
        Ram g = new Ram("Hyper", 3500.0f, 0.2f, 1.6f, 8);
        Ram h = new Ram("Skill", 2700.0f, 0.2f, 1.5f, 4);

        //ROM
        Rom i = new Rom("WesterDigital", 1000f, 0.5f, "Solido", 1.5f, 128);
        Rom j = new Rom("Hitachi", 3000f, 0.5f, "Solido", 1.5f, 1000);
        Rom k = new Rom("Seagate", 1700f, 0.5f, "Solido", 1.5f, 640);
        Rom l = new Rom("Toshiba", 1000f, 0.5f, "Solido", 1.5f, 128);

        //POWER SUPPLY
        PowerSupply m = new PowerSupply("Seasonic", 1500f, 0.7f, "Generica", 600);
        PowerSupply n = new PowerSupply("Corsair", 2500f, 1.1f, "Real", 850);
        PowerSupply ñ = new PowerSupply("Antec", 1200f, 0.6f, "Generica", 500);
        PowerSupply o = new PowerSupply("EVGA", 1500f, 0.95f, "Real", 600);

        //COMPUTERS
        Computer p = new Computer("EuroCase", "Windows", e, l, ñ, b, "USB x2,HDMI x1, VGA x1");
        Computer q = new Computer("Corsair", "Windows", g, j, n, c, "USB x4,HDMI x2, VGA x1");

        //SMARTPHONES
        Smartphone r = new Smartphone("Samsung j7", 16000, 0.25f, a, 64, f, "Android 7", 3000, "720 hd", "8 megapixeles", "15x7", "Mini USB, Jack 3.5");
        Smartphone s = new Smartphone("Motorola One", 18000, 0.2f, d, 64, h, "Android 9.1", 3300, "1080 full hd", "16 megapixeles", "14x6", "USB tipoC, Jack 3.5");

        //EMPLOYEES
        Employee e1 = new Employee("Matias", "Oliva", 123456789, 1, 22000f);
        Employee e2 = new Employee("Cristiana", "Perez", 987654321, 1, 24000f);
        Employee e3 = new Employee("Pablo", "Rodriguez", 222222222, 2, 30000f);
        Employee e4 = new Employee("Lucia", "Lopez", 333333333, 2, 22000f);
        Employee e5 = new Employee("Diego", "Gomez", 444444444, 3, 24000f);
        Employee e6 = new Employee("Romina", "Ibañez", 555555555, 3, 24000f);

        //CUSTOMERS
        Customer c1 = new Customer("Fernanda", "Estevez", 20032421);
        Customer c2 = new Customer("Alan", "Benitez", 23032421);
        Customer c3 = new Customer("Franco", "Saenz", 21032421);
        Customer c4 = new Customer("Natalia", "Gimenez", 20032421);
        Customer c5 = new Customer("Ignacio", "Mendez", 22032421);

        //ITEMS
        Item i0 = new Item(a, 5);
        Item i1 = new Item(b, 6);
        Item i2 = new Item(c, 4);
        Item i19 = new Item(d, 4);
        Item i3 = new Item(e, 6);
        Item i4 = new Item(f, 3);
        Item i5 = new Item(g, 8);
        Item i6 = new Item(h, 5);
        Item i7 = new Item(i, 2);
        Item i8 = new Item(j, 1);
        Item i9 = new Item(k, 9);
        Item i10 = new Item(l, 9);
        Item i11 = new Item(m, 7);
        Item i12 = new Item(n, 4);
        Item i13 = new Item(ñ, 8);
        Item i14 = new Item(o, 3);
        Item i15 = new Item(p, 4);
        Item i16 = new Item(q, 2);
        Item i17 = new Item(r, 1);
        Item i18 = new Item(s, 5);

        Receipt r1 = new Receipt();

        //###########################################################################################################

        AdministrationDepartment administrationDepartment = new AdministrationDepartment();
        administrationDepartment.addx(e1);
        administrationDepartment.addx(e2);
        administrationDepartment.addx(e3);
        administrationDepartment.addx(e4);
        administrationDepartment.addx(e5);
        administrationDepartment.addx(e6);

        SalesDepartament salesDepartament = new SalesDepartament();

        StockDepartament stockDepartament = new StockDepartament();
        stockDepartament.addx(i0);
        stockDepartament.addx(i1);
        stockDepartament.addx(i2);
        stockDepartament.addx(i19);
        stockDepartament.addx(i3);
        stockDepartament.addx(i4);
        stockDepartament.addx(i5);
        stockDepartament.addx(i6);
        stockDepartament.addx(i7);
        stockDepartament.addx(i8);
        stockDepartament.addx(i9);
        stockDepartament.addx(i10);
        stockDepartament.addx(i11);
        stockDepartament.addx(i12);
        stockDepartament.addx(i13);
        stockDepartament.addx(i14);
        stockDepartament.addx(i15);
        stockDepartament.addx(i16);
        stockDepartament.addx(i17);
        stockDepartament.addx(i18);


        int option_1 = 1;
        int option_2 = 1;
        int option_3 = 1;
        int option_4 = 1;
        int option;
        int dato;
        String repetir = "s";
        String palabra;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nINGRESE SU DNI : ");
            option = scanner.nextInt();
            Employee principal = administrationDepartment.searchForDni(option);
            if (principal != null&&principal.isActivo()) {
                switch (principal.getSector()) {
                    case 1://departamento administrativo
                        System.out.println("BIENVENIDO : "+principal.getName()+" "+principal.getSurname());
                        do {
                            Employee seleccionado;
                            System.out.println(" \nDEPARTAMENTO ADMINISTRATIVO");
                            System.out.println(" \n1 - AGREGAR" +
                                    "\n2 - DAR DE BAJA / ALTA" +
                                    "\n3 - MODIFICAR" +
                                    "\n4 - CONSULTAR" +
                                    "\n5 - ELIMINAR" +
                                    "\n6 - APLICAR AUMENTO" +
                                    "\n0 - VOLVER");
                            option = scanner.nextInt();
                            switch (option) {
                                case 1://agregar
                                    System.out.println("\n1 - AGREGAR");
                                    seleccionado = administrationDepartment.loadEmployeForKeyboar();
                                    System.out.println("CARGAR ? S/N");
                                    repetir=scanner.next();
                                    if(repetir.equals("s")||repetir.equals("S"))
                                    {
                                        administrationDepartment.addx(seleccionado);
                                    }
                                    break;
                                case 2://dar de baja / alta
                                    System.out.println("\n2 - DAR DE BAJA / ALTA");
                                    System.out.println("INGRESE DNI DEL EMPLEADO : ");
                                    dato = scanner.nextInt();
                                    seleccionado = administrationDepartment.searchForDni(dato);
                                    if(seleccionado!=null)
                                    {
                                        System.out.println(seleccionado);
                                        if(seleccionado.isActivo())
                                        {
                                            System.out.println("DESEA DAR DE BAJA ? S/N");
                                            repetir = scanner.next();
                                            if (repetir.equals("s")||repetir.equals("S"))
                                            {
                                                seleccionado.setActivo(false);
                                            }
                                        }else
                                        {
                                            System.out.println("DESEA DAR DE ALTA ? S/N");
                                            repetir = scanner.next();
                                            if (repetir.equals("s")||repetir.equals("S"))
                                            {
                                                seleccionado.setActivo(true);
                                            }
                                        }
                                    }
                                    break;
                                case 3://modificar
                                    System.out.println("INGRESE DNI DEL EMPLEADO A MODIFICA : ");
                                    dato = scanner.nextInt();
                                    seleccionado = administrationDepartment.searchForDni(dato);
                                    if(seleccionado!=null) {
                                        System.out.println(seleccionado);
                                        do {
                                            System.out.println("\n3 - MODIFICAR");
                                            System.out.println("\n1 - NOMBRE" +
                                                    "\n2 - APELLIDO" +
                                                    "\n3 - DNI " +
                                                    "\n4 - CAMBIAR SECTOR" +
                                                    "\n0 - VOLVER");
                                            option_1 = scanner.nextInt();
                                            switch (option_1) {
                                                case 1://nombre
                                                    System.out.println("\n1 - NOMBRE");
                                                    System.out.println("INGRESE NUEVO NOMBRE :");
                                                    palabra = scanner.next();
                                                    seleccionado.setName(palabra);
                                                    break;
                                                case 2://apellido
                                                    System.out.println("\n2 - APELLIDO");
                                                    System.out.println("INGRESE NUEVO APELLIDO :");
                                                    palabra = scanner.next();
                                                    seleccionado.setSurname(palabra);
                                                    break;
                                                case 3://dni
                                                    System.out.println("\n3 - DNI");
                                                    System.out.println("INGRESE NUEVO DNI :");
                                                    dato = scanner.nextInt();
                                                    seleccionado.setDni(dato);
                                                    break;
                                                case 4://cambiar sector
                                                    do {
                                                        System.out.println(" \n4 - CAMBIAR SECTOR");
                                                        System.out.println(" \n1 - DEPARTAMENTO ADMINISTRATIVO" +
                                                                "\n2 - DEPARTAMENTO DE VENTA" +
                                                                "\n3 - DEPARTAMENTO DE STOCK" +
                                                                "\n0 - VOLVER");
                                                        option_2 = scanner.nextInt();
                                                        switch (option_2) {
                                                            case 1://departamento administrativo
                                                                seleccionado.setSector(1);
                                                                System.out.println("\n1 - DEPARTAMENTO ADMINISTRATIVO");
                                                                break;
                                                            case 2://departamento de venta
                                                                seleccionado.setSector(2);
                                                                System.out.println("\n2 - DEPARTAMENTO DE VENTA");
                                                                break;
                                                            case 3://departamento de stock
                                                                seleccionado.setSector(3);
                                                                System.out.println("\n3 - DEPARTAMENTO DE STOCK");
                                                                break;
                                                            case 0:
                                                                break;
                                                            default:
                                                                System.out.println("OPCION INCORRECTA...");
                                                                break;
                                                        }
                                                    } while (option_2 != 0);
                                                    break;
                                                case 0:
                                                    break;
                                                default:
                                                    System.out.println("OPCION INCORRECTA...");
                                                    break;
                                            }
                                        } while (option_1 != 0);
                                    }
                                    break;
                                case 4://consultas
                                    do {
                                        System.out.println(" \n4 - CONSULTAR");
                                        System.out.println(" \n1 - CATEGORIA " +
                                                "\n2 - BUSCAR" +
                                                "\n3 - LISTAR" +
                                                "\n0 - VOLVER");
                                        option_1 = scanner.nextInt();
                                        switch (option_1) {
                                            case 1://categoria
                                                ArrayList<Employee> eml = new ArrayList<Employee>();
                                                do {
                                                    System.out.println(" \n1 - CATEGORIA ");
                                                    System.out.println(" \n1 - DEPARTAMENTO ADMINISTRATIVO" +
                                                            "\n2 - DEPARTAMENTO DE VENTA" +
                                                            "\n3 - DEPARTAMENTO DE STOCK" +
                                                            "\n0 - VOLVER");
                                                    option_2 = scanner.nextInt();
                                                    switch (option_2) {
                                                        case 1://departamento administrativo
                                                            System.out.println(" \n1 - DEPARTAMENTO ADMINISTRATIVO");
                                                            eml = administrationDepartment.searchForDepartament(1);
                                                            if(eml!=null)
                                                                System.out.println(eml);
                                                            break;
                                                        case 2://departamento de venta
                                                            System.out.println("\n2 - DEPARTAMENTO DE VENTA");
                                                            eml = administrationDepartment.searchForDepartament(2);
                                                            if(eml!=null)
                                                                System.out.println(eml);
                                                            break;
                                                        case 3://departamento de stock
                                                            System.out.println("\n3 - DEPARTAMENTO DE STOCK");
                                                            eml = administrationDepartment.searchForDepartament(3);
                                                            if(eml!=null)
                                                                System.out.println(eml);
                                                            break;
                                                        case 0:
                                                            break;
                                                        default:
                                                            System.out.println("OPCION INCORRECTA...");
                                                            break;
                                                    }
                                                } while (option_2 != 0);
                                                break;
                                            case 2://buscar
                                                do {
                                                    System.out.println("\n2 - BUSCAR");
                                                    System.out.println("\n1 - POR DNI" +
                                                            "\n2 - POR ID" +
                                                            "\n0 - VOLVER");
                                                    option_2 = scanner.nextInt();
                                                    switch (option_2) {
                                                        case 1://por dni
                                                            System.out.println("\n1 - POR DNI");
                                                            dato = scanner.nextInt();
                                                            seleccionado = administrationDepartment.searchForDni(dato);
                                                            if(seleccionado!=null)
                                                                System.out.println(seleccionado);
                                                            break;
                                                        case 2://por id
                                                            System.out.println("\n2 - POR ID ");
                                                            dato = scanner.nextInt();
                                                            seleccionado = (Employee) administrationDepartment.search(dato);
                                                            if(seleccionado!=null)
                                                                System.out.println(seleccionado);
                                                            break;
                                                        case 0:
                                                            break;
                                                        default:
                                                            System.out.println("OPCION INCORRECTA...");
                                                            break;
                                                    }
                                                } while (option_2 != 0);
                                                break;
                                            case 3://listar
                                                do {
                                                    System.out.println("\n3 - LISTAR");
                                                    System.out.println("\n1 - TODOS"+
                                                                    "\n2 - ACTIVOS"+
                                                                    "\n3 - INACTIVOS"+
                                                                    "\n0 - VOLVER");
                                                    option_4 = scanner.nextInt();
                                                    switch (option_4)
                                                    {
                                                        case 1:
                                                            administrationDepartment.list();
                                                            break;
                                                        case 2:
                                                            administrationDepartment.listForStatus(true);
                                                            break;
                                                        case 3:
                                                            administrationDepartment.listForStatus(false);
                                                            break;
                                                        case 0:
                                                            break;
                                                        default:
                                                            System.out.println("OPCION INCORRECTA...");
                                                            break;
                                                    }
                                                }while (option_4!=0);
                                                break;
                                            case 0:
                                                break;
                                            default:
                                                System.out.println("OPCION INCORRECTA...");
                                                break;
                                        }
                                    } while (option_1 != 0);
                                    break;
                                case 5://eliminar
                                    System.out.println("\nELIMINAR :");
                                    administrationDepartment.list();
                                    System.out.println("\nINGRESE ID DEL EMPLEADO A ELIMINAR :");
                                    dato = scanner.nextInt();
                                    seleccionado =(Employee)administrationDepartment.delete(dato);
                                    break;
                                case 6://incrementar salario
                                    System.out.println("INGRESE DNI DEL EMPLEADO A AUMENTAR SALARIO");
                                    dato = scanner.nextInt();
                                    seleccionado = administrationDepartment.searchForDni(dato);
                                    if(seleccionado!=null)
                                    {
                                        System.out.println(seleccionado);
                                        System.out.println("INGRESE PORCENTAJE A AUMENTAR");
                                        float porcentaje = scanner.nextFloat();
                                        System.out.println("DESEA AUMENTAR SALARIO?");
                                        repetir = scanner.next();
                                        if(repetir.equals("s")||repetir.equals("S")) {
                                            seleccionado.setBaseSalary(seleccionado.getBaseSalary() + (seleccionado.getBaseSalary() * porcentaje));
                                            System.out.println(seleccionado);
                                        }
                                    }
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("OPCION INCORRECTA...");
                                    break;
                            }
                        } while (option != 0);
                        break;
                    case 2://departamento de ventas
                        do {
                            System.out.println(" \nDEPARTAMENTO DE VENTA");
                            System.out.println(" \n1 - EMITIR FACTURA " +
                                    "\n2 - PAGAR " +
                                    "\n3 - CONSULTAR" +
                                    "\n0 - VOLVER");
                            option = scanner.nextInt();
                            switch (option) {
                                case 1://emitir factura
                                    System.out.println(" \n1 - EMITIR FACTURA ");
                                    float precio;
                                    Customer nuevo = salesDepartament.LoadCustomerForKeyboard();
                                    Receipt nueva = new Receipt();
                                    Item aBuscar;
                                    System.out.println("AGREGAR ? S/N");
                                    repetir = scanner.next();
                                    if(repetir.equals("s")||repetir.equals("S")) {
                                        nueva.setCustomer(nuevo);
                                        System.out.println("\nAGREGAR PRODUCTO/s : ");
                                        do {
                                            stockDepartament.list();
                                            System.out.println("\nINGRESE ID DEL PRODUCTO A SELECCIONAR :");
                                            dato = scanner.nextInt();
                                            aBuscar = (Item)stockDepartament.search(dato);
                                            if(aBuscar!=null&&aBuscar.getCant()>0) {
                                                System.out.println("\nHAY EN STOCK : " + aBuscar.getCant());
                                                System.out.println("\nINGRESE CANTIDAD A VENDER :");
                                                dato = scanner.nextInt();
                                                if (dato <= aBuscar.getCant()) {
                                                    System.out.println("ACEPTAR? S/N");
                                                    repetir = scanner.next();
                                                    if (repetir.equals("S") || repetir.equals("s")) {
                                                        Item aing = new Item(aBuscar.getProduct(),dato);
                                                        nueva.addItem(aing);
                                                        stockDepartament.decreaseQuantity(aBuscar.getProduct().getId(),dato);
                                                    }
                                                }else {
                                                    System.out.println("\nNO HAY SUFICIENTE STOCK PARA CUBRIR LA VENTA...\nINGRESE CANTIDAD MENOR A "+aBuscar.getCant());
                                                    dato = scanner.nextInt();
                                                }

                                            }else
                                                System.out.println("\nEL PRODUCTO INGRESADO NO SE ENCUENTRA EN STOCK");
                                            System.out.println("\nDESEA AGREGAR OTRO PRODUCTO ? S/N");
                                            repetir = scanner.next();
                                        }while (repetir.equals("s")||repetir.equals("S"));
                                        System.out.println(" \n1 - EMITIR FACTURA ");
                                        System.out.println(" \n1 - PAGO EN EFECTIVO" +
                                                "\n2 - PAGO AL CONTADO / DEBITO" +
                                                "\n3 - CREDITO" +
                                                "\n0 - VOLVER");
                                        option_1 = scanner.nextInt();
                                        switch (option_1) {
                                            case 1://pago en efectivo
                                                System.out.println("\n1 - PAGO EN EFECTIVO");
                                                precio = nueva.calcularTotal() - (nueva.calcularTotal() * 0.1f);
                                                nueva.setMontoTotal(precio);
                                                nueva.setPagado(true);
                                                System.out.println(nueva);
                                                System.out.println("ACEPTAR FACTURA? S/N");
                                                repetir = scanner.next();
                                                if(repetir.equals("s")||repetir.equals("S"))
                                                    salesDepartament.addx(nueva);
                                                break;
                                            case 2://pago al contado/debito
                                                System.out.println("\n2 - PAGO AL CONTADO / DEBITO");
                                                nueva.setMontoTotal(nueva.calcularTotal());
                                                nueva.setPagado(true);
                                                System.out.println(nueva);
                                                System.out.println("ACEPTAR FACTURA? S/N");
                                                repetir = scanner.next();
                                                if(repetir.equals("s")||repetir.equals("S"))
                                                    salesDepartament.addx(nueva);
                                                break;
                                            case 3://credito
                                                System.out.println("\n3 - CREDITO");
                                                precio = nueva.calcularTotal() * 1.1f;
                                                nueva.setMontoTotal(precio);
                                                System.out.println("\nINGRESE CANTIDAD DE CUOTAS?");
                                                dato = scanner.nextInt();
                                                nueva.setQuotas(dato);
                                                System.out.println(precio);
                                                nueva.setMontoTotal(precio);
                                                nueva.addQuota(precio / dato);
                                                nueva.getQuotas()[0].setPagado(true);
                                                nueva.setPagado(false);
                                                System.out.println(nueva);
                                                System.out.println("ACEPTAR FACTURA? S/N");
                                                repetir = scanner.next();
                                                if(repetir.equals("s")||repetir.equals("S"))
                                                    salesDepartament.addx(nueva);
                                                break;
                                        }

                                    }
                                    break;
                                case 2://pagar
                                    System.out.println("\n2 - PAGAR ");
                                    System.out.println("\nINGRESE ID DE LA FACTURA A PAGAR");
                                    dato = scanner.nextInt();
                                    Receipt aPagar = (Receipt) salesDepartament.search(dato);
                                    if(aPagar!=null&&!aPagar.getPagado()) {
                                        System.out.println("INGRESE CUOTA A PAGAR :");
                                        dato = scanner.nextInt();
                                        if (aPagar.getQuotas()[dato - 1].isPagado()) {
                                            System.out.println("CUOTA PAGADA");
                                        } else {
                                            System.out.println("INGRESE MONTO :");
                                            int monto = scanner.nextInt();
                                            if (!aPagar.getQuotas()[dato - 1].isPagado() && monto >= aPagar.getQuotas()[dato - 1].getMonto()) {
                                                aPagar.getQuotas()[dato - 1].setPagado(true);
                                                if (aPagar.getQuotas().length == (dato)) {
                                                    aPagar.setPagado(true);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 3://consultar
                                    do {
                                        System.out.println("\n3 - CONSULTAR");
                                        System.out.println("\n1 - PAGADAS" +
                                                "\n2 -IMPAGAS" +
                                                "\n3 - LISTAR TODO" +
                                                "\n4 - BUSCAR" +
                                                "\n0 - VOLVER");
                                        option_1 = scanner.nextInt();
                                        switch (option_1) {
                                            case 1://pagadas
                                                System.out.println("\n1 - PAGADAS");
                                                salesDepartament.listForStatus(true);
                                                break;
                                            case 2://impagas
                                                System.out.println("\n2 -IMPAGAS");
                                                salesDepartament.listForStatus(false);
                                                break;
                                            case 3://listar todas
                                                System.out.println("\n3 - LISTAR TODO");
                                                salesDepartament.list();
                                                break;
                                            case 4://buscar por id
                                                System.out.println("\n4 - BUSCAR");
                                                System.out.println("\nINGRESE ID DE LA FACTURA A BUSCAR :");
                                                dato = scanner.nextInt();
                                                Receipt example = (Receipt)salesDepartament.search(dato);
                                                System.out.println(dato);
                                                break;
                                            default:
                                                System.out.println("OPCION INCORRECTA...");
                                                break;
                                        }
                                    } while (option_1 != 0);
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("OPCION INCORRECTA...");
                                    break;
                            }
                        } while (option != 0);
                        break;
                    case 3://departamento de stock
                        do {
                            System.out.println("\nDEPARTAMENTO DE STOCK");
                            System.out.println(" \n1 - AGREGAR" +
                                    "\n2 - CONSULTAR" +
                                    "\n3 - MODIFICAR STOCK" +
                                    "\n0 - VOLVER");
                            option = scanner.nextInt();
                            switch (option) {
                                case 1://agregar producto
                                    do {
                                        System.out.println("\n1 - AGREGAR");
                                        System.out.println(" \n1 - PROCESADOR" +
                                                "\n2 - RAM" +
                                                "\n3 - ROM" +
                                                "\n4 - POWER SUPPLY" +
                                                "\n5 - COMPUTER" +
                                                "\n6 - SMARTPHONE" +
                                                "\n0 - VOLVER");
                                        option_1 = scanner.nextInt();
                                        switch (option_1) {
                                            case 1://processor
                                                System.out.println("\n1 - PROCESADOR");
                                                stockDepartament.addProcesorForKeyboard();
                                                break;
                                            case 2://ram
                                                System.out.println("\n2 - RAM");
                                                stockDepartament.addRamForKeyboard();
                                                break;
                                            case 3://rom
                                                System.out.println("\n3 - ROM");
                                                stockDepartament.addRomForKeyboard();
                                                break;
                                            case 4://power supply
                                                System.out.println("\n4 - POWER SUPPLY");
                                                stockDepartament.addPowerSupplyForKeyboard();
                                                break;
                                            case 5://computer
                                                System.out.println("\n5 - COMPUTER");
                                                stockDepartament.addComputerForKeyboard();
                                                break;
                                            case 6://smartphone
                                                System.out.println("\n6 - SMARTPHONE");
                                                stockDepartament.addSmartphoneForKeyboard();
                                                break;
                                            default:
                                                System.out.println("OPCION INCORRECTA...");
                                                break;
                                        }
                                    } while (option_1 != 0);
                                    break;
                                case 2://consulta
                                    do {
                                        System.out.println("\n2 - CONSULTAR");
                                        System.out.println(" \n1 - BUSCAR POR ID" +
                                                "\n2 - BUSCAR POR NOMBRE" +
                                                "\n3 - CATEGORIAS" +
                                                "\n4 - LISTAR TODO" +
                                                "\n0 - VOLVER");
                                        option_1 = scanner.nextInt();
                                        Item encontrado;
                                        switch (option_1) {
                                            case 1://buscar por id
                                                System.out.println(" \n1 - BUSCAR POR ID");
                                                System.out.println("\nINGRESE ID DEL PRODUUTO A BUSCAR :");
                                                dato = scanner.nextInt();
                                                encontrado = (Item)stockDepartament.search(dato);
                                                if(encontrado!=null)
                                                    System.out.println(encontrado);
                                                break;
                                            case 2://buscar por nombre
                                                System.out.println("\n2 - BUSCAR POR NOMBRE");
                                                System.out.println("\nINGRESE NOMBRE DEL PRODUUTO A BUSCAR :");
                                                palabra = scanner.next();
                                                encontrado = (Item) stockDepartament.searchForName(palabra);
                                                if(encontrado!=null)
                                                    System.out.println(encontrado);
                                                break;
                                            case 3://categoria
                                                ArrayList<Item> items;
                                                do {
                                                    System.out.println("\n3 - CATEGORIAS");
                                                    System.out.println(" \n1 - PROCESADOR" +
                                                            "\n2 - RAM" +
                                                            "\n3 - ROM" +
                                                            "\n4 - POWER SUPPLY" +
                                                            "\n5 - COMPUTER" +
                                                            "\n6 - SMARTPHONE" +
                                                            "\n0 - VOLVER");
                                                    option_4 = scanner.nextInt();
                                                    switch (option_4)
                                                    {
                                                        case 1:
                                                            items = (ArrayList<Item>) stockDepartament.searchTypeProduct("Processor");
                                                            if(items!=null)
                                                                System.out.println(items);
                                                            break;
                                                        case 2:
                                                            items = (ArrayList<Item>) stockDepartament.searchTypeProduct("Ram");
                                                            if(items!=null)
                                                                System.out.println(items);
                                                            break;
                                                        case 3:
                                                            items = (ArrayList<Item>) stockDepartament.searchTypeProduct("Rom");
                                                            if(items!=null)
                                                                System.out.println(items);
                                                            break;
                                                        case 4:
                                                            items = (ArrayList<Item>) stockDepartament.searchTypeProduct("PowerSupply");
                                                            if(items!=null)
                                                                System.out.println(items);
                                                            break;
                                                        case 5:
                                                            items = (ArrayList<Item>) stockDepartament.searchTypeProduct("Computer");
                                                            if(items!=null)
                                                                System.out.println(items);
                                                            break;
                                                        case 6:
                                                            items = (ArrayList<Item>) stockDepartament.searchTypeProduct("Smartphone");
                                                            if(items!=null)
                                                                System.out.println(items);
                                                            break;
                                                        case 0:
                                                            break;
                                                            default:
                                                                System.out.println("OPCION INCORRECTA...");
                                                                break;
                                                    }
                                                }while (option_4!=0);
                                                break;
                                            case 4://listartodo
                                                System.out.println("\n4 - LISTAR TODO");
                                                stockDepartament.list();
                                                break;
                                            case 0:
                                                break;
                                            default:
                                                System.out.println("OPCION INCORRECTA...");
                                                break;
                                        }
                                    } while (option_1 != 0);
                                    break;
                                case 3://modificar stock
                                    System.out.println("\n3 - MODIFICAR STOCK");
                                    stockDepartament.list();
                                    System.out.println("\nINGRESE ID DEL PRODUCTO A MODIFICAR STOCK : ");
                                    dato = scanner.nextInt();
                                    Item selec = (Item) stockDepartament.search(dato);
                                    if(selec!=null) {
                                        do {
                                            System.out.println("\n1 - AUMENTAR " +
                                                    "\n2 - DISMINUIR" +
                                                    "\n0 - VOLVER");
                                            option_3 = scanner.nextInt();
                                            int cantidad;
                                            switch (option_3) {
                                                case 1:
                                                    System.out.println("\nINGRESE CANTIDAD ");
                                                    cantidad = scanner.nextInt();
                                                    stockDepartament.increaseQuantity(dato, cantidad);
                                                    break;
                                                case 2:
                                                    System.out.println("\nINGRESE CANTIDAD ");
                                                    cantidad = scanner.nextInt();
                                                    stockDepartament.decreaseQuantity(dato, cantidad);
                                                    break;
                                                case 0:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        } while (option_3 != 0);
                                    }else
                                        System.out.println("\nNO HAY STOCK DEL PRODUCTO INGRESADO");
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("OPCION INCORRECTA...");
                                    break;
                            }
                        } while (option != 0);
                        break;
                    case 0:
                        break;
                }
            } else {
                System.out.println("\nUSTED NO SE ENCUENTRA REGISTRADO...");
                System.out.println("\nDESEA INGRESAR CON OTRO DNI S/N ?");
                repetir = scanner.next();
            }

        } while (repetir.equals("s") || repetir.equals("S"));
        System.out.println("\nADIOS...");
    }
}


















        /*do {

            System.out.println("\nLOGIN :\nINGRESE SU DNI : ");
                option = scanner.nextInt();
            Employee example;
            example = administrationDepartment.searchForDni(option);
            if (example != null) {
                System.out.println("BIENVENIDO: " + example.getName() + " " + example.getSurname());
                switch (example.getSector()) {//-----------------------SELECCIONA DEPENDIENDO EL SECTOR DEL EMPLEADO CON EL ID INGRESADO------------1(ADMINISTRACION)-2(VENTA)-3(STOCK)
                    case 1:
                        System.out.println("\nADMINISTRATION DEPARTAMENT");
                        while (option!=0){
                            System.out.println("\n1 - CHECK \n2 - INCREASE SALARY\n3 - DISCHARGE\n4 - MODIFY SECTOR\n5 - INGRESAR EMPLEADO \n0 - VOLVER");
                            option = scanner.nextInt();
                            Employee employee;
                            switch (option) {
                                case 1://check
                                    while (option!=0) {
                                        System.out.println("\nCHECK : \n1 - ALL LIST\n2 - CATEGORY\n3 - SEARCH EMPLOYEE\n0 - VOLVER");
                                        option = scanner.nextInt();
                                        switch (option) {
                                            case 1:
                                                administrationDepartment.list();
                                                break;
                                            case 2:
                                                while (option!=0) {
                                                    System.out.println("\n1 - SECTOR ADMINISTRATION DEPARTAMENT \n2 - SECTOR SALES DEPARTAMENT \n3 - STOCK DEPARTAMENT \n0 - VOLVER");
                                                    option = scanner.nextInt();
                                                    ArrayList<Employee> employeeArrayList;
                                                    switch (option) {
                                                        case 1:
                                                            employeeArrayList = administrationDepartment.searchForDepartament(1);
                                                            if (employeeArrayList != null)
                                                                System.out.println(employeeArrayList);
                                                            else
                                                                System.out.println("\nNO SE ENCONTRARON EMPLEADOS EN EL SECTOR...");
                                                            break;
                                                        case 2:
                                                            employeeArrayList = administrationDepartment.searchForDepartament(2);
                                                            if (employeeArrayList != null)
                                                                System.out.println(employeeArrayList);
                                                            else
                                                                System.out.println("\nNO SE ENCONTRARON EMPLEADOS EN EL SECTOR...");
                                                            break;
                                                        case 3:
                                                            employeeArrayList = administrationDepartment.searchForDepartament(3);
                                                            if (employeeArrayList != null)
                                                                System.out.println(employeeArrayList);
                                                            else
                                                                System.out.println("\nNO SE ENCONTRARON EMPLEADOS EN EL SECTOR...");
                                                            break;
                                                        default:
                                                            System.out.println("\nOPCION INCORRECTA...");
                                                    }
                                                    System.out.println("\n1 - SECTOR ADMINISTRATION DEPARTAMENT \n2 - SECTOR SALES DEPARTAMENT \n3 - STOCK DEPARTAMENT \n0 - VOLVER");
                                                    option = scanner.nextInt();
                                                }
                                                break;
                                            case 3:
                                                while (repetir.equals("s") || repetir.equals("S")) {
                                                    System.out.println("\nSEARCH EMPLOYEE \n1 - SEARCH FOR NAME\n2 - SEARCH FOR ID\n3 - SEARCH FOR DNI 0 - VOLVER");
                                                    //Employee employee;
                                                    option = scanner.nextInt();
                                                    switch (option) {
                                                        case 1:
                                                            System.out.println("\nINGRESE SURNAME : ");
                                                            palabra = scanner.next();
                                                            employee = administrationDepartment.saerchForSurname(palabra);
                                                            System.out.println(employee);
                                                            break;
                                                        case 2:
                                                            System.out.println("\nINGRESE ID : ");
                                                            option = scanner.nextInt();
                                                            employee = (Employee) administrationDepartment.search(option);
                                                            System.out.println(employee);
                                                            break;
                                                        case 3:
                                                            System.out.println("\nINGRESE DNI : ");
                                                            option = scanner.nextInt();
                                                            employee = administrationDepartment.searchForDni(option);
                                                            System.out.println(employee);
                                                            break;
                                                        default:
                                                            System.out.println("\nOPCION INCORRECTA...");
                                                    }
                                                    System.out.println("\nDESEA BUSCAR OTRA VES S/N ?");
                                                    repetir = scanner.next();
                                                }
                                                break;
                                        }
                                        System.out.println("\nCHECK : \n1 - ALL LIST\n2 - CATEGORY\n3 - SEARCH EMPLOYEE\n0 - VOLVER");
                                        option = scanner.nextInt();
                                    }
                                    break;
                                case 2://aplicar aumento
                                    System.out.println("\nINGRESE DNI DEL EMPLEADO A AUMENTAR SALARIO: ");
                                    option = scanner.nextInt();
                                    employee = administrationDepartment.searchForDni(option);
                                    if(employee!=null)
                                    {
                                        System.out.println(employee);
                                        System.out.println("\nDESEA INCREMENTAR SUELDO?\n1 - SI\n2 - NO");
                                        option = scanner.nextInt();
                                        if(option==1) {
                                            System.out.println("INGRESE PORCENTAJE A AUMENTAR..");
                                            float porcentaje = scanner.nextFloat();
                                            employee.setBaseSalary(employee.getBaseSalary()+(employee.getBaseSalary()*porcentaje));
                                        }
                                    }
                                    break;

                                case 3://dar de baja
                                    System.out.println("\nINGRESE DNI DEL EMPLEADO A DAR DE BAJA: ");
                                    option = scanner.nextInt();
                                    Employee employee1 = administrationDepartment.searchForDni(option);
                                    if(employee1!=null) {
                                        System.out.println(employee1);
                                        System.out.println("\nDESEA DAR DE BAJA? \n1 - SI\n2 - NO");
                                        option = scanner.nextInt();
                                        if(option==1)
                                        {
                                            administrationDepartment.delete(employee1.getId());
                                        }
                                    }
                                    salesDepartament.list();
                                    break;
                                case 4://cambiar sector
                                    System.out.println("\nINGRESE DNI DEL EMPLEADO A MODIFICAR SECTOR: ");
                                    option = scanner.nextInt();
                                    employee = administrationDepartment.searchForDni(option);
                                    if (employee != null) {
                                        System.out.println("\nSELECCIONE SECTOR A ASIGNAR: \n1 - SECTOR ADMINISTRATION DEPARTAMENT \n2 - SECTOR SALES DEPARTAMENT \n3 - SECTOR STOCK DEPARTAMENT ");
                                        option = scanner.nextInt();
                                        switch (option) {
                                            case 1:
                                                employee.setSector(1);
                                                break;
                                            case 2:
                                                employee.setSector(2);
                                                break;
                                            case 3:
                                                employee.setSector(3);
                                                break;
                                        }
                                    }
                                    break;
                                case 5:
                                    Employee nuevo = new Employee();
                                    System.out.println("\nINGRESE NOMBRE:");
                                    palabra = scanner.next();
                                    nuevo.setName(palabra);
                                    System.out.println("\nINGRESE APELLIDO:");
                                    palabra = scanner.next();
                                    nuevo.setSurname(palabra);
                                    System.out.println("\nINGRESE DNI:");
                                    option = scanner.nextInt();
                                    nuevo.setDni(option);
                                    System.out.println("\nINGRESE SECTOR:");
                                    option = scanner.nextInt();
                                    nuevo.setSector(option);
                                    System.out.println("\nINGRESE SALARIO:");
                                    float salary = scanner.nextFloat();
                                    nuevo.setBaseSalary(salary);
                                    System.out.println(nuevo);

                                    System.out.println("\nCARGAR? \n1 - SI \n2 - NO");
                                    option = scanner.nextInt();
                                    if(option==1)
                                    {
                                        administrationDepartment.addx(nuevo);
                                    }
                                    break;
                            }
                            System.out.println("\n1 - CHECK \n2 - INCREASE SALARY\n3 - DISCHARGE\n4 - MODIFY SECTOR\n5 - INGRESAR EMPLEADO\n0 - VOLVER");
                            option = scanner.nextInt();
                        }

                        break;
                    case 2:
                        System.out.println("\nSALES DEPARTAMENT");
                        Receipt x = new Receipt();
                        while (option!=0){
                            System.out.println("\n1 - EMIT REICIPT\n2 - CHECK\n3 - MODIFY");
                            option = scanner.nextInt();
                            switch (option) {
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("\nEMIT REICIPT : ");
                                    Customer y = salesDepartament.LoadCustomerForKeyboard();
                                    if (y!=null) {
                                        x.setCustomer(y);
                                        do{
                                            stockDepartament.list();
                                            String name;
                                            System.out.println("INGRESE ID DEL PRODUCTO A AGREGAR :");
                                            option = scanner.nextInt();
                                            Item item = (Item) stockDepartament.search(option);
                                            if (item != null) {
                                                System.out.println("\nhay en stock: " + item.getCant());

                                                    System.out.println("\nINGRESE CANTIDAD : ");
                                                option = scanner.nextInt();
                                                if (option <= item.getCant()) {
                                                    Item aIngresar = new Item(item.getProduct(), option);
                                                    stockDepartament.decreaseQuantity(item.getProduct().getName(), option);
                                                    System.out.println("\nAGREGAR \n1 - SI \n2 - NO?");
                                                    option = scanner.nextInt();
                                                    if (option == 1) {
                                                        x.addItem(item);
                                                    }
                                                } else {
                                                    System.out.println("\nla cantidad supera el stock...");

                                                    do {
                                                            System.out.println("\nDESEA INGRESAR OTRA CANTIDAD? S/N");
                                                            palabra = scanner.next();
                                                            System.out.println("\nINGRESE CANTIDAD : ");
                                                             option = scanner.nextInt();
                                                        }while( palabra.equals("s") || palabra.equals("S"));
                                                }


                                            }
                                            System.out.println("\nDESEA AGREGAR OTRO PRODUCTO? S/N");
                                            palabra = scanner.next();
                                        }while (palabra.equals("s") || palabra.equals("S"));

                                        System.out.println("\nINGRESE METODO DE PAGO : \n1 - EFECTIVO\n2 - CONTADO\n3 - CREDITO");
                                        option = scanner.nextInt();
                                        switch (option)
                                        {
                                            case 1:
                                                x.setMontoTotal(x.calcularTotal()-(x.calcularTotal()*(0.05f)));
                                                break;
                                            case 2:
                                                x.setMontoTotal(x.calcularTotal());
                                                break;
                                            case 3:
                                                System.out.println("\nINGRESE CANTIDAD DE CUOTAS :");
                                                option = scanner.nextInt();
                                                x.setQuotas(option);
                                                float price = ((x.calcularTotal())*1.1f);
                                                System.out.println(price);
                                                x.setMontoTotal(price);
                                                x.addQuota(price/option);
                                                break;
                                        }
                                    }if(x!=null)
                                        salesDepartament.addx(x);
                                        System.out.println(x);
                                    break;
                                case 2:
                                    System.out.println("\nCHECK :\n1 - ALL LIST\n2 - SEARCH");
                                    option = scanner.nextInt();
                                    switch (option) {
                                        case 1:
                                            salesDepartament.list();
                                            break;
                                        case 2:
                                            System.out.println("\nSEARCH : \nSEARCH  FOR NRO OF RECEIPTS\n2 - SEARCH FOR CUSTOMER");
                                            option = scanner.nextInt();
                                            switch (option) {
                                                case 1:
                                                    break;
                                                case 2:
                                                    break;

                                            }
                                            break;


                                    }
                                    break;
                                case 3:
                                    System.out.println("\nMODIFY : ");
                                    break;
                            }
                            System.out.println("\n1 - EMIT REICIPT\n2 - CHECK\n3 - MODIFY");
                            option = scanner.nextInt();
                        }
                        break;
                    case 3:
                        System.out.println("\nSTOCK DEPARTAMENT");
                        System.out.println("\n1 - ADD PRODUCT\n2 - CHECK\n0 - BACK");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                while (option!=0) {
                                    System.out.println("ADD ITEM : \n1 - PROCESSOR \n2 - RAM \n3 - ROM\n 4 - POWERSUPPLY \n5 - COMPUTER\n6 - SMARTPHONE\n0 - BACK");
                                    option = scanner.nextInt();
                                    switch (option) {
                                        case 1:
                                            do {
                                                stockDepartament.addProcesorForKeyboard();
                                                System.out.println("\nDesea cargar otro Procesador? \n1 - si \n2 - no");
                                                option = scanner.nextInt();
                                            } while (option == 1);
                                            stockDepartament.list();
                                            break;
                                        case 2:
                                            do {
                                                stockDepartament.addRamForKeyboard();
                                                System.out.println("\nDesea cargar otra Ram? \n1 - si \n2 - no");
                                                option = scanner.nextInt();
                                            } while (option == 1);
                                            stockDepartament.list();
                                            break;
                                        case 3:
                                            do {
                                                stockDepartament.addRomForKeyboard();
                                                System.out.println("\nDesea cargar otra Rom? \n1 - si \n2 - no");
                                                option = scanner.nextInt();
                                            } while (option == 1);
                                            stockDepartament.list();
                                            break;
                                        case 4:
                                            do {
                                                stockDepartament.addPowerSupplyForKeyboard();
                                                System.out.println("\nDesea cargar otro PowerSupply? \n1 - si \n2 - no");
                                                option = scanner.nextInt();
                                            } while (option == 1);
                                            stockDepartament.list();
                                            break;
                                        case 5:
                                            do {
                                                stockDepartament.addComputerForKeyboard();
                                                System.out.println("\nDesea cargar otro Computer \n1 - si \n2 - no");
                                                option = scanner.nextInt();
                                            } while (option == 1);
                                            stockDepartament.list();
                                            break;
                                        case 6:
                                            do {
                                                stockDepartament.addSmartphoneForKeyboard();
                                                System.out.println("\nDesea cargar otro Smartphone? \n1 - si \n2 - no");
                                                option = scanner.nextInt();
                                            } while (option == 1);
                                            stockDepartament.list();
                                            break;
                                    }
                                    System.out.println("ADD ITEM : \n1 - PROCESSOR \n2 - RAM \n3 - ROM\n 4 - POWERSUPPLY \n5 - COMPUTER\n6 - SMARTPHONE\n0 - BACK");
                                    option = scanner.nextInt();
                                }
                            case 2:
                                while (option!=0){
                                    System.out.println("\nCHECK : \n1 - CATEGORIAS\n2 - SEARCH FOR ID\n3 - SEARCH FOR NAME\n4 - ALL LIST\n 0 - BACK");
                                    option = scanner.nextInt();
                                    switch (option) {
                                        case 1:
                                            while (option!=0){
                                                System.out.println("\nCATEGORIA:\n1 - PROCESSOR\n2 - RAM\n3 - ROM\n4 - POWERSUPPLY\n5 - COMPUTER\n6 - SMARTPHONE\n 0 - BACK");
                                                option = scanner.nextInt();
                                                ArrayList<Item> stock;
                                                switch (option) {
                                                    case 1:
                                                        stock = (ArrayList<Item>) stockDepartament.searchTypeProduct("Processor");
                                                        if (stock != null)
                                                            System.out.println(stock);
                                                        else
                                                            System.out.println("no hay stock del producto");
                                                        break;
                                                    case 2:
                                                        stock = (ArrayList<Item>) stockDepartament.searchTypeProduct("Ram");
                                                        if (stock != null)
                                                            System.out.println(stock);
                                                        else
                                                            System.out.println("no hay stock del producto");
                                                        break;
                                                    case 3:
                                                        stock = (ArrayList<Item>) stockDepartament.searchTypeProduct("Rom");
                                                        if (stock != null)
                                                            System.out.println(stock);
                                                        else
                                                            System.out.println("no hay stock del producto");
                                                        break;
                                                    case 4:
                                                        stock = (ArrayList<Item>) stockDepartament.searchTypeProduct("PowerSupply");
                                                        if (stock != null)
                                                            System.out.println(stock);
                                                        else
                                                            System.out.println("no hay stock del producto");
                                                        break;
                                                    case 5:
                                                        stock = (ArrayList<Item>) stockDepartament.searchTypeProduct("Computer");
                                                        if (stock != null)
                                                            System.out.println(stock);
                                                        else
                                                            System.out.println("no hay stock del producto");
                                                        break;
                                                    case 6:
                                                        stock = (ArrayList<Item>) stockDepartament.searchTypeProduct("Smartphone");
                                                        if (stock != null)
                                                            System.out.println(stock);
                                                        else
                                                            System.out.println("no hay stock del producto");
                                                        break;
                                                    default:
                                                        System.out.println("error... \nIngrese una opcion correcta...");
                                                }
                                                System.out.println("\nCATEGORIA:\n1 - PROCESSOR\n2 - RAM\n3 - ROM\n4 - POWERSUPPLY\n5 - COMPUTER\n6 - SMARTPHONE\n 0 - BACK");
                                                option = scanner.nextInt();
                                            }
                                            break;
                                        case 2:
                                            //SEARCH FOR ID
                                            while (repetir.equals("s")||repetir.equals("S")) {
                                                System.out.println("Ingrese ID del producto a buscar : ");
                                                option = scanner.nextInt();
                                                Item product = (Item) stockDepartament.search(option);
                                                if (product != null)
                                                    System.out.println(product);
                                                System.out.println("\nDESEA BUSCAR OTRA VES S/N ?");
                                                repetir = scanner.next();

                                            }
                                            break;
                                        case 3:
                                            //SEARCH FOR NAME
                                            while (repetir.equals("s")||repetir.equals("S")) {
                                                System.out.println("Ingrese NAME del producto a buscar : ");
                                                String name;
                                                name = scanner.next();
                                                Item product1 = (Item) stockDepartament.searchForName(name);
                                                if (product1 != null)
                                                    System.out.println(product1);
                                                System.out.println("\nDESEA BUSCAR OTRA VES S/N ?");
                                                repetir = scanner.next();
                                            }
                                            break;
                                        case 4:
                                            stockDepartament.list();
                                            break;
                                        default:
                                            System.out.println("error... \nIngrese una opcion correcta...");
                                    }
                                    System.out.println("\nCHECK : \n1 - CATEGORIAS\n2 - SEARCH FOR ID\n3 - SEARCH FOR NAME\n4 - ALL LIST\n 0 - BACK");
                                    option = scanner.nextInt();
                                }
                            default:
                        }
                        break;
                    default:
                }
            }
            else
            {
                System.out.println("\nUSTED NO SE ENCUENTRA REGISTRADO...");
                System.out.println("\nDESEA INGRESAR CON OTRO DNI S/N ?");
                repetir = scanner.next();
            }

        }while (repetir.equals("s")||repetir.equals("S"));
        System.out.println("\nADIOS...");*/

        /*
        Receipt f1 = null;
        int opt=0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("INGRESE ID DEL PRODUCTO:");
            int idABuscar = scanner.nextInt();
            Item x = (Item) salesDepartament.search(idABuscar);
            if (x != null && x.getCant() > 0) {
                f1 = new Receipt(c1);
                System.out.println(x.getProduct());
                System.out.println("\nAgregar?\n1 - si\n2- no");
                int op = scanner.nextInt();
                if (op == 1) {
                    System.out.println("Ingrese cantidad? ");
                    op = scanner.nextInt();
                    f1.addx(new Item(x.getProduct(),op));
                } else {
                    System.out.println("\nNo hay Stock del producto");
                }
            }
            System.out.println("\nDesea Agregar otro Producto? \n1- si \n2- no");
            opt=scanner.nextInt();
        }while (opt==1);
        if(f1!=null)
        System.out.println(f1);
    }*//*String admindept = "administrationDepartment";
        String saleddept = "salesDepartament";
        String stockdept = "stockDepartament";*/

        /*ArrayList<Object> departaments = new ArrayList<>();
        departaments.add(salesDepartament);
        departaments.add(stockDepartament);
        departaments.add(administrationDepartment);
        PermissionCollection <Object> objectPermissionCollection = new PermissionCollection() {
            @Override
            public void add(Permission permission) {

            }

            @Override
            public boolean implies(Permission permission) {
                return false;
            }

            @Override
            public Enumeration<Permission> elements() {
                return null;
            }
        }*/
