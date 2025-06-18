public class LambdaExample {
    public static void main(String[] args) {
        MyFunction f = () -> System.out.println("hello world");
        f.execute();
    }
}
