package Interface;

interface basic{
    void turnOn(); //! by default all non static methods are public and abstract
    public abstract void turnOff();
    public static void print(){//! inside interface we can have Concreate static methods means methods with body
        System.out.println("This is a static method");
    }
    int a = 10; //! by default all variables are public static final ,re-initializing is not allowed
    // protected void print1();and protected abstract void print1() //!protected and protected abstract method is not allowed in interface
    // private void print2();and private abstract void print2() //! private and private abstract method is not allowed in interface

    default void print3(){  //! default method is allowed in interface means method with body declare in parent become constant in child
        System.out.println("This is a default method");
    }
    // final void print4(){ //!final method is allowed in interface
        // System.out.println("This is a final method");
    // }

    /*
    default/protected/private static void print7(){//! non-public static method is not allowed in interface
        System.out.println("This is a default method");
    }
    */
    /*
    static { //! static block is not allowed in interface
        System.out.println();
    }
    */
    /*
    { //! instance block is not allowed in interface
        System.out.println();
    }
    */
    /* 
    basic() { //! constructor is not allowed in interface
        System.out.println();
    }
    */
    /*
     abstract static void print5(); //! abstract static modifier combination is illegal
     */
    /*     
    public abstract final void print6(); //! abstract final modifier combination is illegal
     */
    @SuppressWarnings("unused")
    private static void print8(){//! private static method is allowed in interface
        System.out.println("This is a private static method");
    }
}