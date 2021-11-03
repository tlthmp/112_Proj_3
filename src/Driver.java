import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Driver {

	public static void main(String[] args) throws IOException, NullPointerException {

		ArrayList<Group> group = new ArrayList<Group>();
		File file = new File("P3data.csv");
		Scanner input = new Scanner(new File("P3data.csv"));
		int index = -1;
		PrintWriter pwr = new PrintWriter("newdata.txt");

		while (input.hasNextLine()) {
			String in = input.nextLine();


			String[] Token = in.split(",");
			if (Token.length == 1) {
				group.add(new Group(Token[0])); 
				index = group.size() -1;
			} else if (Token.length == 3) {
				group.get(index).addOrg(Token[0], Token[1], Token[2]);
			} else if(Token.length == 4){
				
				group.get(index).addStudent(Token[0], Token[1], Token[2], Token[3]);
			}
			
			
				
		}
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		do {
		System.out.println("You can pick any of the blow choices or enter -1 to exit");
		System.out.println("1. Print all of the Data");
		System.out.println("2. Change a Groups start date");
		System.out.println("3. Change a Groups Organization name");
		System.out.println("4. Change a Groups Organization type");
		System.out.println("5. Change a Groups Organization affiliation");
		System.out.println("6. Change a Students name");
		System.out.println("7. Change a Students id");
		System.out.println("8. Change a Students year");
		System.out.println("9. Change a Students hometown");
		System.out.println("10. Save the data to a file");
		System.out.println("");
		System.out.println("Enter your choice:");
		
		choice = scan.nextInt();
		System.out.println("");
		
		switch (choice) 
		{
		case 1:
			System.out.println("Group name, type, affliation, and members: ");
			System.out.println("");
			for(int i = 0; i < group.size(); i++){
				System.out.println("\t\t Group #" + i);
				group.get(i).printData();
				System.out.println("Total group size: " + group.get(i).getSize());
				System.out.println();	
			
			}
		break;
		case 2:
			int groupind = 0;
			String newdate = "";
			System.out.println("Please enter the Group's index");
			System.out.println("");	
			groupind = scan.nextInt();
			scan.nextLine();
			System.out.println("");
			System.out.println("Please enter the new date");
			newdate = scan.nextLine();
			group.get(groupind).setDate(newdate);
		break;
		case 3:
			int groupInd3 = 0;
			String newName = "";
			System.out.println("Please enter the Group's index");
			System.out.println("");	
			groupInd3 = scan.nextInt();
			scan.nextLine();
			System.out.println("");
			System.out.println("Please enter the Group's new name");
			newName = scan.nextLine();
			group.get(groupInd3).changeOrgName(newName);
		break;
		case 4:
			int groupInd4 = 0;
			String newType = "";
			System.out.println("Please enter the Group's index");
			System.out.println("");	
			groupInd4 = scan.nextInt();
			System.out.println("");
			System.out.println("Please enter the Group's new Type");
			newType = scan.nextLine();
			group.get(groupInd4).changeOrgType(newType);
		
		break;
		case 5:
			int groupInd5 = 0;
			String newAff = "";
			System.out.println("Please enter the Group's index");
			System.out.println("");	
			groupInd5 = scan.nextInt();
			System.out.println("");
			System.out.println("Please enter the Group's new Affiliation");
			newAff = scan.nextLine();
			group.get(groupInd5).changeOrgAff(newAff);
			
		break;
		case 6:
			String currentName;
			String newStudName = "";
			int groupInd6;
			System.out.println("Please enter the Group's index");
			System.out.println("");	
			groupInd6 = scan.nextInt();
			System.out.println("Please enter the Student's number");
			System.out.println("");	
			int currentNum = scan.nextInt();
			System.out.println("");
			scan.nextLine();
			System.out.println("Please enter the Student's new name");
			newStudName = scan.nextLine();
			group.get(groupInd6).changeStudName(newStudName, currentNum);
		break;
		case 7:
			String currentID;
			String newStudID = "";
			int groupInd7;
			System.out.println("Please enter the Group's index");
			System.out.println("");	
			groupInd7 = scan.nextInt();
			System.out.println("Please enter the Student's number");
			System.out.println("");	
			int studNum = scan.nextInt();
			System.out.println("");
			scan.nextLine();
			System.out.println("Please enter the Student's new ID number");
			newStudID = scan.nextLine();
			group.get(groupInd7).changeStudID(newStudID, studNum);
		break;
		case 8:
			String newStudYear = "";
			int groupInd8;
			System.out.println("Please enter the Group's index");
			System.out.println("");	
			groupInd8 = scan.nextInt();
			System.out.println("Please enter the Student's number");
			System.out.println("");	
			int studNumb = scan.nextInt();
			System.out.println("");
			scan.nextLine();
			System.out.println("Please enter the Student's new year");
			newStudID = scan.nextLine();
			group.get(groupInd8).changeStudYear(newStudYear, studNumb);
		break;
		case 9:
			String newStudTown = "";
			int groupInd9;
			System.out.println("Please enter the Group's index");
			System.out.println("");	
			groupInd9 = scan.nextInt();
			System.out.println("Please enter the Student's number");
			System.out.println("");	
			int studNumbs = scan.nextInt();
			System.out.println("");
			scan.nextLine();
			System.out.println("Please enter the Student's new hometown");
			newStudID = scan.nextLine();
			group.get(groupInd9).changeStudYear(newStudTown, studNumbs);
		break;	
		case 10:
			for(int i = 0; i < group.size();i++){
				pwr.println(group.get(i).getDate());
				pwr.println(group.get(i).getOrg());
				pwr.print(group.get(i).getStuds());
				
			}
			pwr.close();
		break;
			
		}
		
		
		
		
		} while (choice != -1);
		System.out.println("After the data was changed: ");
		System.out.println("");
		System.out.println("");
		for(int i = 0; i < group.size(); i++){
			System.out.println("\t\t Group #" + i);
			group.get(i).printData();
			System.out.println();	
		
		
		
		
		
		
	}
}
}//end class