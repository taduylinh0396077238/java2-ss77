/**
 * Sử dụng isAlive và các phương thức tham gia
 */
package Java2_07;
/**
 * ThreadDemo kế thừa từ giao diện Runnable
 */

class threadDemo implements Runnable {
    String name;
    Thread objTh;
    /* Hàm tạo của lớp */
    threadDemo(String str){
        name = str;
        objTh = new Thread(this,name);
        System.out.println("New Thread are starting :" + objTh);
        //Chủ đề mới đang bắt đầu
        objTh.start();
    }
    public  void run() {
        try {
            for (int count = 0 ; count <2; count++){
                System.out.println(name + ":"+ count);
                objTh.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name + "interrupted");
        }
        System.out.println(name + "exiting");
    }

    public static void main(String[] args) {
        threadDemo objNew1 = new threadDemo("one");
        threadDemo objNew2 = new threadDemo("tow");
        threadDemo objNew3 = new threadDemo("three");
        System.out.println("First thread is alive:"+objNew1.objTh.isAlive());
        System.out.println("Second thread is alive:"+objNew2.objTh.isAlive());
        System.out.println("Third thread is alive:"+objNew3.objTh.isAlive());
    try {
        System.out.println("Trong phương thức chính, đợi các luồng kết thúc");
        objNew1.objTh.join();
        objNew2.objTh.join();
        objNew3.objTh.join();
    } catch (InterruptedException e){
        System.out.println("Main thread is interrupted");
        System.out.println("First thread is alive:"+objNew1.objTh.isAlive());
        System.out.println("Second thread is alive:"+objNew2.objTh.isAlive());
        System.out.println("Third thread is alive:"+objNew3.objTh.isAlive());
        System.out.println("Main thread is over and exiting");
    }
    }

}


