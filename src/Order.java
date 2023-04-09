import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private List<Bestellposition> bestellpositions;
	
	private Zahlungsmethode zahlungsmethode;
	
	private User user;

	public Order(List<Bestellposition> bestellpositions, Zahlungsmethode zahlungsmethode, User user) {
		super();
		this.bestellpositions = bestellpositions;
		this.zahlungsmethode = zahlungsmethode;
		this.user = user;
	}

	public List<Bestellposition> getBestellpositions() {
		return bestellpositions;
	}

	public void setBestellpositions(List<Bestellposition> bestellpositions) {
		bestellpositions = bestellpositions;
	}

	public Zahlungsmethode getZahlungsmethode() {
		return zahlungsmethode;
	}

	public void setZahlungsmethode(Zahlungsmethode zahlungsmethode) {
		this.zahlungsmethode = zahlungsmethode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	public void confirmOrder() {
		user.getUserData();
		
		System.out.println("-----Bestellpositionen----------");
		for (Bestellposition bestellposition : bestellpositions) {
			bestellposition.getBestellpositionData();
		}
		
		zahlungsmethode.getZahlungsmethode();
		
		System.out.print("Vielen Dank für Ihre Bestellung!");
		
	}

}
