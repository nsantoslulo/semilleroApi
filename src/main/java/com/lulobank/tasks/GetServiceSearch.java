package com.lulobank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

import static com.lulobank.factory.InformationOfCats.BREED_IDS;
import static com.lulobank.factory.InformationOfCats.SIZE;
import static com.lulobank.factory.InformationOfCats.limit;
import static net.serenitybdd.rest.SerenityRest.given;


public class GetServiceSearch implements Task {
  private String resourceApi;

  public GetServiceSearch(String resourceApi){
    this.resourceApi = resourceApi;
  }

  @Step("{0}consume get method")
  @Override
  public <T extends Actor> void performAs(T actor) {

    switch (resourceApi) {
      case "images/search?limit=":
        given()
            .and().when().get(resourceApi + limit)
            .then().extract().response();
        break;
      case "images/search?breed_ids=":
        given()
            .and().when().get(resourceApi + BREED_IDS)
            .then().extract().response();
        break;
      case "images/search?size=":
        given()
            .and().when().get(resourceApi +SIZE)
            .then().extract().response();
        break;
      default:
        given()
            .and().when().get(resourceApi)
            .then().extract().response();
        break;
    }
  }
  public static GetServiceSearch executeGetMethodWithThe(String resourceApi){
    return Tasks.instrumented(GetServiceSearch.class, resourceApi);

  }
}
