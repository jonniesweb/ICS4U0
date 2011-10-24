package multicastTest;

import java.net.*;
import java.io.*;

public class MulticastClient{
	public static final int PORT = 1200; 
	public static void main(String args[]) throws Exception{

		MulticastSocket socket;
		DatagramPacket packet;
		InetAddress address; 

		address = InetAddress.getByName("224.1.2.3");
		socket = new MulticastSocket(1337);

		socket.joinGroup(address);
		byte[] data = new byte[65535];
		packet = new DatagramPacket(data,65535, address, 1337);

		for(;;)
		{                                
			// receive the packets 
			socket.receive(packet); 
			String str = new String(packet.getData());
			System.out.println(" Time signal received from"+
					packet.getAddress() + " Time is : " +str);
		}  // for 

	}  // main     

}  // class Broadcast