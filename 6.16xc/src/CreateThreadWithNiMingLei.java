public class CreateThreadWithNiMingLei {
    public static void main(String[] args) {
        Thread t= new Thread(() -> {
            while(true) {
                System.out.println("我是子线程");
            }
        });
        t.start();;

        while(true) {
            System.out.println("我是main线程");
        }
    }
}
