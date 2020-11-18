package pattern.TemplatePattern;

public abstract class Cook {
    public   void cook(){
        if (isOil()){
            addOil();
        }
        addEgg();
        addTomato();
    };

    public boolean isOil(){
        return true;
    }

    public abstract void addOil();

    public abstract void addEgg();

    public abstract  void addTomato();

}
