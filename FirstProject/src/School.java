public class School {

    private int studentID;
    private String studentName;
    private String gender;
    private double marks;
    private int studentClass;

    public School(){

    }

    public School(String studentName, int studentID, String gender, double marks, int studentClass) {
        //TODO Auto-generated constructor stub
        this.studentClass= studentClass;
        this.studentID= studentID;
        this.studentName=studentName;
        this.marks=marks;
        this.gender=gender;
    }

    int getStudentID(){
        return studentID;
    }
    void setStudentID(int studentID){
         this.studentID=studentID;
    }
    
    String getStudentName(){
        return studentName;
    }
    void setStudentName(String studentName){
        this.studentName= studentName;
    }

    String getGender(){
        return gender;
    }
    void setGender(String gender){
this.gender=gender;
    }

    double getMarks(){
        return marks;
    }
    void setMarks(double marks){
        this.marks=marks;
    }

    int getStudentClass(){
        return studentClass;
    }
    void setStudentClass(int studentClass){
        this.studentClass=studentClass;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + studentName + '\'' +
                ", studentID=" + studentID +
                ", gender='" + gender + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", marks='"+ marks + '\''+
                '}';
    }


}