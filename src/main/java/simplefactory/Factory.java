package simplefactory;

public class Factory {

    public static Api getApi(String condition){
        Api api = null;
        if(condition == "" || condition == null){
            return api;
        }else if(condition.equals("1")){
            api = new ApiImplA();
        }else{
            api = new ApiImplB();
        }
        return api;
    }
}
