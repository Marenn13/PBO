

package polymorf;

public class UnderGraduateStudent extends Student {
     public String getCourseGrade (){
      int total= 0;
      for (int i = 0; i < NUM_OF_TESTS; i++){
          total += test [i];
      }
      if (total /  NUM_OF_TESTS >=80 ){
          CourseGrade = "Pass";
          }
      else {
         CourseGrade = "No Pass";
      }
      return CourseGrade;
    }        
    
}
