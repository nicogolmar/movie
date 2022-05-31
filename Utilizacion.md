# movie App

#La App Administration Movie esta subida a Heroku con DB PostgresSql
#Para poder utilizar y verificar las funcionalidades sin poseer frontend, deberan tener postman en su sistema.
y crear los siguuientes request

  ---------------------Las siguientes peticiones estan habilitadas para acceso sin tener un usuario---------------------
#Buscar Todos los registros HEROKU :
  *Creando Una request GET con la siguiente url : https://administration-movies.herokuapp.com/api/movies
 
  #Registrarse como usuario : 
     *Creando Una request POST con la siguiente url: https://administration-movies.herokuapp.com/api/auth/register
     
  #Logearse como usuario : 
     *Creando Una request POST con la siguiente url:https://administration-movies.herokuapp.com/api/auth/login
  
  
  -------------------Las siguientes peticiones solo estan habilitadas para acceso con usuario---------------------
 #Eliminar un registro por ID HEROKU :
    *Creando Una request DELETE con la siguiente url :https://administration-movies.herokuapp.com/api/movieDelete/ID
 
 #Actualizar un registro HEROKU
  *Creando Una request PUT con la siguiente url :https://administration-movies.herokuapp.com/api/movie/update
  
  #Crear un registro HEROKU :
  *Creando Una request POST con la siguiente url :https://administration-movies.herokuapp.com/api/movie/create
  
  ** Una vez realizado el usuario deberan hacer login y se les generara un jwt , ese token debera ser copiado 
  y utilizado en la peticion que se desee desde la pestaña authorization , en type seleccionar Bearer token y a la derecha
  pegar el token antes generado y se podra realizar las peticiones 
