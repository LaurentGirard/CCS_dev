package m1.systemCS.client;

import m2.composant.Composant;
import m2.composant.ServiceComposant;

public class Client extends Composant {

	public Client() {
		super(new PortClientRequis(), new PortClientFournis(), new ServiceComposant(), new ServiceComposant());
		// TODO Auto-generated constructor stub
		
		//this.getPortFournis().addAttachment();
	}
	
	public void sendMessage(String s) {
		
		PortClientFournis portClientFournis = (PortClientFournis) portFournis;
		portClientFournis.sendMessage(s);
		
	}

}
