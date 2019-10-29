import java.awt.*;
import java.awt.event.*;

class TestAWT extends Frame{
	TextField name, pass;
	Button b1,b2;

	TestAWT() {
		setLayout(new FlowLayout());
		this.setLayout(null);
		Label n = new Label("Enter your Name:", Label.CENTER);
		Label p = new Label("Enter case sensitive Password:", Label.CENTER);
		//Label p1 = new Label("Re-enter your password:", Label.CENTER);
		Label g = new Label("Gender:", Label.CENTER);
		List gender = new List(3);
		gender.add("Male");
		gender.add("Female");
		gender.add("Other");
		name = new TextField(20);
		pass = new TextField(20);
		//pass1 = new TextField(20);
		pass.setEchoChar('#');
		//pass1.setEchoChar('.');
		b1 = new Button("submit");
		b2 = new Button("cancel");
		this.add(n);
		this.add(name);
		this.add(p);
		this.add(pass);
		/*this.add(p1);
		this.add(pass1);*/
		this.add(g);
		this.add(gender);
		this.add(b1);
		this.add(b2);
		n.setBounds(70, 90, 90, 60);
		p.setBounds(70, 170, 180, 60);
		//p1.setBounds(70, 130, 90, 60);
		g.setBounds(70, 130, 90, 60);
		name.setBounds(200, 110, 90, 20);
		pass.setBounds(200, 190, 90, 20);
		gender.setBounds(200, 150, 90, 20);
		b1.setBounds(100, 260, 70, 40);
		b2.setBounds(180, 260, 70, 40);
		MenuBar mb=new MenuBar();
		Menu menu=new Menu("Menu");
		Menu submenu=new Menu("Share");
		MenuItem i1=new MenuItem("New tab");
		MenuItem i2=new MenuItem("New window");
		MenuItem i3=new MenuItem("Print...");
		MenuItem i4=new MenuItem("Email Link");
		MenuItem i5=new MenuItem("Notes");
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		submenu.add(i4);
		submenu.add(i5);
		menu.add(submenu);
		mb.add(menu);
		this.setMenuBar(mb);
	}
}
public class Q16 {
	public static void main(String args[]){
		TestAWT ml = new TestAWT();
		ml.setVisible(true);
		ml.setSize(400,400);
		ml.setTitle("Welcome Customer");
		ml.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		});
	}
}
