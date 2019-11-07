import java.util.*;
class num implements Runnable {
    public void run() {
        for(int i=1;i<=9;i++) {
            System.out.print(i);
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class alpha implements Runnable {
    public void run() {
        for(char i='A';i<='H';i++) {
            System.out.print(i);
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Multi {
    public static void main(String [] args) {
        num n1=new num();
        alpha a1=new alpha();
        Thread t1=new Thread(n1);
        Thread t2=new Thread(a1);
        t1.start();
        try{Thread.sleep(10);} catch(Exception e){}
        t2.start();
    }
}
