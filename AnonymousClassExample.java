public class AnonymousClassExample {
    public static void main(String[] args) {
        MyFunction f = new MyFunction() {
            @Override
            public void execute() {
                System.out.println("hello world");
            }
        };
        f.execute();
    }
}
