package app.multimediaElemets;

import app.multimediaElemets.interfacce.ILuminosita;
import app.multimediaElemets.interfacce.IRiproducibile;

public class Video extends ElementoMultimediale implements IRiproducibile,ILuminosita{
	private int durata=0;
	private int volume=5;
	private int luminosita=5;
	
	public Video(String titolo,int durata) {
		super(titolo, true,"video");
		this.setDurata(durata);
		
	}

	@Override
	public void play()  {
		String volumeEsclamativi ="";
		String luminositaAsterischi ="";
		for(int i = 0; i< this.volume;i++) {
			
			volumeEsclamativi +="!";
		}
		
		for(int i = 0; i< this.luminosita;i++) {
			
			luminositaAsterischi +="*";
		}
		
		for(int i = 0; i< this.durata;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println( volumeEsclamativi+this.getTitolo()+luminositaAsterischi);
			
		}		
	}

	

	@Override
	public void abbassaVolume(int volume) {
		 int volumeAbbassato=this.volume - volume;
		if(volumeAbbassato>=0 && volumeAbbassato<=10) {
			this.volume=volumeAbbassato;
		}else {
			System.out.println("il volume atttuale è "+ this.volume +" non puoi abbassarlo di "+volume +"il volume deve essere compreso tra 0 e 10");
		}
		
	}

	@Override
	public void alzaVolume(int volume) {
		 int volumeAlzato=this.volume + volume;
			if(volumeAlzato>=0 && volumeAlzato<=10) {
				this.volume=volumeAlzato;
			}else {
				System.out.println("il volume atttuale è "+ this.volume +" non puoi alzarlo di "+volume +"il volume deve essere compreso tra 0 e 10");
			}
			
		
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getVolume() {
		return volume;
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
		return "tipo: video; durata:"+this.durata +"; titolo: " + this.getTitolo() +";";
	}

}

