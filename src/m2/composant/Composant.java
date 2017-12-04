package m2.composant;

import java.util.ArrayList;
import java.util.List;

import m2.elts_architecturaux.ElementArchi;

public abstract class Composant implements ElementArchi{

	private PortComposant portRequis;
	private PortComposant portFournis;
	private ServiceComposant serviceRequis;
	private ServiceComposant serviceFournis;
	private List<String> proprietesFonctionnelles;
	private List<String> proprietesNonFonctionnelles;
	
	public Composant(PortComposant portRequis, PortComposant portFournis, ServiceComposant serviceRequis,
			ServiceComposant serviceFournis) {
		this.portRequis = portRequis;
		this.portFournis = portFournis;
		this.serviceRequis = serviceRequis;
		this.serviceFournis = serviceFournis;
		proprietesFonctionnelles = new ArrayList<>();
		proprietesNonFonctionnelles = new ArrayList<>();
	}
	
	public PortComposant getPortRequis() {
		return portRequis;
	}
	public PortComposant getPortFournis() {
		return portFournis;
	}
	public ServiceComposant getServiceRequis() {
		return serviceRequis;
	}
	public ServiceComposant getServiceFournis() {
		return serviceFournis;
	}
	public List<String> getProprietesFonctionnelles() {
		return proprietesFonctionnelles;
	}
	public List<String> getProprietesNonFonctionnelles() {
		return proprietesNonFonctionnelles;
	}
}
