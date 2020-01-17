package Strategy;

public class Item {

    private String UPCCode;
    private int price;

    public Item(String upc, int cost){
        this.UPCCode=upc;
        this.price=cost;
    }

    public String getUPCCode() {
        return UPCCode;
    }

    public int getPrice() {
        return price;
    }

}
