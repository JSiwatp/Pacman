package pacman;
        
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Pacman extends JFrame implements KeyListener{
        public static final int WIDTH = 375;
        public static final int HEIGHT = 425;
        
        static Model m1;
        static state2 m2;
        ImagePanel im = new ImagePanel();
        
	public Pacman() {
		add(im);
                addKeyListener(this);
                
                
        }
        
	
	public static void main(String[] args) {
		Pacman pac = new Pacman();
		pac.setVisible(true);
		pac.setTitle("Pacman");
		pac.setSize(WIDTH,HEIGHT);
		pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pac.setLocationRelativeTo(null);

                String filepath = "AP.wav";
                
                musicStuff musicObject = new musicStuff();
                musicObject.playMusic(filepath);
                
	}

        
        public void keyPressed(KeyEvent e){
            if(e.getKeyCode() == KeyEvent.VK_LEFT){
                m1 = new Model();
                remove(im);
                setSize(Pacman.WIDTH,Pacman.HEIGHT);
                add(m1);
                m1.requestFocusInWindow();
                setVisible(true);
            }
            if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                m2 = new state2();
                remove(im);
                setSize(Pacman.WIDTH,Pacman.HEIGHT);
                add(m2);
                m2.requestFocusInWindow();
                setVisible(true);
            }
           
        }
        

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }


class ImagePanel extends JPanel{

        ImageIcon bg = new ImageIcon("bg.jpg");
        Image BG = bg.getImage();
        

    @Override
    public void paint(Graphics g) {
        g.drawImage(BG, 0, 0, getWidth(), getHeight(), this);

    }
}
    
}
