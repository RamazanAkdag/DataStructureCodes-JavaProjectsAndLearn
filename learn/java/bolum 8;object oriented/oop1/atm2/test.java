public class test{
    public static void main(String[] args){
        hesap s1 = new hesap("ramazan akdag","12345",1000.0);
        login login = new login();
        login.log(s1);
        atm atm1 = new atm();
        atm1.atm(s1);
        


    }
}