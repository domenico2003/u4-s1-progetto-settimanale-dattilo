package app;


import java.util.Scanner;

import app.multimediaElemets.Audio;
import app.multimediaElemets.ElementoMultimediale;
import app.multimediaElemets.Image;
import app.multimediaElemets.Video;

public class Player {

	public static void main(String[] args) {
		
	Scanner in =new Scanner(System.in);
		ElementoMultimediale[] elementiScelti = new ElementoMultimediale[5];
		System.out.println("Inserisci 5 file multimediale.");
		System.out.println("Elementi da inserire:");
		System.out.println("- AUDIO,VIDEO,IMMAGINE in base al file da inserire ");
		System.out.println("- se è AUDIO o VIDEO inserire titolo e durata");
		System.out.println("- se è IMMAGINE inserire solo il titolo");
		for(int i = 0;i <5 ;i++) {
			System.out.println("Scegli un tipo di file");
			String scelta = in.nextLine();
			switch (scelta.toLowerCase()) {
			case "audio":
				System.out.println("inserisci il titolo");
				String titolo = in.nextLine();
				System.out.println("inserisci la durata");
				int durata = in.nextInt();
				Audio audio = new Audio(titolo, durata);
				elementiScelti[i]=audio;
				break;
			case"video":
				System.out.println("inserisci il titolo");
				String titolo1 = in.nextLine();
				System.out.println("inserisci la durata");
				int durata1 = in.nextInt();
				Video video = new Video(titolo1, durata1);
				elementiScelti[i]=video;
				break;
			case"immagine":
				System.out.println("inserisci il titolo");
				String titolo2 = in.nextLine();
				Image immagine = new Image(titolo2);
				elementiScelti[i]=immagine;
				break;
			default:
				i--;
				System.out.println("tipo non valido! **{compare anche in caso di audio e video anche quando l'operazione è riuscita, non sono riuscito a risolvere}**");
				break;
			}
		}
		int numeroInserito=1566;
		System.out.println("Di seguito gli elementi creati:");
		System.out.println();
		for (ElementoMultimediale elemento : elementiScelti) {
			System.out.println(elemento);
		}
		System.out.println();
		System.out.println("- * indica il livello di luminosità");
		System.out.println("- ! indica il livello del volume");
		System.out.println();
		while( numeroInserito != 0) {
			
				System.out.println("Scegli un numero da 1 a 5 per scegliereil file da riprodurre inserisci lo 0 per uscire.");
				numeroInserito=in.nextInt();
			 if(numeroInserito>= 1 && numeroInserito<=5) {
				ElementoMultimediale multimediaScelta=elementiScelti[numeroInserito-1];
				if(multimediaScelta.isRiproducibile()) {
					if(multimediaScelta.getTipo()== "audio") {
						
						Audio audio=(Audio)multimediaScelta;
						audio.play();
						
					}else if(multimediaScelta.getTipo()== "video") {
						Video video=(Video)multimediaScelta;
						video.play();
					}
				}else {
					Image image=(Image)multimediaScelta;
					image.show();
				}
			}else if (numeroInserito != 0) {
				System.out.println("Numero non valido inserisci un numero da 1 a 5");
			}
		}
		
		
		
		System.out.println("uscita avvenuta con successo!");
//		System.out.println("per tornare indietro inserire un numero superiore a 5");
//		numeroInserito=in.nextInt();
		in.close();
		
		
	}

}
