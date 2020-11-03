
public class CienAleatorios {

	public static void main(String[] args) {
	
	int num[]=new int[100];
	
	for(int i=0;i<100;i++) {
		num[i]=(int) (Math.random()*100);
	}
	
	for(int e:num) {
		System.out.println(e);
	}
	
	}

}
