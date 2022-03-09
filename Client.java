package clientpack;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private InetSocketAddress addresse;
	private String benutzername; 
	
	public Client(String hostname, int port, String benutzername) {
		this.benutzername = benutzername;
		addresse = new InetSocketAddress(hostname, port);
	}
	
	public static void main(String[] args) {
		System.out.print("Benutzernamen angeben: ");
		Scanner scanname = new Scanner(System.in);
		String name = scanname.nextLine();
		Client client = new Client("127.0.0.1", 8001, name);
		System.out.println("'" + name + "'- also, AHA." + "\n");
		System.out.println("Nachricht: ");
		Scanner nachricht = new Scanner(System.in);
		client.schreiben(nachricht.nextLine());
	}
	
	
	
	public void schreiben(String msg) {
		
		try {
			System.out.println("Verbindung wird hergestellt...");
			Socket socket = new Socket();
			socket.connect(addresse, 60000);
			System.out.println("verbunden");
			
			System.out.println("Nachricht verschicken...");
			PrintWriter p = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			p.println(msg);
			p.flush();
			System.out.println("verschickt...");
			System.out.println(msg);
			
		}	catch (Exception e) { e.printStackTrace();}
	}
	
	
	
}
