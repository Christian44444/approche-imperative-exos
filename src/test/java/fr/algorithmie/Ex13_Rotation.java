package fr.algorithmie;

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
@Exercice(nom="Rotation")
public class Ex13_Rotation {

	// NE PAS CHANGER LES NOMS
	// mais vous pouvez modifier les valeurs contenues dans array
	int[] array = { 0, 1, 2, 3};
	int[] result = new int[array.length];
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() {

		// TODO Effectuez une rotation à droite des éléments du tableau array
		// Exemple : si le tableau contient {0,1,2,3} alors il contiendra {3,0,1,2}
		// après rotation
		for (int j = 1; j <= 3  ;j++) {
			
			for (int i = array.length -1 ; i >= 0; i--) {
				if (i > 0) {
					result[i - 1] = array[i];
				}
				else result[array.length -1] = array[0];
							
			}
			array[0] = result[0];
			array[1] = result[1];
			array[2] = result[2];
			array[3] = result[3];
		}
			
		
		// TODO Afficher le contenu du tableau après rotation avec Resultat.log
		for (int i = 0 ; i <= result.length -1; i++) {
			Resultat.log(result[i]);
		}
	}

}
