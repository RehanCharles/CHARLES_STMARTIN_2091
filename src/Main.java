import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
	
	//compilation problems before to submit
		Student Student=new Student(0, null, null, 0);
StudentGroup stud=new StudentGroup(0);
Scanner sc=new Scanner(System.in);
stud.getStudents();

stud.getStudent(sc.nextInt());
stud.getNextStudent(sc.nextLine());
stud.addFirst(sc.nextLine());
stud.addLast(sc.nextLine());
stud.add(sc.nextLine(),sc.nextInt());
stud.remove(sc.nextLine());


	}

}
