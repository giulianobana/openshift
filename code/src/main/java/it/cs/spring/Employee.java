package it.cs.spring;

public class Employee {

	String id;
	String name;
	Tipo tiplogia;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	class Tipo {
		int valore;
		String descrizione;
	
		
	}

}
