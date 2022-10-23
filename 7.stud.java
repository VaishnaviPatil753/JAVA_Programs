class stud
{
    private int rollno=70;
    private String name="Vaishnavi";
    private float per=86.06f;

    void display()
    {
       System.out.println("Student rollno is="+rollno);
       System.out.println("Student name is="+name);
       System.out.println("Student percentage is="+per);
    }
    public static void main (String args[] )
    {
       stud s=new stud();
       s.display();
    }
}
