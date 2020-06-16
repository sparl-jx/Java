public class PrintThreadFields {
    static class SubThread extends Thread{
        @Override
        public void run() {
            printFields();
        }
    }

    public static void main(String[] args) {
        Thread thread=new SubThread();
        thread.start();

        printFields();
    }

    private static void printFields() {
        Thread t=Thread.currentThread();
        long id=t.getId();
        System.out.println("线程名字："+id+":"+t.getName());
        System.out.println("线程的优先级:"+id+":"+t.getPriority());
        System.out.println("线程的状态："+id+":"+t.getState());
        System.out.println("线程是否存活："+id+":"+t.isAlive());
        System.out.println("线程是否是后台线程："+id+":"+t.isDaemon());
    }

}
