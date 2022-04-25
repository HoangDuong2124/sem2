import java.nio.charset.StandardCharsets;

public class ClassRoom {
     int classID ;
     String className;
     public ClassRoom(){
         classID=1;
         className="T2109A";
     }
     public ClassRoom(int classID, String className){
         this.className=className;
         this.classID=classID;
     }
     int getClassID(){
         return classID;
     }
     String getClassName(){
         return  className;
     }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public void setClassName(String className) {
        this.className = className;
    }
   public String toString(){
         return "ClassID is: " +classID+", ClassName is: "+className;
    }
}
