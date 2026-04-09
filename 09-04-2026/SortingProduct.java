import java.util.*;

class Product {
    String name;
    int price;
    double rating;

    public Product(String name, int price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " : " + rating + " , Rs. " + price;
    }
}

public class SortingProduct {
    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();
        cart.add(new Product("pears", 20, 5));
        cart.add(new Product("corseca", 11, 1));
        cart.add(new Product("mogo mogu", 50, 5));
        Comparator<Product> byRating = new Comparator<Product>() {
            public int compare(Product a, Product b) { // compare() can only return int
                return (int) (a.rating - b.rating);
            }
        };

        Collections.sort(cart, byRating);
        System.out.println("Sorted by Rating: " + cart);

        Collections.sort(cart, (a, b) -> b.price - a.price);
        System.out.println("Sorted by Price: " + cart);

        Collections.sort(cart, (a, b) -> a.name.compareTo(b.name));
        System.out.println("Sorted by Name: " + cart);

        cart.sort(Comparator.comparing(a -> a.name));
        System.out.println("Sorted by Name: " + cart);
    }
}
