package lab3;

public class Comp {
    private String id;
    public String processor;
    public int ram;
    public String OS;

    public void set(String id){
        this.id=id;
    }
    public String get(){
        return id;
    }
    Comp(String procesr,int Ram,String OPS){
        processor=procesr;
        ram=Ram;
        OS=OPS;
    }
    void display(){
        System.out.println("Process: "+processor);
        System.out.println("Ram: "+ram);
        System.out.println("OS: "+OS);
    }

    static void main(String[] args) {
        Comp c1=new Comp("i3",12,"Window");
        c1.set("CS1046");
        System.out.println("ID: "+c1.get());
        c1.display();
        Comp c2=new Comp("i6",32,"Linux");
        c1.set("AP0125");
        System.out.println("ID: "+c1.get());
        c2.display();
    }
}
