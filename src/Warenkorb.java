import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warenkorb {
	
	
	Map<Produkt, Integer> produkteMap = new HashMap<>(); 
	private User user;
	
	public void add2WarenKorb(Produkt produkt) {
		produkteMap.put(produkt, 1);
	}
	
	public void updateProkukt(Produkt produkt, int anzahl) {
		produkteMap.put(produkt, anzahl);
	}

	public void produktLoeschen(Produkt produkt) {
		produkteMap.remove(produkt);
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	public Warenkorb(User user) {
		super();
		this.user = user;
	}

	public double getWarenkorbSumme() {
		
		System.out.println("Warenkorb von UserId: " + user.getId());
		System.out.println("ProduktNummer   " + " Anzahl   " +  "Summe  " );
		double warenkorbSumme = 0;
		for (Map.Entry<Produkt, Integer> pair : produkteMap.entrySet()) {
			double postionsSumme = pair.getValue() * pair.getKey().getPreise();
		    System.out.println(pair.getKey().getProduktNummer() + "              " + pair.getValue() + "       "+  postionsSumme);
		    warenkorbSumme = warenkorbSumme + postionsSumme;
		}
		
		System.out.println("-----------------------------------");
		System.out.println(warenkorbSumme);
		return warenkorbSumme;
	}
	
	public List<Bestellposition> checkOut() {
		List<Bestellposition> items = new ArrayList<Bestellposition>();
		
		for (Map.Entry<Produkt, Integer> pair : produkteMap.entrySet()) {
			double postionsSumme = pair.getValue() * pair.getKey().getPreise();
			items.add(new Bestellposition(pair.getKey(), pair.getValue(), postionsSumme));
		}
		
		return items;
	}
	
}
