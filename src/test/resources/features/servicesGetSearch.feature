@services
  Feature: Make request to a services get

@GetLimitsOfCats
Scenario: Make request to method Get for consult limits of cats
  Given I make to connection to api
  When Execute the method GET with the resource api "?limit="
  Then See that the is returned 200

@GetBreedOfCats
Scenario: Make request to method Get for consult an breeds of cats
  Given I make to connection to api
  When Execute the method GET with the resource api "?breed_ids="
 Then See that the is returned 200

@GetSizeOfCats
Scenario: Make request to method Get for consult an size of cats
  Given I make to connection to api
  When Execute the method GET with the resource api "?size="
  Then See that the is returned 200



@PostAddNewFav
Scenario: Make request to method POST for consult an size of cats
  Given I make to connection to api
  When Execute the method POST with the resource api "favourites"
  Then See that the is returned 200