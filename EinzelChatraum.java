package serverpack1;

public class EinzelChatraum {
	private String benutzer1;
	private String benutzer2;
	
	public EinzelChatraum(String benutzer1, String benutzer2) {
		this.benutzer1 = benutzer1;
		this.benutzer2 = benutzer2;
	}
	
	public String getBenutzer1() {
		return benutzer1;
	}
	public void setBenutzer1(String benutzer1) {
		this.benutzer1 = benutzer1;
	}
	public String getBenutzer2() {
		return benutzer2;
	}
	public void setBenutzer2(String benutzer2) {
		this.benutzer2 = benutzer2;
	}
}
