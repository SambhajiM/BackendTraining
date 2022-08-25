package in.codegram.kanbantool.enumeration;

public enum MenuItemEnum {
	ADD_PROJECT(1, "Add Project"),LIST_PROJECT(2,"List Project"),UPDATE_PROJECT(3, "Update Project"),
	DELETE_PROJECT(4, "Delete Project"),EXIT(0, "Exit");
	
	private int sequence;
	private String menuName;
	
	private MenuItemEnum(int sequence, String menuName) {
		this.sequence = sequence;
		this.menuName = menuName;
	}
	
	public int getSequence() {
		return this.sequence;
	}
	
	public String getMenuName() {
		return this.menuName;
	}
}
