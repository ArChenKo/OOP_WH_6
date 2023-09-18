package srp2;

public class Program {

    public static void main(String[] args) {

        System.out.println("Введите заказ:");
        Order order = new Order();
        Console console = new Console(order);
            console.inputConsole();
        ToJson jsonFormat = new ToJson(order);
            jsonFormat.saveToJson();

    }

}
