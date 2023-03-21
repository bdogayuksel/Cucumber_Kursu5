package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;

public class Hooks {


    @After
    public void after(){//her senaryo sonrası default çalışır

        System.out.println("bitti");
        GWD.quitDriver();
    }


}
