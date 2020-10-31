package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {

	private int id;
	private int likes;
	private String bruker;
	private String dato;
//	protected int doLike;

	public Innlegg() {

	}

	public Innlegg(int id, String bruker, String dato) {

		// TODO
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;

		likes = 0;

	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;

	}

	public String getBruker() {

		return bruker;

	}

	public void setBruker(String bruker) {

		this.bruker = bruker;

	}

	public String getDato() {
		return dato;

	}

	public void setDato(String dato) {
		this.dato = dato;

	}

	public int getId() {
		return id;

	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLikes() {
		return likes;

	}

	public void doLike() {

		for (int i = 0; i < id; i++) {
			likes += 1;

		}

	}

	public boolean erLik(Innlegg innlegg) {

		boolean erLik = true;

		if (this == innlegg) {
			return erLik;
		}

		else {
//		else if ((innlegg == null) || !(innlegg instanceof Innlegg)) {
//			return !erLik;
		}
		return !erLik;
	}

	@Override
	public String toString() {

		String str = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		return str;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		throw new UnsupportedOperationException(TODO.method());

	}
}
