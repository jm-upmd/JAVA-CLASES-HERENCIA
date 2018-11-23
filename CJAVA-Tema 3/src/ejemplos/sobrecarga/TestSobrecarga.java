package ejemplos.sobrecarga;

public class TestSobrecarga {

	public static void main(String[] args) {
		Operaciones op = new Operaciones();
		System.out.println(op.suma(8, 35));
		System.out.println(op.suma(8, 10, 14));
	}
}

