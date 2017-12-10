package m2.composant;

import java.util.ArrayList;
import java.util.List;
import m2.elts_architecturaux.*;

public class PortComposantFournis implements IPortComposant{
	
	protected List<AttachmentToRole> attachments;
	
	public PortComposantFournis() {
		attachments = new ArrayList<AttachmentToRole>();
	}
	
	public void addAttachment(AttachmentToRole atta) {
		attachments.add(atta);
	}


}
