package org.javapayan;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuref {

	public static void main(String[] args) {

		Response response = RestAssured.given().baseUri("https://warnyjp31.atlassian.net")
				.header("Content-Type", "application/json").auth().preemptive()
				.basic("warnyjp31@gmail.com", "bF9OUt6zKxeMFQ4tSVJr5CF6")
				.body("{\r\n" + "    \"fields\": {\r\n" + "       \"project\":\r\n" + "       {\r\n"
						+ "          \"key\": \"AM\"\r\n" + "       },\r\n"
						+ "       \"summary\": \"Always do right. This will gratify some people and astonish the REST.\",\r\n"
						+ "       \"description\": \"Creating an issue while setting custom field values\",\r\n"
						+ "       \"issuetype\": {\r\n" + "          \"name\": \"Bug\"\r\n" + "       }\r\n"
						+ "   }\r\n" + "}")
				.when().post("/rest/api/2/issue/");
		String asString = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		System.out.println(asString);

	}
}
