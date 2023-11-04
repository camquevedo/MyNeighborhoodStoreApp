public class Main {
        static class Product {
            String name;
            String description;
            String category;
            String tags;
            double price;
            String imageUrl;
        }

        public static void main(String[] args) {
            Product[] products = new Product[10];
            products[1] = new Product();
            products[1].name = "Colgate";
            products[1].price = 15.000f;

            products[2].name = "Leche Entera Alpina";
            products[2].description = "Bolsa x 1.100 ml";
            products[2].category = "Lacteo/Huevos y refrigerados";
            products[2].tags = "Leches";
            products[2].price = 3100;
            products[2].imageUrl = "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg";
            System.out.println("product name: " + products[1].name);
        }
}