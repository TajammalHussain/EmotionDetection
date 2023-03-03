package extratuitioncenter;


public final class StudentInfo {
    private String stdName,stdDOB,stdAddress,Ordered_Book,recmmded_Book,std_ID;
    private char student_Gender;
    
    private long student_Emergency_Contact;

    
    
    public StudentInfo(String studentId,String studentName,char studentGender,String studentDOB,String studentAddress, long studentEmergencyContact,String orderedBook,String recommendedBook)
    {
        this.setStudentId(studentId);
        this.setStudentName(studentName);
        this.setStudentGender(studentGender);
        this.setStudentDOB(studentDOB);
        this.setStudentAddress(studentAddress);
        this.setStudentEmergencyContact(studentEmergencyContact);
        this.setOrderedBook(orderedBook);
        this.setRecommendedBook(recommendedBook);
        
    }
   
    public StudentInfo()
    {
        this.std_ID="1";
        this.stdName="Hassan";
        this.student_Gender='M';
        this.stdDOB="01/22/2000";
        this.stdAddress="abc";
        this.student_Emergency_Contact=03044551223;
        this.Ordered_Book="Chemistry";
        this.recmmded_Book="Computer";
//        this.listOfBookedLessons=new ArrayList<>();
//        this.listOfPastLessons=new ArrayList<>();
//        this.listofOrderedBooks=new ArrayList<>();
    }

    
       public String getStudentId()
	{
		return this.std_ID;
	}
	
	public void setStudentId(String id)
	{
		this.std_ID = id;
	}
    
    public String getStudentName()
	{
		return this.stdName;
	}
	
	public void setStudentName(String name)
	{
		this.stdName = name;
	}
        
           public char getStudentGender()
	{
		return this.student_Gender;
	}
	
	public void setStudentGender(char gender)
	{
		this.student_Gender = gender;
	}
        
           public String getStudentDOB()
	{
		return this.stdDOB;
	}
	
	public void setStudentDOB(String dob)
	{
		this.stdDOB= dob;
	}
        public String getStudentAddress()
	{
		return this.stdAddress;
	}
	
	public void setStudentAddress(String address)
	{
		this.stdAddress = address;
	}
        
        public long getStudentEmergencyContact()
	{
		return this.student_Emergency_Contact;
	}
	
	public void setStudentEmergencyContact(long emergencyNumber)
	{
		this.student_Emergency_Contact = emergencyNumber;
	}
        
        public String getOrderedBook()
        {
            return this.Ordered_Book;
        }
        public void setOrderedBook(String book)
        {
            this.Ordered_Book=book;
        }

	public String getRecommendedBook()
	{
		return this.Ordered_Book;
	}
	public void setRecommendedBook(String book)
	{
		this.Ordered_Book=book;
	}
        
//        public String[] getListOfBookedLessons()
//	{
//		return Arrays.copyOf( this.listOfBookedLessons, listOfBookedLessons.length);
//	}
//	
//	public void setListOfBookedLessons(String[] bookedLessons)
//	{
//		this.listOfBookedLessons = listOfBookedLessons[listOfBookedLessons+1];
//	}
        
    public String ToString()
	{
		return "Student ID: "+std_ID+" "+"Student Name: "+ stdName+" "+ "Gender: "+student_Gender+" "+"Date of Birth: "+ stdDOB+" "+"Address: "+stdAddress+" "+"Eno: "+student_Emergency_Contact+" "+"Odered Books: "+Ordered_Book+" "+"Recommended Books: "+recmmded_Book;
	}
}
