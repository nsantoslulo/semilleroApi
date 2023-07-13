@services
  Feature: Make request to a services Get-Post-Delete

@GetLimitsOfCats
Scenario: Make request to method Get for consult limits of cats
  Given I make to connection to api
  When Execute the method GET with the resource api "images/search?limit="
  Then See that the is returned 200

@GetBreedOfCats
Scenario: Make request to method Get for consult an breeds of cats
  Given I make to connection to api
  When Execute the method GET with the resource api "images/search?breed_ids="
 Then See that the is returned 200


@GetSizeOfCats
Scenario: Make request to method Get for consult an size of cats
  Given I make to connection to api
  When Execute the method GET with the resource api "images/search?size="
  Then See that the is returned 200

@PostAddNewFavAndDelete
Scenario: Make request to method POST for add new fav
  Given I make to connection to api
  When Execute the method "POST" with the resource api "favourites"
  And See that the is returned 200
  Then Execute the method DELETE with the resource api "favourites/"
