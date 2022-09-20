public class LambdaUnderTheHood {
    public static void main(String[] args) {

        FunctionalInterface functionalInterface1 =
                new FunctionalInterface(){

                    @Override
                    public void myMethod()
                    {
                        System.out.println("Implementation 1");
                    }
                };
        FunctionalInterface functionalInterface2 =
                new FunctionalInterface(){

                    @Override
                    public void myMethod()
                    {
                        System.out.println("Implementation 2");
                    }
                };

    }
}
