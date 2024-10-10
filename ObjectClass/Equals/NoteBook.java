package ObjectClass.Equals;

public class NoteBook {
    String company;
    int price;

    public NoteBook(String company, int price) {
        this.company = company;
        this.price = price;
    }

    public String toString() {
        return company + ":" + price;
    }
    public boolean equals(Object o){
        NoteBook n3=(NoteBook)o;
        return this.company==n3.company && this.price==n3.price;
    }
    public static void main(String[] args) {
        NoteBook n1 = new NoteBook("Telco", 100);
        NoteBook n2 = new NoteBook("classMate", 100);
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n1.equals(n2));
    }

}