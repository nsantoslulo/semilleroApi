package com.lulobank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import static com.lulobank.factory.InformationOfCats.IDS_FAV;
import static net.serenitybdd.rest.SerenityRest.given;


public class DeleteApiCat implements Task {
  private final String resourceApi;
  private final String id;
  public DeleteApiCat(String resourceApi,String id) {

    this.resourceApi = resourceApi;
    this.id = id;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    given()
        .header("x-api-key","live_vSzJQEXdqNlQCodAd84R3KWmnJJ0z3ZdTRXhJCDS2CUruTCv9o1DF157BxvjWIWu")
        .and()
        .when()
        .delete(resourceApi+"/"+id )
        .then()
        .extract()
        .response();
  }
  public static DeleteApiCat executePostMethodWithThe(String resourceApi,String id){
    return Tasks.instrumented(DeleteApiCat.class, resourceApi,id);
  }
}








