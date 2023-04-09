
public enum Zahlungsmethode {
	
	PAYPAL,
	Creditcard,
	SofortUeberweisung;

	
	public void getZahlungsmethode() {
		System.out.println("----Zahlungsmethode----");
		System.out.println(this.name());
	}
	
	
}
