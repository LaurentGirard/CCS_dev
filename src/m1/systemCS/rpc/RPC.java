package m1.systemCS.rpc;

import m2.connecteur.Connecteur;
import m2.connecteur.RoleFournis;
import m2.connecteur.RoleRequis;

public class RPC extends Connecteur {

	public RPC(RoleFournis roleFournis, RoleRequis roleRequis) {
		super(roleFournis, roleRequis);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void glueAtoB(String s) {
		// TODO Auto-generated method stub
		this.getRoleFournis().sendMessage(s);
	}

	@Override
	public void glueBtoA(String s) {
		// TODO Auto-generated method stub
		
		
	}

	
}
