package student;
public class StudentInfo{
        public int rollno;
        public String name;
        public void accept(int r, String n)
        {
                rollno=r;
                name=n;
              
        }
        public void display()
        {
                System.out.println("roll no:\t"+rollno);
                System.out.println("Name:\t"+name);

        }
}
