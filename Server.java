package serverpack1;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {
	
	
	public static void main(String[] args) {
		Server server = new Server(8001);
		server.verbinden();
	}
	
	private int port;
	
	public Server(int port) {
		this.port = port;
	}

	public void verbinden() {
		
		new Thread(new Runnable() {
			
				public void run() {
					try {
						
						ServerSocket serverSocket = new ServerSocket(port);
						System.out.println("Verbindung wird hergestellt...");
						Socket clientsocket = serverSocket.accept();
						System.out.println("verbunden mit:" + clientsocket.getRemoteSocketAddress());
					
						Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(clientsocket.getInputStream())));
						if (scanner.hasNextLine()) {
								System.out.println("Nachricht" + scanner.nextLine());
							}
						scanner.close();
						clientsocket.close();
						serverSocket.close();
					} catch (Exception a) { 
						a.printStackTrace(); }
				}
			
		}).start();
		}	
	}
