package multicastTest;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Date;

public class MulticastServer {
	
	public static final int port = 1337;
	
	
	public static void main(String[] args)  throws Exception {
		
		MulticastSocket socket;
		DatagramPacket packet;
		InetAddress address;
		
		address = InetAddress.getByName("224.1.2.3");
		socket = new MulticastSocket(1337);
		socket.joinGroup(address);
		
		byte[] data = null;
		
		while (true) {
			
			Thread.sleep(1000);
			
			System.out.println("Sending ");
			String str = (new Date()).toString();
			data = str.getBytes();
			packet = new DatagramPacket(data, str.length(), address, port);
			
		}
		
		
	}
	
}