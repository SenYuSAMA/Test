package TemplatePattern;

public class MeCook extends Cook{
    private static boolean IS_OIL = false;
    @Override
    public void cook() {
        super.cook();
    }

    @Override
    public boolean isOil() {
        return IS_OIL;
    }

    @Override
    public void addOil() {

    }

    @Override
    public void addEgg() {
        System.out.println("我：" + "很多鸡蛋哦");
    }

    @Override
    public void addTomato() {
        System.out.println("我：" + "很多番茄哦");
    }
}
