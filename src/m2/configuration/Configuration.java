package m2.configuration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import m2.composant.Composant;
import m2.elts_architecturaux.ElementArchi;


public abstract class Configuration implements ElementArchi{
	
	private String descriptif;
	private List<ElementArchi> children;
	private PortConfigRequis portRequis;
	private PortConfigFournis portFournis;
	private ServiceConfiguration serviceRequis;
	private ServiceConfiguration serviceFournis;
	
	
	/*
	 * ça peut être pas mal de faire un itérateur (http://smeric.developpez.com/java/uml/composite/)
	 * 
	 */
	
	
	public Configuration(PortConfigRequis portR, PortConfigFournis portF,
			ServiceConfiguration serviceR, ServiceConfiguration serviceF ) {		
		portRequis = portR;
		portFournis = portF;
		serviceRequis = serviceR;
		serviceFournis = serviceF;
		children = new ArrayList<ElementArchi>();
		descriptif = "Je suis une configuration";
	}
	
	
	/** Ajoute un ElementArchi à la liste des composants
     * @param elt l'élementArchi que l'on veux ajouter au composite
     */
    public void add(ElementArchi elt){
        assert null != children;
        boolean hasComposantchild = false;
        if (null == elt) {
            System.out.println("Impossible d'ajouter un produit null");
        }
        
       if (!(elt instanceof Composant)) {
        	for (ElementArchi eltchild : children ) {
        		if (eltchild instanceof Composant) hasComposantchild = true;
        	}
        } else {
        	hasComposantchild = true;
        }

        if (hasComposantchild)
        	children.add(elt);
    }
    
    /** Descriptif du produit. Peut être le résultat d'une accumulation de
     * descriptifs si le produit est composé
     * @return  le descriptif composé
     */
    public String getDescriptif() {
        assert null != children;

        StringBuffer result = new StringBuffer();
        result.append(descriptif);
        result.append(" : (");

        for (Iterator<ElementArchi> i = children.iterator(); i.hasNext(); ) {
            Object objet = i.next();

            assert null != objet : "Un objet null a été trouvé dans la liste des composantes";
            assert objet instanceof ElementArchi : "Un \"non produit\" a été trouvé dans la liste des composantes";

            ElementArchi composant = (ElementArchi)objet;

            result.append(composant.getDescriptif());
            if (i.hasNext()) { // on ajoute une virgule pour séparer les descriptifs
                result.append(", ");
            }
        }

        result.append(" )");
        return result.toString();
    }

	
	public PortConfigRequis getPortRequis() {
		return portRequis;
	}
	public PortConfigFournis getPortFournis() {
		return portFournis;
	}
	public ServiceConfiguration getServiceRequis() {
		return serviceRequis;
	}
	public ServiceConfiguration getServiceFournis() {
		return serviceFournis;
	}
	
	

}
