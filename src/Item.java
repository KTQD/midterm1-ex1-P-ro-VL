public abstract class Item {

    protected String ID;
    public String name;
    private String description;
    int price;

    public Item(String ID, String name, String description, int price) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void showInfo();
}
