import java.util.Scanner;
class Invoice {

    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String number, String description, int quantity, double price) {
        setNumber(number);
        setDescription(description);
        setQuantity(quantity);
        setPrice(price);
    }
    // Set method
    void setNumber(String n){
        number = n;
    }
    void setDescription(String d){
        description = d;
    }
    void setQuantity(int q){
        quantity = q;
        if(q < 0)
            quantity = 0;
    }
    void setPrice(double p){
        price = p;
        if(p < 0)
            price = 0.0;
    }

    // Get method
    String getNumber(){
        return number;
    }
    String getDescription(){
        return description;
    }
    int getQuantity(){
        return quantity;
    }
    double getPrice(){
        return price;
    }

    // getInvoiceAmount method
    double getInvoiceAmount(){
        return quantity*price;
    }
}

public class Task3_12 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        Invoice object = new Invoice("1", "Gold Ingot", 1,1000);

        System.out.print("\nEnter part number" );

        object.setNumber(in.nextLine());

        System.out.print("Enter part description :");

        object.setDescription(in.nextLine());

        System.out.print("Enter item purchased :");

        object. setQuantity(in.nextInt());

        System.out.print("Enter price per item :");

        object.setPrice(in.nextDouble());

        System.out.print("\n\nDetail of items purchasing–>");

        System.out.print("\nPart number :" + object.getNumber());

        System.out.print("\nPart description :" + object.getDescription());

        System.out.print("\nTotal Billing Amount :" + object.getInvoiceAmount());

    }
}
