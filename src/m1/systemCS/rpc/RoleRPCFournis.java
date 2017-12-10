package m1.systemCS.rpc;

import m2.connecteur.RoleFournis;
import m2.elts_architecturaux.AttachmentToPortConfig;

public class RoleRPCFournis extends RoleFournis {
	
	public void sendMessage(String s) {
		AttachmentToPortConfig castAttachmentAtoB = (AttachmentToPortConfig) attachmentAtoB;
		castAttachmentAtoB.sendMessage(s);
	}

}
