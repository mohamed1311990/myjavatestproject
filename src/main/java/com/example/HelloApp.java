public class HelloApp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, World!");
        Thread.sleep(Long.MAX_VALUE); // Keep it alive forever
    }
}
