package app.multimediaElemets;

public abstract class ElementoMultimediale {
	private String titolo;
	private boolean Riproducibile;
	private String tipo;
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public boolean isRiproducibile() {
		return Riproducibile;
	}
	public void setRiproducibile(boolean riproducibile) {
		Riproducibile = riproducibile;
	}
	public ElementoMultimediale(String titolo,boolean Riproducibile,String tipo) {
		this.titolo=titolo;
		this.Riproducibile=Riproducibile;
		this.tipo=tipo;
	}
	public String getTipo() {
		return tipo;
	}
	
	
}
