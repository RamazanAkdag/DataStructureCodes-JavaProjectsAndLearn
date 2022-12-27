public class complexUserCheckService implements IuserCheckService{

    @Override
    public boolean checkUser(user user) {
      if(user.getAge()>= 18 && user.getName().startsWith("ra")){
          return true;
      }
        return false;
    }





}