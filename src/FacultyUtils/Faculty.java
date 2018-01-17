package FacultyUtils;

public class Faculty {
	private int id;
	private String name, deanName;
	public Faculty(int id, String name, String deanName) {
		super();
		this.id = id;
		this.name = name;
		this.deanName = deanName;
	}
	public Faculty()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeanName() {
		return deanName;
	}
	public void setDeanName(String deanName) {
		this.deanName = deanName;
	}
}
