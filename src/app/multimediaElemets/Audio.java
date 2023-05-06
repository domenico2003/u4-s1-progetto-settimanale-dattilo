package app.multimediaElemets;

import app.multimediaElemets.interfacce.IRiproducibile;

public class Audio extends ElementoMultimediale implements IRiproducibile{
	private int durata=0;
	private int volume=5;
	
	public Audio(String titolo,int durata) {
		super(titolo, true,"audio");
		this.setDurata(durata);
		
	}

	@Override
	public void play()  {
		String volumeEsclamativi ="";
		for(int i = 0; i< this.volume;i++) {
			
			volumeEsclamativi +="!";
		}
		
		for(int i = 0; i< this.durata;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(this.getTitolo()+ volumeEsclamativi);
			
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
	
	public String toString() {
		return "tipo: audio; durata:"+this.durata +"; titolo: " + this.getTitolo() +";";
	}

}
