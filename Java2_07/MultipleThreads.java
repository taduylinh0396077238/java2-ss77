/** Tạo nhiều chủ đề bằng cách sử dụng kính dẫn xuất từ lớp Chủ đề*/

package Java2_07;
/**
 * Multiple Threads được tạo asasubclass của lớp Thread
 */
public class MultipleThreads extends Thread {
    // Biến để lưu tên của chuỗi
    String name;
    /**
     * Phương thức này của lớp Thread được ghi đè để chỉ định hành động
     * điều đó sẽ được thực hiện khi luồng bắt đầu thực thi.
     */
    public void run() {
        while (true) {
            name = Thread.currentThread().getName();
            System.out.println(name);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e){
                break;
            }
        }// kết thucsa trong vòng lặp while
    }
    /**
     * Đây là điểm đầu vào cho lớp Multiple Threads.
     */
    public static void main(String[] args) {
        MultipleThreads t1 = new MultipleThreads();
        MultipleThreads t2 = new MultipleThreads();
        t1.setName("Thread2");
        t2.setName("Thread3");
        t1.start();
        t2.start();
        System.out.println("Number of threads running:" + Thread.activeCount());
    }
}
