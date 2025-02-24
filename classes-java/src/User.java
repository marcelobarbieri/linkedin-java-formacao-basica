public class User {

    public User() { }

    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String username;
    public String password;
    public String email;
    public boolean active;
    
    public static final int LIMIT_CARAC = 10;

    public boolean isActive(){
        return active;
    }

    public static int getLimitCarac(){
        return LIMIT_CARAC;
    }
}
