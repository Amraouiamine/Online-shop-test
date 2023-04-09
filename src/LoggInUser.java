import java.util.Date;
import java.util.List;

public class LoggInUser extends User {
	
	private  String passwort;

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public LoggInUser(int id, String vorname, String nachname, String emailAdresse, Date geburtsDatum,
			Adresse lieferAdresse, Adresse rechnungsAdresse, String passwort) {
		
		super(id, vorname, nachname, emailAdresse, geburtsDatum, lieferAdresse, rechnungsAdresse);
		this.passwort = passwort;
	}
  
 
	
	

}
