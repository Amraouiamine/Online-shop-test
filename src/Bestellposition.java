
public class Bestellposition {
	
	private Produkt produkt;
	private int anzahl;
	private double summe;
	
	
	public Produkt getProdukt() {
		return produkt;
	}
	public void setProdukt(Produkt produkt) {
		this.produkt = produkt;
	}
	public int getAnzahl() {
		return anzahl;
	}
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	public double getSumme() {
		return summe;
	}
	public void setSumme(double summe) {
		this.summe = summe;
	}
	
	
	public Bestellposition(Produkt produkt, int anzahl, double summe) {
		super();
		this.produkt = produkt;
		this.anzahl = anzahl;
		this.summe = summe;
	}
	
	 
	public void getBestellpositionData() {
		System.out.println(produkt.getProduktNummer() + ", anzahl=" + anzahl + ", summe=" + summe);
		System.out.println();
	}
	
	
	

}
