package api_test;

import static io.restassured.RestAssured.get;

import org.json.JSONException;
import org.testng.Assert;
import org.junit.Test;

import java.util.*;

public class api {

    @Test()
    public void getTest() throws JSONException {
        dtoAccounts accounts = get("http://kn-ktapp.herokuapp.com/apitest/accounts/12345678")
                .as(dtoAccounts.class);
        Assert.assertNotNull(accounts.getAccount_id(), "ID аккаунта пустое");
        System.out.println(accounts.getAccount_id());
    }

    @Test
    public void getAccountsTest () {
        List<dtoAccounts> accounts = Arrays.asList((get("http://kn-ktapp.herokuapp.com/apitest/accounts")
                .as(dtoAccounts[].class)));
        for (int i = 0 ; i < accounts.size(); i++) {
            Assert.assertNotNull(accounts.get(i).account_id, "ID аккаунта пустое");
            System.out.println(accounts.get(i).account_id);
        }
    }

}









   /*
    @Test()
    public void getRequestExampleTest() throws JSONException {
        Response response = get("http://restcountries.eu/rest/v1/name/russia");
        JSONArray jsonResponse = new JSONArray(response.asString());
        String capital = jsonResponse.getJSONObject(0).getString("capital");
        Assert.assertEquals(capital, "Moscow");
    }
*/
   /*
    @Test
    public void api () throws IOException {

        final Collection<NameValuePair> params = new ArrayList<>();
        final Content getResult = Request.Get("http://kn-ktapp.herokuapp.com/apitest/accounts/12345678")
                .execute().returnContent();
        System.out.println(getResult.asString());
        getResult.getType().getParameter("transactions_total_amount");

        System.out.println();
    }


}
 */