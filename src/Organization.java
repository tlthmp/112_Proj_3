
public class Organization {
	private String orgName;
	private String type;
	private String affiliation;
	
	public Organization(){
		orgName = "";
		type = "";
		affiliation = "";
	}

	public Organization(String o, String t, String a){
		orgName = o;
		type = t;
		affiliation = a;
	}
	public void setorgName(String o){
		orgName = o;
	}
	public void setType(String t){
		type = t;
	}
	public void setAffiliation(String a){
		affiliation = a;
	}
	public String getorgName(){
		return orgName;
	}
	public String getType(){
		return type;
	}
	public String getAffiliation(){
		return affiliation;
	}
	
	public String toString(){
		return (orgName + ", " + type + ", " + affiliation);
	}

}
