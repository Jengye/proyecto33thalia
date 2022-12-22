package Club_atletas;

public class PruebaAtletaV1 {

	public static void main(String[] args) {
		// crea el atleta con sus valores y los saca en pantalla
		Atleta uno = Atleta.deTeclado();
		// System.out.println("uno es: "+uno.toString());
		Atleta dos = Atleta.deTeclado();
		// System.out.println(dos.toString());

		Club daw1 = new Club(Atleta.numatleta);
		daw1.addAtleta(uno);
		daw1.addAtleta(dos);
		System.out.println(daw1);

	}// main
}// class
