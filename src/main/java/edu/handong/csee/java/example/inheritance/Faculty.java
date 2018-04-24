package edu.handong.csee.java.example.inheritance;

public class Faculty extends Person {
	
	private int facultyNumber;
	public Faculty()    {
		super();
		facultyNumber = 0;
  }

    public Faculty(String newName, int intNewFacultyNumber){
    	super(newName);
    	facultyNumber = intNewFacultyNumber;    
}
    
    	public void reset(String newName, int newFacultyNumber) {
    		setName(newName);        
    		facultyNumber = newFacultyNumber;
    }
    public int getFacultyNumber() {
    	return facultyNumber;
}
    public void setFacultyNumber(int newFacultyNumber) {
    	facultyNumber = newFacultyNumber;
    }
    
    public void writeOutput() {
    	System.out.println("Name: " + getName());
    	System.out.println("FacultyNumber: " + facultyNumber);
    }
    public boolean equals(Faculty otherFaculty) {
    	return this.hasSameName(otherFaculty) && (this.facultyNumber == otherFaculty.facultyNumber);    }


}
