package com.lulobank.utils.Constants;

public enum ApiPathTheCatServices {
  // preguntar es necesario se pone el = como el postman
  LIMIT_OF_IMAGES("limit="),
  CATS_WITH_BREEDS("has_breeds="),
  CAT_BREED("breed_ids=");
  ApiPathTheCatServices(String s) {
  }
}
