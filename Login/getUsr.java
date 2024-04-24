package Login;
import java.io.*;
import java.util.Scanner;
public class getUsr {
    public String userName;
    public String password;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString(){
        return "[USER: "+userName+","+" PASSWORD: "+password+"]";
    }
    // public static void main(String[] args) {
        public void LoginUserItself(){
        Scanner sc=new Scanner(System.in);
        getUsr gt=new getUsr();
        System.out.println("******************************");
        System.out.println("User Registration!");
        System.out.println("******************************");
        System.out.println("Set the UserName: ");
        String usr=sc.nextLine();
        gt.setUserName(usr);
        System.out.println("Set Password!");
        String pswd=sc.nextLine();
        gt.setPassword(pswd);
        try{
        //Write on file
        File dir=new File("SaveDetail");
        dir.mkdir();
        File file=new File(dir,"info.txt");
        file.createNewFile();
        PrintWriter pw=new PrintWriter(file);
        pw.println("USerName: "+usr);
        pw.println("Password: "+pswd);
        pw.flush();
        pw.close();
    }catch(IOException e){
        System.out.println(e);
    }
        System.out.println("******************************");
        System.out.println("User Login!");
        System.out.println("******************************");
        try{
        String userN=gt.getUserName();
        String passwrd=gt.getPassword();
        System.out.println(gt.toString());
        System.out.print("User Name:\t");
        String loginUser=sc.nextLine();
        System.out.print("Password:\t");
        String loginPass=sc.nextLine();
        if(loginUser.equals(userN) && loginPass.equals(passwrd)){
            System.out.println("Login Succussful!");
        }else{
            System.out.println("Incorrect Username OR Password!");
        }

    }catch(Exception e){
        System.out.println(e);
    }
}
}
