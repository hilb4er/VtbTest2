package api_test;


import static io.restassured.RestAssured.get;

import groovy.json.JsonParser;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class api {

    @Test()
    public void getTest() throws JSONException, IOException {
        Response response = get("http://kn-ktapp.herokuapp.com/apitest/accounts/12345678");
        JSONObject jsonResponse = new JSONObject(response.asString());
        HashMap<String,String> obj = new HashMap<String, String>();
        obj.put(jsonResponse.getString("closing_date"), "closing_date");
        //вот тут нужно использовать readObject для десериализации
        //не понятно как передать в ObjectInputStream не данные файла,а данные из запроса Get
      //  ObjectInputStream in = new ObjectInputStream(jsonResponse.);

        String closing_date = String.valueOf(jsonResponse.getString("account_id"));
        System.out.println(closing_date);
      //  Assert.assertEquals(capital, "Moscow");
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