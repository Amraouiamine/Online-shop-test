import java.util.Date;

abstract class User {
	
	private int id;
	private String vorname;
	private String nachname;
	private String emailAdresse;
	private Date geburtsDatum;
	private Adresse lieferAdresse;
	private Adresse rechnungsAdresse;
	
	
	public int getId() {
		return this.id;
	}
	
	public void setID(int id) {
		this.id = id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getEmailAdresse() {
		return emailAdresse;
	}

	public void setEmailAdresse(String emailAdresse) {
		this.emailAdresse = emailAdresse;
	}

	public Date getGeburtDatum() {
		return geburtsDatum;
	}

	public void setGeburtDatum(Date geburtsDatum) {
		this.geburtsDatum = geburtsDatum;
	}


	public Adresse getLieferAdresse() {
		return lieferAdresse;
	}

	public void setLieferAdresse(Adresse lieferAdresse) {
		this.lieferAdresse = lieferAdresse;
	}

	public Adresse getRechnungsAdresse() {
		return rechnungsAdresse;
	}

	public void setRechnungsAdresse(Adresse rechnungsAdresse) {
		this.rechnungsAdresse = rechnungsAdresse;
	}

	
	
	public User(int id, String vorname, String nachname, String emailAdresse, Date geburtsDatum, Adresse lieferAdresse,
			Adresse rechnungsAdresse) {
		
		super();
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
		this.emailAdresse = emailAdresse;
		this.geburtsDatum = geburtsDatum;
		this.lieferAdresse = lieferAdresse;
		this.rechnungsAdresse = rechnungsAdresse;
	}

	public void getUserData() {
		System.out.println("-----User Data----");
		System.out.println(this.getId());
		System.out.println(this.getVorname());
		System.out.println(this.getNachname());
		System.out.println(this.getGeburtDatum());
		this.getLieferAdresse().getAdresseData();;
		this.getRechnungsAdresse().getAdresseData();
		
		
		
	}		
	
	
}
