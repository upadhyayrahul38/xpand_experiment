
public abstract class PersonImplementation {

	// bad practice
	private String name;
	public void setName(String value) {
		this.name = value;
	}

	public String getName() {
		return this.name;
	}

}
