class Num extends Thread{
	void run(){
	for(int i=1;i<=9;i++)
	{	
	System.out.printf("%d",i);
	try{Thread.sleep(500);
	}catch(Exception e){}
	}
	}
class Alpha extends Thread{
	void run(){
	for(int i=1;i<=9;i++)
	{	
	System.out.printf("%c",64+i);
	try{Thread.sleep(500);
	}catch(Exception e){}
	}
	}
public class MultiThreading{
	public static void main(String args[]){
	Num num=new Num();
	Alpha alpha=new Alpha();
	num.start();
	try{Thread.sleep(500);
	}catch(Exception e){}
	alpha.start();
	}
}