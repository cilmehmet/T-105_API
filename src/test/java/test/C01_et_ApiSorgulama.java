package test;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C01_et_ApiSorgulama {

    /*
        https://restful-booker.herokuapp.com/booking/256884 url’ine
        bir GET request gonderdigimizde donen Response’un,
        status code’unun 200,
        ve content type’inin application/json; charset=utf-8,
        ve Server isimli Header’in degerinin Cowboy,
        ve status Line’in HTTP/1.1 200 OK
        ve response suresinin 5 sn’den kisa oldugunu manuel olarak test ediniz.
         */

    // 1 - Gonderecegimiz request icin gerekli olan URL'i ve ihtiyacimiz varsa Body'i hazirliyoruz
    // 2 - Eger soruda bize verilmisse  Expected Data'yi hazirliyoruz
    // 3 - Bize donen Response'i Actual Data olarak kaydet
    // 4 - Expected Data ile Actual datanin karsilastirmasi - Assertion

    @Test
    public void get01 () {

        // 1 - Gonderecegimiz request icin gerekli olan URL'i ve ihtiyacimiz varsa Body'i hazirliyoruz

        String url = "https://restful-booker.herokuapp.com/booking/1547";

        // 2 - Eger soruda bize verilmisse  Expected Data'yi hazirliyoruz
        // 3 - Bize donen Response'i Actual Data olarak kaydet

        Response response = given().when().get(url);
        response.prettyPrint();

        System.out.println("Status Code : " + response.getStatusCode());
        System.out.println("Content Type : " + response.getContentType());
        System.out.println("Server Header'inin degeri : " + response.getHeader("Server"));
        System.out.println("Status Line : " + response.getStatusLine());
        System.out.println("Response Suresi : " + response.getTime());

        // 4 - Expected Data ile Actual datanin karsilastirmasi - Assertion

    }
}