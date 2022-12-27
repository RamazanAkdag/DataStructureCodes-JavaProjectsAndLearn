import java.util.Scanner;

public class signUpManager{
    private IuserCheckService iuserCheckService;
    Scanner scanner = new Scanner(System.in);
    public signUpManager(IuserCheckService iuserCheckService) {
        this.iuserCheckService = iuserCheckService;
    }

    public void signUp(user user){
        if(iuserCheckService.checkUser(user)){
            System.out.println("kayıt oldu...");
        }else{
            System.out.println("kayıt olamadı...");
        }
    }
   
    public boolean bilgiler_kontrol(user user){
        while(true){
            System.out.println("adınızı giriniz");
            String isim = scanner.nextLine();
            System.out.println("yasınızı giriniz...");
            int yas = scanner.nextInt();
            System.out.println("id nizi giriniz...");
            int id = scanner.nextInt();
            if(isim.equals(user.getName()) || yas == user.getAge() || id == user.getId() ){
                System.out.println("bilgiler dogru...Hosgeldiniz");
                return true;
            }
            else{
                System.out.println("bilgilerinizde yanlıslık var tekrar deneyiniz...");
            }
         }
    }
    
   
}