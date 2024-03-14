public class MP3 extends Item {
    private int duration;

    public MP3(String ID, String name, String description, int price, int duration) {
        super(ID, name, description, price);

        this.duration = duration;
    }

    @Override
    public void showInfo() {
        System.out.println("MP3 Item");
    }
}
