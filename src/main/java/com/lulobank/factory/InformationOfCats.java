package com.lulobank.factory;

import com.github.javafaker.Faker;
import java.util.Arrays;
import java.util.List;

public class InformationOfCats {

  private static final Faker FAKER = new Faker();
  public static final String  limit = String.valueOf(FAKER.random().nextInt(1,20));
  static List<String> LIST_ID_BREED = Arrays.asList("amau", "hima", "mcoo","beng","munc","tonk","bali","manx","pixi","emau","hbro",
      "rblu","char","abys","jbob","acur","ragd","tang","snow","chee","soma","toyg","nebe","pers","sibe","esho","chau","abob",
      "amis","sing","norw","csho","bsho","crex","orie","sfol","siam","sphy","tvan","ycho","awir","aege","birm","bamb","java","orie");
  public static final String BREED_IDS = LIST_ID_BREED.get(FAKER.random().nextInt(1,43));
  static List<String> LIST_SIZE = Arrays.asList("full", "small", "med","thumb");
  public static final String SIZE = LIST_SIZE.get(FAKER.random().nextInt(1,4));
  public static final String IDS_FAV = String.valueOf(FAKER.idNumber().valid());



}
