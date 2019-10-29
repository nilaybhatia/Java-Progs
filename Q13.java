import java.util.*;
public class Q13
{
	public static void main(String args[])
	{
		Printer n = new Printer();
		Printer a = new Printer();
		NumbersThread nt = new NumbersThread(n);
		AlphabetsThread at = new AlphabetsThread(a);
		System.out.println("The pattern printed using multi-threading is");
		nt.start();
		at.start();
	}
}

class Printer {
	public synchronized void printNum() {
		for(int i = 1; i <= 9; i++) {
			System.out.print(i);
			try {
			Thread.sleep(500);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	notifyAll();
	}

	public synchronized void printAlpha() {
		for(char c = 'A'; c <= 'I'; c++) {
			System.out.print(c);
			try {
				Thread.sleep(500);
				}
			catch (InterruptedException e) {
					System.out.println(e);
			}
		}
	notifyAll();
	}
}

class NumbersThread extends Thread {
	Printer n;
	NumbersThread(Printer n) {
		this.n = n;
	}
	public void run() {
		n.printNum();
	}
}

class AlphabetsThread extends Thread {
	Printer a;
	AlphabetsThread(Printer a) {
		this.a = a;
	}
	public void run() {
		a.printAlpha();
	}
}