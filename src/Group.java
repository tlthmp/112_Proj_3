import java.util.ArrayList;
import java.util.Scanner;

public class Group {
	private String date;
	private Organization org;
	private ArrayList<Student> sList = new ArrayList<Student>();

	public Group() {
		date = "";

	}

	public Group(String d) {
		date = d;

	}

	public void setDate(String d) {
		date = d;
	}
	public void changeStudName(String name, int i){
		sList.get(i).setName(name);
	}
	public void changeStudID(String ID, int i){
		sList.get(i).setID(ID);
	}
	public void changeStudYear(String year, int i){
		sList.get(i).setYear(year);
	}
	public void changeStudTown(String town, int i){
		sList.get(i).setTown(town);
	}
	public ArrayList<Student> getStuds(){
		return sList;
	}


	public void addOrg(String n, String t, String a) {
		setOrg(new Organization(n, t, a));
	}

	public void addStudent(String n, String ID, String c, String ht) {
		sList.add( new Student(n, ID, c, ht));
	}
	
	public void changeOrgName(String name){
		org.setorgName(name);
	}
	public void changeOrgType(String type){
		org.setType(type);
	}
	public void changeOrgAff(String affiliation){
		org.setAffiliation(affiliation);
	}

	public String getDate() {
		return date;
	}

	public void printData() {
		System.out.println(getOrg().toString() + ", ");
		System.out.println("Group's founding date: " + date);
		for(int i = 0; i < sList.size(); i++){
			System.out.println(i + ". " + sList.get(i).toString());
	    
		}
		System.out.println("");
	}
	
	public int getSize(){
		
			return sList.size();
		
	}
	
	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

}
