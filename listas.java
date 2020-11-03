import javax.swing.JOptionPane;

public class listas {

	public static void main(String[] args) {

		int num=0;
		String[] paises=new String[5];
		
		for(int i=0;i<paises.length;i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce pais " + (i+1) + " de 5");
		}
		
		for(String lista:paises) {
			num++;
			System.out.println("Pais "+num+": "+lista);
		}
	}

}
