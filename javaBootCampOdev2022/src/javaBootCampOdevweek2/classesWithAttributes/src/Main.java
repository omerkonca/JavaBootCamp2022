import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","ASUS Laptop",10.0,5);//contructor çalışır newlediğimizde
        Product product1 = new Product();

//parametreli costructor kullanmassak bu şekilde veririz.
        product1.setName("Name");
        product1.setId(1);
        product1.setDescription("Abcd");
        product1.setPrice(500);
        product1.setStockAmount(3);

        ProductManager productManager= new ProductManager();
        productManager.Add(product);

        System.out.println(product.getName());

    }
}