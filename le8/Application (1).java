public class Application {
    public static void main(String[] args) {
        Crow crow = new IndianCrow();
        Swan adaptedCrow = new CrowAdapter(crow);

        client(adaptedCrow);
    }

    public static void client(Swan swan) {
        swan.eat();
        swan.swim();
        swan.sing();
    }
}
