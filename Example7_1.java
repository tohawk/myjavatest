import java.applet.*;
import java.awt.*;
public static class Example7_1 extends Applet{
    Font f1 = new Font("Helvetica",Font.PLAIN,18);
    Font f2 = new Font("Helvetica", Font.BOLD,10);
    Font f3 = new Font("Helvetica",Font.ITALIC,12);
    Font f4 = new Font("Courier",Font.PLAIN,12);
    Font f5 = new Font("TimesRoman", Font.BOLD+Font.ITALIC,14);
    Font f6 = new Font("Dialog",Font.ITALIC,14);
    public void paint(Graphics g){
        setSize(250,200);
        g.setFont(f1);drawString("18pt plain Helvetica",5,20);
        g.setFont(f2);drawString("10pt bold Helvetica",5,43);
        g.setFont(f3);drawString("12pt italic Helvetica",5,58);
        g.setFont(f4);drawString("12pt plain courier",5,75);
        g.setFont(f5);drawString("14pt bold & italic times Roman",5,92);
        g.setFont(f6);drawString("14pt italic dialog",5,111);
    }

	public static void main(String[] args){
		Example7_1.paint();
	}
}
