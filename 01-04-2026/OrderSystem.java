//import java.util.Random;

class Product {
    String prodName;
    int stock, price;
    Product( String name, int stock, int price){
        prodName = name;
        this.stock = stock;
        this.price = price;
    }
}
class User {
    String name;
    String address;
    User( String name, String address) {
        this.name = name;
        this.address = address;
    }
}
class Order {
    Product prod;
    User user;
    int quantity;
    public Order(Product p, User u, int quantity) {
        this.prod = p;
        this.user = u;
        this.quantity = quantity;
    }
}
class OrderService {
    void placeOrder(Order o) throws OutOfStockException, PaymentFailedException, OrderProcessingException {
            o.prod.stock -= o.quantity;
            if (o.prod.stock <= 0) {
                throw new OutOfStockException("Product Out Of Stock");
            }
            if (Math.random() < 0.4) {
                throw new PaymentFailedException("Payment Failed");
            }
            if (Math.random() < 0.2) {
                throw new OrderProcessingException("Order Processing Failed");
            }
            System.out.println("Order Placed Successfully.");
        
    }
}

class OutOfStockException extends Exception {
    OutOfStockException(String message) {
        super(message);
    }
}
class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}
class OrderProcessingException extends Exception {
    public OrderProcessingException(String message) {
        super(message);
    }
}

public class OrderSystem {
    public static void main(String[] args) {
        Product p = new Product("Soap",15, 20);
        User u = new User("Babu", "OMR, Chennai");
        Order o = new Order(p, u, 10);
        OrderService s = new OrderService();
        try {
            s.placeOrder(o);
        } catch (OutOfStockException e) {
            System.out.println(e);
        } catch (PaymentFailedException e){
            System.out.println(e);
        } catch (OrderProcessingException e) {
            System.out.println(e);
        }
    }
}