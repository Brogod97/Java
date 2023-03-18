package edu.kh.network.run;

import edu.kh.network.model.service.TCPServer;

public class ServiceRun {

	public static void main(String[] args) {
		TCPServer server = new TCPServer();
		
		server.serverStart();
	}

}
