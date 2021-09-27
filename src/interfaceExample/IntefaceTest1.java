package interfaceExample;

public class IntefaceTest1 implements Bicycle{

    static int gearPosition;
    public InterfaceTest2 interfaceTest2;

    public IntefaceTest1() {
        interfaceTest2 = new InterfaceTest2(this);
        InterfaceTest2.NestedClass nestedClass = new InterfaceTest2.NestedClass();
        nestedClass.printStaticValue();
    }

    // To check whether can access this from the bicycle reference in InterfaceTest2
    public void sample(int value) {
        System.out.println("Static value " + gearPosition);
        System.out.println("Value " + value);
    }

    // Overridden method from the Bicycle interface
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Apply brake " + decrement);
    }
}
