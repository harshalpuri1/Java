public class OOPS {
    public static void main(String[] args) {
        Pen trimax = new Pen();
        System.out.println(trimax.color);

        Bank sbi = new Bank();
        sbi.setuser("Harshal", "Padfasdlf");
        System.out.println(sbi.getuser());
    }
    
}

class Pen{
    String color = "Red";

    void setColor(String newColor){
        color = newColor;
    }
}   

class Bank {
    public String username;
    private String password;

    void setuser(String name, String pass){
        username = name;
        password = pass;
    }

    String getuser(){
        return this.username;
    }
}