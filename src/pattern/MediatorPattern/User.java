package pattern.MediatorPattern;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
    public void sendMessage(String message){
        ChartRoom.showMessage(this,message);
    }
}
