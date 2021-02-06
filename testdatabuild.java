package Resources;

import java.util.ArrayList;
import java.util.List;

import Pojo.AddPlace;

public class testdatabuild {
	
	public AddPlace Addplacepayload(String Name,String Phonenumber,String Address)
	{
		Pojo.AddPlace P= new Pojo.AddPlace();
		P.setAccuracy(50);
		P.setName(Name);
		P.setPhone_number(Phonenumber);
		P.setAddress(Address);
		P.setWebsite("http://rahulshettyacademy.com");
		P.setLanguage("French-IN");
		List<String> type =new ArrayList<String>();
		type.add("shoe park");
		type.add("shop");
		P.setTypes(type);		
		Pojo.Location L= new Pojo.Location();
		L.setLat(-38.383494);
		L.setLng(33.427362);		
		P.setLocation(L);
		return P;
	}

}
