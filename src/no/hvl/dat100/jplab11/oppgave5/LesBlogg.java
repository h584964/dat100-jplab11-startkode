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
	
		Blogg samling = null;
		
		try {
			BufferedReader leser = new BufferedReader(new FileReader(mappe + filnavn));
			
			String line;
			line = leser.readLine();
			int antall = Integer.parseInt(line);
			
			samling = new Blogg(antall);
			Innlegg innlegg = null;
			
			while(antall > 0) {
			line = leser.readLine();
			
			int id = Integer.parseInt(leser.readLine());
			String bruker = leser.readLine();
			String dato = leser.readLine();
			int likes = Integer.parseInt(leser.readLine());
			String tekst = leser.readLine();
			
			if(line.equals(BILDE)) {
				String bilde = leser.readLine();
				innlegg = new Bilde(id, bruker, dato, likes, tekst, bilde);
			} else if (line.equals(TEKST)) {
				innlegg = new Tekst(id, bruker, dato, likes, tekst);
			} else {
				System.out.println("Feil i format");
			}
			
			samling.leggTil(innlegg);
			antall--;
			}
			
			leser.close();
			
		} catch(FileNotFoundException e) {
			System.out.println("Feil med fil");	
		} catch(IOException e) {
			System.out.println("Feil med å lese linje");
		}
		
		 return samling;
		
	}

		
		
		
		
		
//		String fn = mappe + filnavn;
//
//		try {
//			File file = new File(fn);
//			Scanner leser = new Scanner(file);
//
//			
//			int antBlogg = Integer.parseInt(leser.nextLine()); // antall innlegg i tabellen
//			String[] innleggTab = new String[antBlogg];
//			
//			
//			boolean tekst = false;
////			boolean line = leser.hasNextLine();
//
//			for (int i = 0; i < antBlogg; i++) {
//				innleggTab[i] = leser.nextLine();
//			//brke en if setning om det er et bilde eller ikke
//				// boolean variable som heter bilde, sann hvis bilde, else hvis false.
//				if (leser.equals(TEKST)) {
//					tekst = true;
//				} else {
//					tekst = false;
//				}
//				
//				}	
//				leser.close();
//				
//			} catch (FileNotFoundException e) {
//			System.out.println("Fant ikke filen");
//			}
//		
		
	}


//			int linenumber = 1;
//		
//
//			TEKST = "TEKST";
//			BILDE = "BILDE";
//			while (leser.hasNextLine()) {
//				TEKST = leser.nextLine();
//				BILDE = leser.nextLine();
//				
////				line = leser.nextLine();
//				if (TEKST != null) {
//				System.out.println(linenumber + " " + TEKST);
//				linenumber++;
//				}
//				if(BILDE != null) {
//				System.out.println(linenumber + " " + leser.nextLine());	
//				}
//			}
//
//			
//
//		
//		}
//		return null;
//	}
