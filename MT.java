//import MyPackage.*;
import MyPackage.SOP;
class CurrentThread {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        SOP.sop(t);
        t.setName("my thread");
        SOP.sop(t);
        try {
            for(int i = 0; i < 10; i++){
                SOP.sop(i);
                Thread.sleep(1000); //and not t.sleep(), works but warning
            }
        }
        catch(InterruptedException e) {
            SOP.sop(e);
        }
    }
}