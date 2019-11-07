/*My correct implementation */
class Printer {
	int num=1;
	char alpha='A';
	boolean numPrinted = false;

	/*Just prints a single instance of field num*/
	synchronized void printNum() { //if you remove sync, you'll get IllegealMonitorStateException

		if(numPrinted) {
			try{
				wait();
			}
			catch(InterruptedException e){}
		}
		System.out.print(num++);
		//Thread.sleep() is optional and only for effect; you'll get same o/p with and w/o
		/*try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {}*/
		numPrinted = true;
		notify();
	}

	synchronized void printAlpha() {

		if(!numPrinted){
			try{
				wait();
			}
			catch(InterruptedException e){}
		}
		System.out.print(alpha++);
		/*try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {}*/
		numPrinted = false;
		notify();
	}
}

class NumbersThread implements Runnable {
	Printer p;

	NumbersThread(Printer p){
		this.p = p;
		new Thread(this, "Numbers").start();
	}
	public void run(){
		for(int i = 1; i <= 9; i++){
			p.printNum();
		}		
	}
}

class AlphabetsThread implements Runnable {
	Printer p;

	AlphabetsThread(Printer p){
		this.p = p;
		new Thread(this, "Alphabets").start();
	}
	public void run(){
		for(int i = 1; i <= 9; i++){
			p.printAlpha();		
		}
	}
}

public class Q13 {
	public static void main(String args[]){
		Printer p1 = new Printer();
		new NumbersThread(p1);
		Printer p2  = new Printer();
		new AlphabetsThread(p2);

	}
}