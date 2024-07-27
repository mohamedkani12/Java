package JS22S6;

import java.util.*;

public class ProductStack<T> {
    private Stack<T> stack;

    public ProductStack() {
        stack = new Stack<>();
    }

    public void addProduct(T productName) {
        stack.push(productName);
        System.out.println("Added product: " + productName);
    }

    public void removeProduct() {
        if (!stack.isEmpty()) {
            T removedProduct = stack.pop();
            System.out.println("Removed product: " + removedProduct);
        } else {
            System.out.println("Stack is empty. Cannot remove.");
        }
    }

    public boolean searchProduct(T productName) {
        return stack.contains(productName);
    }

    public void displayProducts() {
        System.out.println("Products in the stack:");
        for (T productName : stack) {
            System.out.println(productName);
        }
    }

    public static void main(String[] args) {
        ProductStack<String> productStack = new ProductStack<>();

        // Add products
        productStack.addProduct("Product A");
        productStack.addProduct("Product B");
        productStack.addProduct("Product C");

        // Display products
        productStack.displayProducts();

        // Search for a product
        String searchProduct = "Product B";
        boolean found = productStack.searchProduct(searchProduct);
        if (found) {
            System.out.println(searchProduct + " found in the stack.");
        } else {
            System.out.println(searchProduct + " not found in the stack.");
        }

        // Remove a product
        productStack.removeProduct();
        productStack.displayProducts();
    }
}

