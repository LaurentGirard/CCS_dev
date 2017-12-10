package m2.connecteur;

import m2.elts_architecturaux.ElementArchi;

public abstract class Connecteur implements ElementArchi{
	
	private IRole roleFournis;
	private IRole roleRequis;
	
	public Connecteur(RoleFournis roleFournis, RoleRequis roleRequis) {
		this.roleFournis = roleFournis;
		this.roleRequis = roleRequis;
	}
	
	public IRole getRoleFournis() {
		return roleFournis;
	}
	public IRole getRoleRequis() {
		return roleRequis;
	}
	
	public String getDescriptif() {
		return "Je suis un connecteur!";
	}
	
	public abstract void glueAtoB();
	public abstract void glueBtoA();
	

}
