public class Product{
    int id;
    String name;
    double price;
    int quantity;
    double total;

    Product(int id, String n, double p, int q){
        this.id = id;
        name = n;
        price = p;
        quantity = q;
        
    }

    double getTotalPrice(){
        return price * quantity;
    }

    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Total: "+getTotalPrice());
        System.out.println();
    }

    public static void main(String[] args){
        
        Product p1 = new Product(101, "Soap", 30.0, 5);
        Product p2 = new Product(102, "Shampoo", 50.0, 5);
        Product p3 = new Product(103, "Toothpaste", 20.0, 5);

        System.out.println("Product Details");
        System.out.println();

        double grandTotal = 0;
        Product[] cart = {p1, p2, p3};
        for(Product p: cart){ 
            p.display();
            grandTotal += p.getTotalPrice();
        }
        System.out.println("Grand Total: "+grandTotal);
    }
}