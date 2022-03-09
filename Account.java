package serverpack1;

public class Account {
	private String benutzername;
	private int Id;
	
	public Account(String benutzername, int id) {
		this.benutzername = benutzername;
		this.Id = id;
	}
	public String getBenutzername() {
		return benutzername;
	}
	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
}
