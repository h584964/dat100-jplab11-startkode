package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {
//	protected int id;
//	protected int likes;
//	protected String bruker;
//	protected String dato;
//	protected String tekst;
	protected String url;
	// TODO - objekt variable
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id, bruker, dato, tekst);
		
		this.url = url;
	}
	
	
	
	
	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst);
		
		this.url = url;
		
	}

	
//	public void setId (int id) {
//		this.id = id;
//	}
	
	
//	public void setBruker(String bruker) {
//		this.bruker = bruker;
//	}
	
	
//	public void setDato(String dato) {
//		this.dato = dato;
//	}
	
	
//	public void setLikes(int likes) {
//		this.likes = likes;
//	}
	
	
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
//	return "BILDE\n" + super.toString() + url;
//	return "BILDE" + super.toString() + url + "\n";
		String str = "BILDE" + "\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\net bilde" + "\n" + getUrl() + "\n";
		return str;
//		return super.toString() + "BILDE" + this.toString();
//		return "BILDE" + super.getTekst() + super.toString() + url;
		

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
