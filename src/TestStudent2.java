public class TestStudent2 {
    public static void main(String[] args) {
       ClassRoom cl = new ClassRoom();
       Student2 st=new Student2(17,"Minh Duong",cl);
       System.out.println("Ho va ten: "+st.getName());
       System.out.println("Ma Sinh Vien: "+st.getRollNo());
       System.out.println("Ma Lop: "+st.myClass.getClassID());
       System.out.println("Ten Lop: "+st.myClass.getClassName());
    }
}
