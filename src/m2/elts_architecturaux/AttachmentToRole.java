package m2.elts_architecturaux;

import m2.connecteur.RoleRequis;

public class AttachmentToRole implements IAttachment{
	
	protected RoleRequis role;
	
	public AttachmentToRole(RoleRequis roleR) {
		role = roleR;
	}
	
	public void sendMessage(String s) {
		role.sendMessage(s);
	}

}
