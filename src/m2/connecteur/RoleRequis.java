package m2.connecteur;

public abstract class RoleRequis implements IRole{

	protected Connecteur connect;
	
	public RoleRequis () {
	}
	
	public void setConnecteur(Connecteur connector) {
		connect = connector;
	}
	
	public void sendMessage(String s) {
		
	}
}
