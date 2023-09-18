package srp2;

import java.util.Scanner;

public class Console {
    public void inputConsole(){
        order.setClientName(prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice(Integer.parseInt(prompt("Price: ")));
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    Order order;
    public Console(Order order) {
        this.order = order;
    }
}