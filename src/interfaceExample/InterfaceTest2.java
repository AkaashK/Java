package interfaceExample;

public class InterfaceTest2 {

    // To restrict access to create NoArgsConstructor
    private InterfaceTest2() {}

    // Checking static class needs a object to call printStaticValue method
    static class NestedClass {
        public void printStaticValue() {
            System.out.println("Static class");
        }
    }

    // Passing Bicycle interface as reference
    public InterfaceTest2(Bicycle bicycle) {
        IntefaceTest1 intefaceTest1 = (IntefaceTest1)bicycle;
        intefaceTest1.sample(1);
        bicycle.applyBrake(12);
        testTryCatchBlockWithReturn();
        testTryCatchBlockWithSystemExit();
    }

    // checks wh
    public void testTryCatchBlockWithSystemExit() {
        try {
//            return 1;
            System.exit(1);
        } catch(Exception error) {
            System.out.println(error);
        } finally {
            System.out.println("Finally Block executed");
        }
    }

    public void testTryCatchBlockWithReturn() {
        try {
//            return 1;
            System.exit(1);
        } catch(Exception error) {
            System.out.println(error);
        } finally {
            System.out.println("Finally Block executed");
        }
    }
}
