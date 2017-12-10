package m2.elts_architecturaux;

import m2.configuration.PortConfigRequis;

public class AttachmentToPortConfig implements IAttachment{
	
	protected PortConfigRequis port;

	public AttachmentToPortConfig(PortConfigRequis portRequis) {
		// TODO Auto-generated constructor stub
		port = portRequis;
	}
	
	public void sendMessage(String s) {
		port.receive(s);
	}

}
