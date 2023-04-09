import java.util.Date;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		// Userdaten ausgeben
		Adresse lieferAdresse =  new LieferAdresse("BandwierkerStrasse", "42",  "Deutschland", 22041);
		Adresse rechnungsAdresse =  new RechnungAdresse("BandwierkerStrasse", "42",  "Deutschland", 22041);
		User amine = new LoggInUser(1, "Amine", "EL Amraoui", "amine@gmail.com", new Date(91,3,9), lieferAdresse, rechnungsAdresse, "123456");
		
		
	   Produkt p1 = new Produkt("123a", 20)	;
	   Produkt p2 = new Produkt("56ha", 40.99);
	   
	   
	   // Warenlkorb Summe rechnen
	   Warenkorb warenKorb = new Warenkorb(amine);
	   warenKorb.add2WarenKorb(p1);
	   warenKorb.add2WarenKorb(p2);
	   
	   // Update Produkt Test
	   warenKorb.updateProkukt(p2, 6);
 
	   // Bestellposition test 
	   
	  List<Bestellposition> bestellpositionen =  warenKorb.checkOut();
	  
	  // Bestellung aufgeben
	  
	 Order order =  new Order(bestellpositionen, Zahlungsmethode.PAYPAL, amine);
	  
	  
	 order.confirmOrder();
		
	}

}
