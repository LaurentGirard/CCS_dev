package m2.connecteur;

import m2.elts_architecturaux.ElementArchi;

public abstract class Connecteur implements ElementArchi{
	
	private Role roleFournis;
	private Role roleRequis;
	
	public Connecteur(Role roleFournis, Role roleRequis) {
		this.roleFournis = roleFournis;
		this.roleRequis = roleRequis;
	}
	
	public Role getRoleFournis() {
		return roleFournis;
	}
	public Role getRoleRequis() {
		return roleRequis;
	}
	
	public abstract void glueAtoB();
	public abstract void glueBtoA();
	

}
