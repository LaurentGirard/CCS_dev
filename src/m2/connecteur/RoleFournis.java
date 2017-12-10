package m2.connecteur;

import m2.elts_architecturaux.AttachmentToPortComposant;
import m2.elts_architecturaux.IAttachment;

public class RoleFournis implements IRole{
	
	protected IAttachment attachmentAtoB;	
	protected IAttachment attachmentBtoA;
	
	public void setAttachmentAtoB(IAttachment atta) {
		attachmentAtoB = atta;
	}
	
	public void setAttachmentBtoA(IAttachment atta) {
		attachmentBtoA = atta;
	}
	
	public void sendMessage(String s) {
		
	}

}
