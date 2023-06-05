package com.lulobank.tasks;

import static com.lulobank.factory.GetOptionsOfCats.IDS;
import static net.serenitybdd.rest.RestRequests.given;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import static com.lulobank.factory.GetOptionsOfCats.BREED_IDS;


public class PostService implements Task {
  private String resourceApi;

  public PostService(String resourceApi){
    this.resourceApi=resourceApi;
  }
  @Override
  public <T extends Actor> void performAs(T actor){
    given()
        .header("x-api-key","live_vSzJQEXdqNlQCodAd84R3KWmnJJ0z3ZdTRXhJCDS2CUruTCv9o1DF157BxvjWIWu")
        .body("{\"image_id\":\"" + IDS + "\",\"sub_id\":\"your-user-1234\"}")
        .and().post(resourceApi)
        .then().extract()
        .response();
  }
  public static PostService addNewFavorite(String resourceApi){
    return Tasks.instrumented(PostService.class,resourceApi);
  }

}
