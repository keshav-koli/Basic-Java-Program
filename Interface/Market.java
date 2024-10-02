package Interface;

public interface Market {
    double manipulate();

    void sale();

}

class User {
    public void purchase() {
        System.out.println("Item Purchased Successfully");
    }

    // double demand=1;
    double price = 1000;

}

class Seller extends User implements Market {

    double no_of_user;
    double no_of_items;

    public Seller(double no_of_user, double no_of_items) {
        this.no_of_user = no_of_user;
        this.no_of_items = no_of_items;
    }

    public double manipulate() {
        double demand = no_of_user / no_of_items;
        if (demand > 1) {
            super.price = demand * super.price;
        } else if (demand < 1) {
            super.price = demand * super.price;
        }
        return super.price;
    }

    public void sale() {
        double demand = no_of_user / no_of_items;
        if (demand < 1) {
            int sale = (int) (super.price * demand);
            System.out.println("Sale available of " + sale +"% off");
            System.out.println("Price of item is " + (int)(super.price));
        } else if(demand>=1){
            System.out.println("Price of item is " + (int)(super.price));
            System.out.println(demand + " item sold");
            System.out.println("No Sale available");
        }
    }

}