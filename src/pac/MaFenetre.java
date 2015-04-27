package pac;

import javax.swing.JFrame;

public class MaFenetre extends JFrame {//héritage 
 void creerFenetre() {
	setSize(400, 300);//pour fixer la taille de la fenetre
	setVisible(true);

}
	
 
 
 
 public static void main(String[] args) {
MaFenetre f=new MaFenetre();	
f.creerFenetre();
}
}
