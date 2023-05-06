package app.multimediaElemets;

import app.multimediaElemets.interfacce.ILuminosita;


public class Image extends ElementoMultimediale implements ILuminosita{
	
	private int luminosita=5;
	
	public Image(String titolo) {
		super(titolo, false,"immagine");
		
	}


	public void show()  {
		
		String luminositaAsterischi ="";
		
		
		for(int i = 0; i< this.luminosita;i++) {
			
			luminositaAsterischi +="*";
		}
		
			System.out.println( this.getTitolo()+luminositaAsterischi);
			
		}		

	@Override
	public void aumentaLuminosita(int luminosita) {
		int luminositaAumentata=this.luminosita + luminosita;
		if(luminositaAumentata>=0 && luminositaAumentata<=10) {
			this.luminosita=luminositaAumentata;
		}else {
			System.out.println("la luminosità attuale è "+ this.luminosita +" non puoi aumentarla di "+luminosita +", la luminosità deve essere compresa tra 0 e 10");
		}
		
	}

	@Override
	public void diminuisciLuminosita(int luminosita) {
		 int luminositaDiminuita=this.luminosita - luminosita;
			if(luminositaDiminuita>=0 && luminositaDiminuita<=10) {
				this.luminosita=luminositaDiminuita;
			}else {
				System.out.println("la luminosità attuale è "+ this.luminosita +" non puoi diminuirla di "+luminosita +" la luminosità deve essere compresa tra 0 e 10");
			}
		
	}

	public int getLuminosita() {
		return luminosita;
	}


	
@Override
	
	public String toString() {
		return "tipo: immagine; titolo: " + this.getTitolo() +";";
	}
	

}

