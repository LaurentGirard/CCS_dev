package m2.connecteur;

import m2.elts_architecturaux.ElementArchi;

public abstract class Connecteur implements ElementArchi{
	
	protected RoleFournis roleFournis;
	protected RoleRequis roleRequis;
	
	public Connecteur(RoleFournis roleFournis, RoleRequis roleRequis) {
		this.roleFournis = roleFournis;
		this.roleRequis = roleRequis;
	}
	
	public RoleFournis getRoleFournis() {
		return roleFournis;
	}
	public RoleRequis getRoleRequis() {
		return roleRequis;
	}
	
	public String getDescriptif() {
		return "Je suis un connecteur!";
	}
	
	public abstract void glueAtoB(String s);
	public abstract void glueBtoA(String s);
	

}
