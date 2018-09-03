package MascamoMedicareblore.brach1;



public class InterfaceDemo {

	public static void main(String[] args) {
		VoxG1 p = new polo1();
		VoxG1 v = new vento1();
		p.carcompany();
		p.color();
		p.model();
		v.carcompany();
		v.color();
		v.model();

	}
}

interface VoxG1 {

	abstract void color();

	abstract void model();

	abstract void carcompany();

}

class polo1 implements VoxG1 {

	public void model() {
		System.out.println("polo1");
	}

	public void color() {
		System.out.println("blue");
	}

	public void carcompany() {
		System.out.println("volkswagen");
	}

}

class vento1 implements VoxG1 {

	public void model() {
		System.out.println("vento1");
	}

	public void color() {
		System.out.println("white");
	}

	public void carcompany() {
		System.out.println("volkswagen");
	}

}