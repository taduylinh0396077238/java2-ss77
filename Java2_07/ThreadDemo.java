package Java2_07;

public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        ThreadDemo objTh = new ThreadDemo();
        Thread t = new Thread(objTh);
        try {
            t.start();
            System.out.println("Number of threads running:" + Thread.activeCount());
            //Số Luồng chạy
            System.out.println("I am in the main and waiting for the thread to finish");
            //Tôi đang ở trong chính và đợi chuỗi kết thúc
            objTh.join(); //objTh is a Thread object


        }
        catch (InterruptedException e) {
            System.out.println("Main thread is interrupted"); //Chuỗi chính bị gián đoạn
        }
    }
}
