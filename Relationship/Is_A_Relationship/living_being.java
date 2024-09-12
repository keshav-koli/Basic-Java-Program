package Relationship.Is_A_Relationship;

public class living_being {
    String size;
    String color;
    String name;
    String type;

    public living_being(String size, String color, String name, String type) {
        this.size = size;
        this.color = color;
        this.name = name;
        this.type = type;
    }
    
    public void display() {
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
    public static void main(String [] args){
        living_being obj = new living_being("Large", "Brown", "Elephant", "Mammal");
        obj.display();
    }
}
