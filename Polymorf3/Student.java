package polymorf;
public class Student {
     protected   final static int NUM_OF_TESTS = 3;
    protected   String           name;
    protected   int[]            test;
    protected   String           CourseGrade;
    public Student( ) {
        this("No Name");
    }
    public Student(String studentName) {
        name = studentName;
        test = new int[NUM_OF_TESTS];
        CourseGrade = "****";
    }
    public String getCourseGrade( ) {
      return CourseGrade;
    }
    public String getName( ) {
      return name;
    }
    public int getTestScore(int testNumber) {
      return test[testNumber-1];
    }
public void setName(String newName) {
      name = newName;
    }
public void setTestScore(int testNumber, int testScore) {
      test[testNumber-1] = testScore;
    }

   
    
}
