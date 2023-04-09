
public class Produkt {
	
	private String produktNummer;
	private String produktName;
	private boolean verfuegbar;
	private String farbe;
	private String gewicht;
	private int mengeInLage;
	private double preise;
	
	
	
	public Produkt(String produktNummer, double preise) {
		super();
		this.produktNummer = produktNummer;
		this.preise = preise;
	}
	public String getProduktNummer() {
		return produktNummer;
	}
	public void setProduktNummer(String produktNummer) {
		this.produktNummer = produktNummer;
	}
	public String getProduktName() {
		return produktName;
	}
	public void setProduktName(String produktName) {
		this.produktName = produktName;
	}
	public boolean isVerfuegbar() {
		return mengeInLage > 0;
	}
	public void setVerfuegbar(boolean verfuegbar) {
		this.verfuegbar = verfuegbar;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public String getGewicht() {
		return gewicht;
	}
	public void setGewicht(String gewicht) {
		this.gewicht = gewicht;
	}
	public int getMenge() {
		return mengeInLage;
	}
	public void setMenge(int mengeInLage) {
		this.mengeInLage = mengeInLage;
		
	}
	public double getPreise() {
		return preise;
	}
	public void setPreise(double preise) {
		this.preise = preise;
	}
	
	
	
}	
