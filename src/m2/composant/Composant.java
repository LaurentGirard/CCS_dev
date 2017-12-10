package m2.composant;

import java.util.ArrayList;
import java.util.List;

import m2.elts_architecturaux.ElementArchi;

public abstract class Composant implements ElementArchi{

	private IPortComposant portRequis;
	private IPortComposant portFournis;
	private ServiceComposant serviceRequis;
	private ServiceComposant serviceFournis;
	private List<String> proprietesFonctionnelles;
	private List<String> proprietesNonFonctionnelles;
	
	public Composant(PortComposantRequis portRequis, PortComposantFournis portFournis, ServiceComposant serviceRequis,
			ServiceComposant serviceFournis) {
		this.portRequis = portRequis;
		this.portFournis = portFournis;
		this.serviceRequis = serviceRequis;
		this.serviceFournis = serviceFournis;
		proprietesFonctionnelles = new ArrayList<>();
		proprietesNonFonctionnelles = new ArrayList<>();
	}
	public String getDescriptif() {
		return "Je suis un composant!";
	}
	
	public IPortComposant getPortRequis() {
		return portRequis;
	}
	public IPortComposant getPortFournis() {
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
