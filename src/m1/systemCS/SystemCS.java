package m1.systemCS;


import m1.systemCS.client.Client;
import m1.systemCS.rpc.RPC;
import m1.systemCS.rpc.RoleRPCFournis;
import m1.systemCS.rpc.RoleRPCRequis;
import m1.systemCS.serveur.PortServeurFournis;
import m1.systemCS.serveur.PortServeurRequis;
import m1.systemCS.serveur.Serveur;
import m2.configuration.Configuration;
import m2.configuration.ServiceConfiguration;
import m2.connecteur.Connecteur;
import m2.elts_architecturaux.AttachmentToPortComposant;
import m2.elts_architecturaux.AttachmentToPortConfig;
import m2.elts_architecturaux.AttachmentToRole;

public class SystemCS extends Configuration{

	private Configuration serveur;

	public SystemCS() {
		super(new PortSystemRequis(), new PortSystemFournis(), new ServiceConfiguration(), new ServiceConfiguration());
		
		this.serveur = new Serveur(new PortServeurRequis(), new PortServeurFournis(), new ServiceConfiguration(), new ServiceConfiguration());
		this.add(serveur);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void addClient(Client client) {
				
		Connecteur connect = new RPC (new RoleRPCFournis(), new RoleRPCRequis());
		connect.getRoleRequis().setConnecteur(connect);
		this.add(client);
		this.add(connect);
		
		AttachmentToRole cToRPC = new AttachmentToRole(connect.getRoleRequis());
		AttachmentToPortConfig RPCToServeur = new AttachmentToPortConfig(serveur.getPortRequis());
		AttachmentToRole ServeurToRPC = new AttachmentToRole(connect.getRoleRequis());
		AttachmentToPortComposant RPCToClient = new AttachmentToPortComposant();
		
		client.getPortFournis().addAttachment(cToRPC);
		connect.getRoleFournis().setAttachmentAtoB(RPCToServeur);
		serveur.getPortFournis().addAttachment(ServeurToRPC);
		connect.getRoleFournis().setAttachmentBtoA(RPCToClient);
		
	}
	
	

}
