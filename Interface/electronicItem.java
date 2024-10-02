package Interface;

    
interface electronicItem {
    void turnOn();
    void turnOff();
}

class device{
    public void work(){
        System.out.println("Device is working");
    }
}

class TV extends device implements electronicItem{
    public void turnOn(){
        System.out.println("TV is turned on");
    }
    public void turnOff(){
        System.out.println("TV is turned off");
    }
}