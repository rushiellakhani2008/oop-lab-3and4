package lab3;

public class Course {

        public String code;
        public String name;
        public int crdhrs;

        Course(String code,String name, int chrs){
            this.code=code;
            this.name=name;
            this.crdhrs=chrs;
        }

        void display(){
            System.out.println("code: "+code);
            System.out.println("Name: "+name);
            System.out.println("Crhrs: "+crdhrs);
        }

        static void main(String[] args) {
            Course m2=new Course("CS2002","PF",3);
            Course m3=new Course("SSL1562","PF_LAB",1);
            Course m4=new Course("SS1208","Calculus",3);
            Course m5=new Course("AP2044","DlD",2);
            m2.display();
            m3.display();
            m4.display();
            m5.display();
        }
    }
