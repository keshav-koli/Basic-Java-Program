package Collection;

public class laptopCollection {
    int price;
    String brand;
    int quantity;

    laptopCollection(String name,int price ,int quantity){
        this.price = price;
        this.brand = name;
        this.quantity = quantity;
    }
    public String  toString(){
        return "brand "+brand +" price "+price+" quantity "+quantity;
    }
}
