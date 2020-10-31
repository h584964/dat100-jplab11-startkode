package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		// Åpne ny fil
		// Skriv data til filen
		// Lukke filen
		boolean skrevet = true;
		// Åpner filen for skriving

//		mappe = System.getProperty("user.dir") + "/src/no/hvl/dat100/tests" ;	
//		filnavn = new String(mappe + filnavn);

		try {
			String fn = mappe + filnavn;

			PrintWriter pw = new PrintWriter(fn);

			pw.println(samling.toString());

			pw.println("done");
			pw.close();

			System.out.println("done");
		} catch (Exception e) {
			System.out.println("Feil inntastning av fil");

			return !skrevet;
		}
//		try {
//			PrintWriter skriver = new PrintWriter(filnavn);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return skrevet;

	}
}
