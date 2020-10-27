package TemplatePattern;

public class ChefCook extends Cook {
    @Override
    public void cook() {
        super.cook();
    }

    @Override
    public void addOil() {
        System.out.println("大厨" + "适量油");
    }

    @Override
    public void addEgg() {
        System.out.println("大厨" + "适量鸡蛋");
    }

    @Override
    public void addTomato() {
        System.out.println("大厨" + "适量番茄");
    }
}
