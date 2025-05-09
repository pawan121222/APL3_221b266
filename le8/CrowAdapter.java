public class CrowAdapter implements Swan {
    Crow crow;

    public CrowAdapter(Crow crow) {
        this.crow = crow;
    }

    public void eat() {
        System.out.println("Crow is eating");
    }

    public void cry() {
        crow.cry();
    }

    public void fly() {
        crow.fly();
    }

    public void swim() {
        System.out.println("Crows don't swim well");
    }

    public void sing() {
        System.out.println("Crows don't sing melodiously");
    }
}
