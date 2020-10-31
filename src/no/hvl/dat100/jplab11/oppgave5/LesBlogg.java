package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;
import no.hvl.dat100.jplab11.oppgave4.SkrivBlogg;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		// Åpne filen for lesing
		// Lese inn første linje for filen
		// Behandle innlest linje
		// Les inn neste linje for filen
		// Bruker BufferReader, se på oppgaven LeserFraFil
//		FileReader leser = new FileReader(fn);
//		BufferedReader fil = new BufferedReader(leser);
	
		String fn = mappe + filnavn;

		try {
			File file = new File(fn);
			Scanner leser = new Scanner(file);

			
			int antBlogg = Integer.parseInt(leser.nextLine()); // antall navn i tabellen
			String[] innleggTab = new String[antBlogg];
			
			

			for (int i = 0; i < antBlogg; i++) {
				innleggTab[i] = leser.nextLine();
			
			
			
				
			}
			int linenumber = 1;
			String line;

			TEKST = "TEKST";
			BILDE = "BILDE";
			while (leser.hasNextLine()) {
				TEKST = leser.nextLine();
				BILDE = leser.nextLine();
				
//				line = leser.nextLine();
				if (TEKST != null) {
				System.out.println(linenumber + " " + TEKST);
				linenumber++;
				}
				if(BILDE != null) {
				System.out.println(linenumber + " " + leser.nextLine());	
				}
			}

			leser.close();

		} catch (FileNotFoundException e) {
			System.out.println("Fant ikke filen");
		}
		return null;
	}
}
