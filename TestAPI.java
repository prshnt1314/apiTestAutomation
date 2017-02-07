package abcd;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
/*
 * {
    "id":334569,
    "name":"Prashant Kumar",
	"permanent":true,
	"address":{
			"street":"#97, 2nd floor",
			"city":"Bangalore",
			"zipcode":"560037"
		},
	"phoneNumber":"1234569789",
	"role":"Autmation Engineer"
}*/
public class TestAPI {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.mocky.io/v2/5898cbce110000e01003");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		ObjectMapper mapper = new ObjectMapper();
		conn.setRequestMethod("GET");
		conn.connect();		
		int responseCode = conn.getResponseCode();
		conn.disconnect();
		if(responseCode==200) {
			InputStream is = url.openStream();
			RootObject rb = mapper.readValue(is, RootObject.class);
			Address address = rb.getAddress();
			System.out.println(address.getCity());
			System.out.println(address.getStreet());
			System.out.println(address.getZipcode());
			System.out.println(rb.getId());
			System.out.println(rb.getName());
			System.out.println(rb.getPermanent());
			System.out.println(rb.getPhoneNumber());
			System.out.println(rb.getRole());
			is.close();
		}
		else {
			System.out.println("url not working");
		}		
		
	}
}

