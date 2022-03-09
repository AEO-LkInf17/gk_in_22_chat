package serverpack1;

public class Nachricht {
	
	private String inhalt;
	private String absender;
	
	public Nachricht(String inhalt,String absender) {
		this.setInhalt(inhalt);
		this.setAbsender(absender);
	}

	public String getInhalt() {
		return inhalt;
	}

	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}

	public String getAbsender() {
		return absender;
	}

	public void setAbsender(String absender) {
		this.absender = absender;
	}
}
