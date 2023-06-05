package com.lulobank.utils.path;

import static com.lulobank.utils.Constants.ApiPathTheCatServices.CATS_WITH_BREEDS;
import static com.lulobank.utils.Constants.ApiPathTheCatServices.CAT_BREED;
import static com.lulobank.utils.Constants.ApiPathTheCatServices.LIMIT_OF_IMAGES;

public class theApiCatServices {

  public enum theApiCatEnpoints {
    SEARCH_IMAGES("v1/images/search"),
    SEARCH_CATS_BY_BREED(String.format("v1/images/search?",CAT_BREED)),
    SEARCH_HAS_BREEDS(String.format("v1/images/search?",CATS_WITH_BREEDS)),
    SEARCH_NUMBER_OF_IMAGANES(String.format("v1/images/search?format=json",LIMIT_OF_IMAGES));

    theApiCatEnpoints(String s) {
    }
  }
}
