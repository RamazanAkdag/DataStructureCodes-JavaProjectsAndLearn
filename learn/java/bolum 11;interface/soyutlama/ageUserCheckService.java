public class ageUserCheckService implements IuserCheckService{

    @Override
    public boolean checkUser(user user) {
       if(user.getAge() >= 18){
           return true;
       }
        return false;
    }


    
}