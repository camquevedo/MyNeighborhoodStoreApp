import java.util.Scanner;

public class Main {

    static Scanner scanner;
    static class Product {
        String name;
        String description;
        String category;
        String tags;
        double price;
        String imageUrl;
    }

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        Product[] products = new Product[20];

        int curProduct = 0;
        products[curProduct] = new Product();
        products[curProduct].name = "Colgate";
        products[curProduct].price = 15.000f;
        System.out.println("product name: " + products[curProduct].name);

        curProduct++;
        products[curProduct] = new Product();
        products[curProduct].name = "Leche Entera Alpina" + curProduct;
        products[curProduct].description = "Bolsa x 1.100 ml";
        products[curProduct].category = "Lacteo/Huevos y refrigerados";
        products[curProduct].tags = "Leches";
        products[curProduct].price = 3100;
        products[curProduct].imageUrl = "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg";

        curProduct++;
        products[curProduct] = new Product();
        products[curProduct].name = "Leche Entera Alpina" + curProduct;
        products[curProduct].description = "Bolsa x 1.100 ml";
        products[curProduct].category = "Lacteo/Huevos y refrigerados";
        products[curProduct].tags = "Leches";
        products[curProduct].price = 3100;
        products[curProduct].imageUrl = "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg";

        curProduct++;
        products[curProduct] = new Product();
        products[curProduct].name = "Leche Entera Alpina" + curProduct;
        products[curProduct].description = "Bolsa x 1.100 ml";
        products[curProduct].category = "Lacteo/Huevos y refrigerados";
        products[curProduct].tags = "Leches";
        products[curProduct].price = 3100;
        products[curProduct].imageUrl = "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg";

        curProduct++;
        products[curProduct] = new Product();
        products[curProduct].name = "Leche Entera Alpina" + curProduct;
        products[curProduct].description = "Bolsa x 1.100 ml";
        products[curProduct].category = "Lacteo/Huevos y refrigerados";
        products[curProduct].tags = "Leches";
        products[curProduct].price = 3100;
        products[curProduct].imageUrl = "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg";

        curProduct++;
        products[curProduct] = new Product();
        products[curProduct].name = "Leche Entera Alpina" + curProduct;
        products[curProduct].description = "Bolsa x 1.100 ml";
        products[curProduct].category = "Lacteo/Huevos y refrigerados";
        products[curProduct].tags = "Leches";
        products[curProduct].price = 3100;
        products[curProduct].imageUrl = "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg";

        curProduct++;
        products[curProduct] = new Product();
        products[curProduct].name = "Leche Entera Alpina" + curProduct;
        products[curProduct].description = "Bolsa x 1.100 ml";
        products[curProduct].category = "Lacteo/Huevos y refrigerados";
        products[curProduct].tags = "Leches";
        products[curProduct].price = 3100;
        products[curProduct].imageUrl = "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg";

        curProduct++;
        products[curProduct] = new Product();
        products[curProduct].name = "Leche Entera Alpina" + curProduct;
        products[curProduct].description = "Bolsa x 1.100 ml";
        products[curProduct].category = "Lacteo/Huevos y refrigerados";
        products[curProduct].tags = "Leches";
        products[curProduct].price = 3100;
        products[curProduct].imageUrl = "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg";

        curProduct++;
        products[curProduct] = new Product();
        products[curProduct].name = "Leche Entera Alpina" + curProduct;
        products[curProduct].description = "Bolsa x 1.100 ml";
        products[curProduct].category = "Lacteo/Huevos y refrigerados";
        products[curProduct].tags = "Leches";
        products[curProduct].price = 3100;
        products[curProduct].imageUrl = "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg";

        curProduct++;
        products[curProduct] = new Product();
        products[curProduct].name = "Leche Entera Alpina" + curProduct;
        products[curProduct].description = "Bolsa x 1.100 ml";
        products[curProduct].category = "Lacteo/Huevos y refrigerados";
        products[curProduct].tags = "Leches";
        products[curProduct].price = 3100;
        products[curProduct].imageUrl = "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg";
        
        runMenu();

        scanner.close();
    }

    public static void runMenu() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            handleUserChoice(choice);
        } while (choice != 8);
    }

    private static void displayMenu() {

        System.out.println(
                """
                        |o|                         /////////////\\\\\\
                        |o|                        (((((((((((((   \\\\\\
                        |o|                        ))) ~~      ~~   (((
                        |o|                        ((( (*)     (*)  )))
                        |o|                        )))     <        (((\s
                        |o|                        ((( '\\______/`   )))\s
                        |o|                        )))\\___________/(((\s
                        |o|                        (((   _)  (_    )))\s\s
                        |o|                              /\\__/\\""");
        System.out.println("±----------------------------------------±");
        System.out.println("|   Administrador Mi Tienda de Barrio    |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Agregar producto                      |");
        System.out.println("2. Eliminar producto                     |");
        System.out.println("3. Actualizar producto                   |");
        System.out.println("4. Ver todos los productos               |");
        System.out.println("5. Ver producto                          |");
        System.out.println("6. Buscar producto en inventario         |");
        System.out.println("7. Ver producto destacado                |");
        System.out.println("8. Salir                                 |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 8)  ");
    }

    private static void handleUserChoice(int choice) {
        switch (choice) {
            case 1 -> addProduct();
            case 2 -> removeProduct();
            case 3 -> updateProduct();
            case 4 -> listAllProducts();
            case 5 -> listProduct();
            case 6 -> searchProduct();
            case 7 -> showHighlightProduct();
            case 8 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción invalida. Por favor intenta de nuevo.");
        }

    }

    private static void addProduct() {
        System.out.println("addProduct en ejecución ...Soon");
    }

    private static void removeProduct() {
        System.out.println("removeProduct en ejecución ...Soon");
    }

    private static void updateProduct() {
        System.out.println("updateProduct en ejecución ...Soon");
    }

    private static void listProduct() {
        System.out.println("listProduct en ejecución ...Soon");
    }

    private static void listAllProducts() {
        System.out.println("listAllProducts en ejecución ...Soon");
    }

    private static void searchProduct() {
        System.out.println("searchProduct en ejecución ...Soon");
    }

    private static void showHighlightProduct() {
        System.out.println("showHighlightProduct en ejecución ...Soon");
    }
}
