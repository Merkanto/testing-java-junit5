package merkanto.testingjavajunit5.petclininc.controllers;

public class IndexController {

    public String index(){

        return "index";
    }

    public String oopsHandler(){
        throw new ValueNotFoundException();
    }
}
