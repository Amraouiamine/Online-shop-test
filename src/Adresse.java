
abstract class Adresse {
	
	private String strasse;
	private String HausNummer;
	private String Land; 
	private int plz;
	
	
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public int getPlz() {
		return plz;
	}
	public void setPlz(int plz) {
		this.plz = plz;
	}
	public String getHausNummer() {         
		return HausNummer;
	}
	public void setHausNummer(String hausNummer) {
		HausNummer = hausNummer;
	}
	public String getLand() {
		return Land;
	}
	public void setLand(String land) {
		Land = land;
	}
	
	
	public Adresse(String strasse, String hausNummer, String land, int plz) {
		super();
		this.strasse = strasse;
		HausNummer = hausNummer;
		Land = land;
		this.plz = plz;
	}
	
	public void getAdresseData() {
		 
	}
	
	

}
