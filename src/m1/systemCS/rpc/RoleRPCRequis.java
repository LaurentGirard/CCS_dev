package m1.systemCS.rpc;

import m2.connecteur.Connecteur;
import m2.connecteur.RoleRequis;

public class RoleRPCRequis extends RoleRequis{

	public RoleRPCRequis() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void sendMessage(String s) {
		connect.glueAtoB(s);
	}

}
