package pack;
 public class Student
{String name;
  int rno;
public void setName(String s){name=s;}
 public void setRoll(int rno){this.rno=rno;}
static void getDetails(){System.out.println("Roll No"+rno+"\n Name"+name );}
public static void main(String []ar){
                     Student ob=new Student();
                     ob.setName("te");
                     ob.setRoll(12);
                      getDetails();}
}
