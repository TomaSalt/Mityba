package duomenys.mitybai;

/**
 * @author
 * by https://www.mkyong.com/java/java-enum-example/
 * by https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 * by https://www.geeksforgeeks.org/enum-in-java/
 */
public enum Menu {

	Produktai("/produktai")
	, Maistines_medz("/maistines_medz")
	, Maisto_medz_grupes("/maisto_medz_grupes")
	, Produktai_medziagos("/produktai_medziagos");
	
	private final String itemurl;
	
	Menu( String url ) {
		this.itemurl = url;
	}
	
	public String itemurl() {
		return this.itemurl;
	}
	
}