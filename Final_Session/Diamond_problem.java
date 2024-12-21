interface interfacea {
    default void show() {
        System.out.println("Show from InterfaceA");
    }
}

interface interfaceb {
    default void show() {
        System.out.println("Show from InterfaceB");
    }
}

class diamondclass implements interfacea, interfaceb {
    @Override
    public void show() {
        interfacea.super.show();
        interfaceb.super.show();
        System.out.println("Custom method of Diamondclass");
    }
}

public class Diamond_problem {
    public static void main(String[] args) {
        diamondclass diamond = new diamondclass();
        diamond.show();
    }
}
