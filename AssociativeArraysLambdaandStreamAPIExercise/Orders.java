package AssociativeArraysLambdaandStreamAPIExercise;

import java.util.*;

public class Orders {
    static class Product{
        String name;
        double price;
        int quantity;
        Product(String name,double price,int quantity){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(int quantity) {
            this.quantity += quantity;
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String,Double> totalProductsWithPrices = new LinkedHashMap<>();
        List<Product> products = new ArrayList<>();
        while(!input.equals("buy")){
            String[] productData = input.split(" ");
            String name = productData[0];
            double price = Double.parseDouble(productData[1]);
            int quantity = Integer.parseInt(productData[2]);
            if(isExisting(products, name)){
                products.get(getIndex(products, name)).setPrice(price);
                products.get(getIndex(products, name)).setQuantity(quantity);
            } else {
                products.add(new Product(name,price,quantity));
            }
            totalProductsWithPrices.put(name,products.get(getIndex(products,name)).getPrice() * products.get(getIndex(products,name)).getQuantity());
            input = scan.nextLine();
        }
        for (Map.Entry<String, Double> entry : totalProductsWithPrices.entrySet()) {
            System.out.printf("%s -> %.2f\n",entry.getKey(),entry.getValue());
        }
    }

    private static int getIndex(List<Product> products, String name) {
        for (int i = 0; i < products.size();i++){
            if(products.get(i).getName().equals(name)){
                return i;
            }
        }
        return 0;
    }

    private static boolean isExisting(List<Product> products, String name) {
        for (Product product : products) {
            if(product.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
