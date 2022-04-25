public class Student2 {
    int rollNo;
    String name;
    ClassRoom myClass;

    public Student2(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    public  Student2(int rollNo,String name,ClassRoom myClass){
        this.name=name;
        this.rollNo=rollNo;
        this.myClass=myClass;
    }

    int getRollNo(){
        return rollNo;}
    String getName(){
        return name;
    }
    ClassRoom getMyClass(){
        return  myClass;
    }

}
