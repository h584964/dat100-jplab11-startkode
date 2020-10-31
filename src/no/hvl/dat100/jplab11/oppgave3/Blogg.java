package no.hvl.dat100.jplab11.oppgave3;



import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave2.Bilde;
import no.hvl.dat100.jplab11.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariable
//	protected int antall;
//	private Innlegg[] samling;
//	private int nesteLedige;
//	private int lengde;
	Innlegg innleggtabell[];
	int nesteLedige = 0;

	public Blogg() {
		// tom parmeterliste er en stander konstruktør.
		
//		Blogg tabell = new Blogg(20);
		innleggtabell = new Innlegg[20];
	
		
//		throw new UnsupportedOperationException(TODO.method());
		
//		System.out.println(0);
//		System.out.println(20);
		
		
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
//		nesteLedige = 0;
		
//		this.lengde = lengde;

	}

	public int getAntall() {
		return nesteLedige;

	}

	public Innlegg[] getSamling() {

		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		boolean finnInnlegg = false;
		int pos = 0;

		while (pos < nesteLedige && !finnInnlegg) {
			if (innleggtabell[pos].erLik(innlegg)) {
				finnInnlegg = true;
			} else {
				pos++;
			}

		}
		if (finnInnlegg) {
			return pos;
		} else {
			return -1;
		}
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = true;
		
//		if(innlegg == innlegg.getId()) {
//			return finnes;
//		}
		
		for (int i = 0; i < nesteLedige; i++) {
			if (innlegg.getId() == innleggtabell[i].getId()) {
				return finnes;
			}

		}

		return !finnes;
	}

	public boolean ledigPlass() {
		boolean ledigPlass = false;
//		System.out.println(nesteLedige);
//		System.out.println(innleggtabell.length);
		if (nesteLedige < innleggtabell.length) {
			return true;
		}
			
		
		
		return ledigPlass;
	}

	public boolean leggTil(Innlegg innlegg) {
		boolean lagtTil = false;
		
//		System.out.println(nesteLedige);
//		System.out.println(innleggtabell.length);
		if(nesteLedige < innleggtabell.length) {
		
			
			innleggtabell[nesteLedige] = innlegg;
			nesteLedige++;
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public String toString() {
		String svar = nesteLedige + "\n";
		for(int i = 0; i < nesteLedige; i++) {
			
			svar += innleggtabell[i].toString() ;
		}
//		System.out.println(svar);
		return svar;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		 Innlegg [] tab = new Innlegg[innleggtabell.length];
		 
		
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {
		int pos = finnInnlegg(innlegg);
		if (pos >= 0) {
			nesteLedige--;
			innleggtabell[pos] = innleggtabell[nesteLedige];
			innleggtabell[nesteLedige] = null;
			return true;
		} else {
			return false;
		}
		
		
	}	

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}