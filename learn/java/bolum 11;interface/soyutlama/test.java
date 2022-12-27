
public class test{
    public static void main(String[] args) {
        user s1 = new user(43848, "ramazan", 17);
        signUpManager ramo = new signUpManager(new complexUserCheckService());


        ramo.signUp(s1);    
    }
}