package fr.algorithmie;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifPlusGrand")
public class Ex18_InteractifPlusGrand {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		
		// TODO Demander à l'utilisateur de saisir 10 nombres entiers
		// TODO Affichez chaque nombre saisi avec Resultat.log
		// TODO Enfin affichez avec Resultat.log le max des 10 nombres
		int[] result = new int[10];
		int j = 0;
		int k = 0;
		boolean w = true;
		
		System.out.println("Saisissez 10 nombres:");
		
		for (int i = 0 ; i <= 9 ; i ++) {
			result[i] = scanner.nextInt();
		}
		
		for (int i = 0 ; i <= 9 ; i ++) {
			Resultat.log(result[i]);
			if (w) {
				j = result[i];
				k = j;
				w = !w;
			}
			if (k < result[i]) { 
				k = result[i];
			}
		}
		
		Resultat.log(k);
		scanner.close();
	}

}
