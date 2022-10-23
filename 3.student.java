class student
{
   int rollno;
   String name;
   float per;
   student(int r)
   {
	rollno=r;
   }
   student()
   {
	name="Vaishnavi";
	per=86;
   }
   void set1()
   {
  	System.out.println("Student rollno is="+rollno);
   }
   void set2()
   {
  	System.out.println("Student name is="+name);
  	System.out.println("Student percentage is="+per);
   }
   public static void main(String arg [])
   {
 	student student1=new student(70);
        student student2=new student();
        student1.set1();
        student2.set2();
   }
}
