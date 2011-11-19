package at.jku.ce;

public class DomainObject {
    public String getUuid();
    private String name;

    public DomainObject(String id) {
        super();
        this.id = id;
    }
    /** * Default constructor */
    public DomainObject() {
        super();
    }
	
    public String getUuid() 
    { 
        return id; 
    }

}
