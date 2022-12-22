package Club_atletas;

import java.util.Arrays;

public class Club {
	private Atleta[] Atletas;

	public Club(int n) {
		Atletas = new Atleta[n];

	}

	public void addAtleta(Atleta x) {
		for (int i = 0; i < Atletas.length; i++) {
			Atletas[i] = x;
		}
	}

	@Override
	public String toString() {
		return "Club [Atletas=" + Arrays.toString(Atletas) + "]";
	}

}// class
