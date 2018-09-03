package MascamoMedicareblore.brach1;

/**
 * @author s.nagaraja.setty
 *
 */
public class AbstractDemo {

	public static void main(String[] args) {
     VoxG p=new polo();
     VoxG v=new vento();
     p.carcompany();
     p.color();
     p.model();
     v.carcompany();
     v.color();
     v.model();
		
	}

}
abstract class VoxG {
	
	abstract void color();
	abstract void model();
	
	public void carcompany() {
		System.out.println("volkswagen");
	}

}


class polo extends VoxG {
	
	public void model() {
		System.out.println("polo");
	}

	public void color() {
		System.out.println("blue");
	}
	
}
class vento extends VoxG {
	
	public void model() {
		System.out.println("vento");
	}

	public void color() {
		System.out.println("white");
	}
	
}