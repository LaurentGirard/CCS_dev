package m2.configuration;

import m2.elts_architecturaux.*;

public abstract class Configuration implements ElementArchi{
	
	private PortConfiguration portRequis;
	private PortConfiguration portFournis;
	private ServiceConfiguration serviceRequis;
	private ServiceConfiguration serviceFournis;
	
	public Configuration(PortConfiguration portR, PortConfiguration portF,
			ServiceConfiguration serviceR, ServiceConfiguration serviceF ) {		
		portRequis = portR;
		portFournis = portF;
		serviceRequis = serviceR;
		serviceFournis = serviceF;
	}
	
	public PortConfiguration getPortRequis() {
		return portRequis;
	}
	public PortConfiguration getPortFournis() {
		return portFournis;
	}
	public ServiceConfiguration getServiceRequis() {
		return serviceRequis;
	}
	public ServiceConfiguration getServiceFournis() {
		return serviceFournis;
	}
	
	

}
