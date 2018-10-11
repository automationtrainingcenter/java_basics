package basicconcepts;


public class Student {
	String name;
	int rollNum;
	String address;
	String branch;
	String phNum;
	
	public Student() {
		this.name = "default name";
		this.rollNum = 0;
		this.address = "default address";
		this.branch = "default branch";
		this.phNum ="default";
	}
	
	public Student(String name, int rollNum, String branch) {
		this(name, rollNum, branch, "","");
	}
	
	public Student(String name, int rollNum, String branch, String address) {
		this(name, rollNum, branch, address, "");
	}
	
	public Student(String name, int rollNum, String branch, String address, String phNum) {
		this.name = name;
		this.rollNum = rollNum;
		this.branch = branch;
		this.address = address;
		this.phNum = phNum;
	}
	
	public void print() {
		System.out.println("name = "+this.name+"\nrollnum = "+this.rollNum+"\nbranch = "+this.branch+"\naddress = "+this.address+"\nphNum = "+this.phNum);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.print();
		Student s2 = new Student("vidya", 101, "eee");
		s2.print();
		Student s3 = new Student("tejaswi", 102, "cse", "kukatpally");
		s3.print();
		Student s4 = new Student("prakash", 103, "eee", "kphb", "9876654321");
		s4.print();
	}

}
