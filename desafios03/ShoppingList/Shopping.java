package tasks.desafios03.ShoppingList;

public class Shopping implements Comparable<Shopping>{
    private String name;
    private double price;
    private String type;

    public Shopping(String name, double price,String type){
        this.name = name;
        this.price = price;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return String.format("Produto: %s - R$%.2f",getName(),getPrice());
    }

    @Override
    public int compareTo(Shopping o) {
        return Double.compare(this.price, o.price);
    }
}
