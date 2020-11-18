package pattern.TemplatePattern;

public class Demo {
    public static void main(String[] args) {
        MeCook me = new MeCook();
        ChefCook chef = new ChefCook();
        me.cook();
        chef.cook();
    }
}
