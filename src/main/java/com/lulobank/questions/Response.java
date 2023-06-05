package com.lulobank.questions;

import io.restassured.path.json.JsonPath;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Response  {
  public static Question<Integer> getStatusCode(){
    return Question.about("Status code").answeredBy(actor -> SerenityRest.lastResponse().statusCode());

  }
  public static Question<String> getNameEmployee(){
    return Question.about("Status code").answeredBy(actor -> JsonPath.from(SerenityRest.lastResponse().body().asString()).get("data.employee_name").toString());

  }

  public static Question<String> getStatus(){
    return Question.about("Get message").answeredBy(actor -> JsonPath.from(SerenityRest.lastResponse().body().asString()).get("status").toString());

  }
}
