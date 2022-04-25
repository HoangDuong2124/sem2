public class TestClassRoom {
    public static void main(String[] args) {
        ClassRoom cl =new ClassRoom();
        System.out.println("ClassID is: "+cl.getClassID());
        System.out.println("ClassName is: "+cl.getClassName());
        System.out.println(cl);
        cl.setClassID(16);
        System.out.println("ClassID is: "+cl.getClassID());
        cl.setClassName("T2109M");


        ClassRoom cl2=new ClassRoom(2,"T2108A");
        System.out.println("ClassID is: "+cl2.getClassID());
        System.out.println("ClassName is: "+cl2.getClassName());
        System.out.println(cl2);
    }
}
