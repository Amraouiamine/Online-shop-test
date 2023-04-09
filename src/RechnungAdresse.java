
public class RechnungAdresse extends Adresse {

	public RechnungAdresse(String strasse, String hausNummer, String land, int plz) {
		super(strasse, hausNummer, land, plz);
	}
	
	@Override
	public void getAdresseData() {
		System.out.println("---------RechnungsAdresse-----------");
		System.out.println(this.getStrasse());
		System.out.println(this.getHausNummer());
		System.out.println(this.getPlz());
		System.out.println(this.getLand());
		System.out.println();
	}
	
}
