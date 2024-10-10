package ObjectClass.ToString;

public class laptop {
    String brand;
    int ram;
 
    public laptop(String var1, int var2) {
       this.brand = var1;
       this.ram = var2;
    }
 
    public String ToString() {
       System.out.println("Ram is :" + this.ram);
       System.out.println("Brand is :" + this.brand);
       return "";
    }
    public static void main(String[] args) {
         laptop obj = new laptop("Dell", 8);
         obj.ToString();
         
    }
 }
 
