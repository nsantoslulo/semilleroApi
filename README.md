# The Api Cat
Este servicio cuenta con todos los metodos (Post-Delete-Get-Delete), en este servicio se puede realizar la consulta de razas de gatos, se puede filtrar por tamaño y tipo de imagen, adicional cuenta con un sistema de votos y agregar favoritos. 

### Link del servicio:
https://developers.thecatapi.com/view-account/ylX4blBYT9FaoVd6OhvR?report=bOoHBz-8t

### Ejecuón de test
Ejecutar Test mediante tags en el archivo ExecuteService example: tags = "@PostAddNewFav2",

### Información importante 
1. El array "LIST_ID_BREED" almacena todos las razas de los gatos y se almacena en un array para que al ejecutar el método seleccione uno de manera aleatoria y realice la consulta con ese dato.
2. El array  "LIST_SIZE" almacena todos los tamaños de las imegenes y se almacena en un array para que al ejecutar el método seleccione uno de manera aleatoria y realice la consulta con ese dato.
3. La constante "IDS_FAV" crea de manera aleatoria un id para la ejecución del metodo POST. 

