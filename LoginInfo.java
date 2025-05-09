import java.util.*; 

public class LoginInfo{
    // we can use HashMaps for storing the pairs of the usernames and its passwords
    // Private fields: 
    private HashMap<String, String> info = new HashMap<String, String>(); 
    boolean isTeacher; 
    LoginInfo(){
        info.put("24","24"); 
        info.put("studentLog","ntcs2023"); 
        info.put("teacherLog","ntcsForEver"); 
        info.put("alumniLog" ,"ntcs2023"); 
        info.put("torchEditLog","ntcsEditor126"); 
        info.put("authourLog","ntcsAuth2773"); 
        // student, teacher, torch editor, authours, alumni 
        if (info.containsValue("ntcsForEver") == true || info.containsValue("ntcsEditor126") == true || info.containsValue("ntcsAuth2773") == true){
            isTeacher = true; 
        }else{
            isTeacher = false; 
        }
    }
    
    public Boolean isTeacher(){
        return isTeacher; 
    }
    
    protected HashMap getInfo(){ // these has the info of the passwrds so it should be protected
        return info; 
    }
}

