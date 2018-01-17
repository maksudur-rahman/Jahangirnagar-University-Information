package FacultyUtils;

public class facultylist extends Faculty{
	private int id;
	private String name;

	public facultylist(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public facultylist() {
		
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

}
