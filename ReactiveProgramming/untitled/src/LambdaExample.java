public class LambdaExample {
	public static void main(String[] args) {

//		MyRunnable runnable = new MyRunnable();
//		Thread t = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("In anonymous class");
//			}
//		});
//		t.start();

      // Lambda method
//		Thread t = new Thread(()-> System.out.println("In lambda thread method"));
//		t.start();

//		FunctionalInterface functionalInterface = ()-> System.out.println("Hello from functional interface");
//		functionalInterface.myMethod();
//
//        Integer x = 100;

        onTheFly(()-> System.out.println("Hello from onTheFlyMethof"));
	}

    public static void onTheFly(FunctionalInterface fun)
    {
        fun.myMethod();
    }
}
