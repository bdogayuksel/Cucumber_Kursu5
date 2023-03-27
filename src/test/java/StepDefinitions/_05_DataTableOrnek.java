package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _05_DataTableOrnek {

    @When("Write a username {string}")
    public void writeAUsername(String userName) {
        System.out.println("userName = " + userName);
    }

    @And("Write username and password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String userName, String password) {
        System.out.println("userName  = " + userName + " "+password);
    }

    @And("Write a username as DataTable")//tek boyutlu verilen itemleri liste haline getirdik
    public void writeAUsernameAsDataTable(DataTable items) {
       List<String> itemList =items.asList(String.class);

        for (String e:itemList) {
            System.out.println("e = " + e);
        }

    }

    @And("Write a username and password as DataTable")//2 boyutlu itemlerin listesi(id ve password)
    public void writeAUsernameAndPasswordAsDataTable(DataTable items) {
        List<List<String>> listOfLists= items.asLists(String.class);

        for (int i= 0; i <listOfLists.size() ; i++) {
            //listOfLists.get(i).get(0) ilk kolonu(idleri)
            //listOfLists.get(i).get(1) ikinci kolonu(password u getiriyor)
            System.out.println("listOfLists = " + listOfLists.get(i).get(0)+ " "+
                    listOfLists.get(i).get(1));
        }
    }


}
