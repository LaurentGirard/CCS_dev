package m2.configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import m2.elts_architecturaux.AttachmentToRole;

public abstract class PortConfigFournis extends Observable implements IPortConfiguration {

	
	private List<AttachmentToRole> attachments;

	
	public PortConfigFournis() {
		attachments = new ArrayList<AttachmentToRole>();
	}
	
	public void addAttachment(AttachmentToRole atta) {
		attachments.add(atta);
	}
}
