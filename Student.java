public class Student 
{ 
     int last_roll = 50;  
    int roll_no; 
  /*
    // Constructor 
    Student() 
    { 
    //    roll_no = last_roll; 
     //   last_roll++; 
    } 
  */
    // Overriding hashCode() 
   // @Override
 /*   public int qwert() 
    { 
        return last_roll; 
    } 
  */
    // Driver code 
    public static void main(String args[]) 
    { 
        Student s = new Student(); 
        
        // Below two statements are equivalent 
        System.out.println(s); 
      //  System.out.println(s.toString()); 
    } 
} 