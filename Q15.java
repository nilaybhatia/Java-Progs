import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Q15 extends Applet implements addActionListener {
    TextField name, pass;
    Label n, p, w;
    Button s, c;

public void init() {
n=new Label("NAME:");
name=new TextField(20);
add (n);
add(name);
p=new Label("PASSWORD:");
pass=new TextField(20);
pass.setEchoChar('*');
add(p);
add(pass);
w=new Label("Login");
add(w);
s=new Button("OK");
add(s);
s.addActionListener(this);
c=new Button("RESET");
add(c);
c.addActionListener(this);
}

public void actionPerformed(ActionEvent event){
if(event.getSource()==s){
w.setText("SUCCESS");
}
if(event.getSource()==c)
{
    name.setText("");
    pass.setText("");
}
}
}
/*-------------------------------------------------
applet.html :-
<html>
    <title>A hello world applet</title>
    <hr>
    <applet code="Q15.class" width="320" height="120">Applet not working</applet>
    
</html>*/