package Club_atletas;

import java.util.Scanner;

public class Atleta {
	private static Scanner sc = new Scanner(System.in);
	public static int numatleta = 0;

	public static void contarAtleta() {
		numatleta++;
	}

	private String dni;
	private String nombre;
	private int añonacimiento;
	private float altura;/* en cm */
	private int peso;/* en kg */
	private boolean estudia;
	private Genero genero;

	// private static Scanner;
	public Atleta() {

	}

	public Atleta(String dni, String nombre, int añonacimiento, float altura, int peso, boolean estudia,
			Genero genero) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.añonacimiento = añonacimiento;
		this.altura = altura;
		this.peso = peso;
		this.estudia = estudia;
		this.genero = genero;
	}

	public Atleta(String dni, String nombre, int añonacimiento, Genero genero) {

	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAñonacimiento() {
		return añonacimiento;
	}

	public void setAñonacimiento(int añonacimiento) {
		this.añonacimiento = añonacimiento;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean isEstudia() {
		return estudia;
	}

	public void setEstudia(boolean estudia) {
		this.estudia = estudia;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Atleta [dni=" + dni + ", nombre=" + nombre + ", añonacimiento=" + añonacimiento + ", altura=" + altura
				+ ", peso=" + peso + ", estudia=" + estudia + ", genero=" + genero + "]";
	}

	public static Atleta deTeclado() {

		System.out.print("Dame DNI: ");
		String dni = sc.nextLine();
		System.out.print("Dame nombre: ");
		String nombre = sc.nextLine();
		System.out.print("dime la edad:");
		int añonacimiento = sc.nextInt();
		sc.nextLine();
		System.out.print("dime la altura: ");
		float altura = sc.nextFloat();
		sc.nextLine();
		System.out.print("dime: el peso: ");
		int peso = sc.nextInt();
		sc.nextLine();
		System.out.print("dime si estudia (S/N): ");
		String siONo = sc.nextLine();
		boolean estudia;
		if (siONo.toUpperCase().equals("S"))
			estudia = true;
		else
			estudia = false;
		System.out.print("dime: tu género (M/F/X): ");
		String generodado = sc.nextLine();
		Genero genero;
		if (generodado.toUpperCase().equals("M")) {
			genero = Genero.M;
		} else {
			if (generodado.toUpperCase().equals("F")) {
				genero = Genero.F;
			} else {
				genero = Genero.X;
			}
		}
		contarAtleta();
		return new Atleta(dni, nombre, añonacimiento, altura, peso, estudia, genero);
	}
}
