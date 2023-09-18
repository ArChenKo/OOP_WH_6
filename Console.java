package srp2;

import java.util.Scanner;

public class Console {
    public void inputConsole(){
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Название товара: "));
        order.setQnt(Integer.parseInt(prompt("Кол-во: ")));
        order.setPrice(Integer.parseInt(prompt("Цена: ")));
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