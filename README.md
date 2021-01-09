# diccionarioChileno

Código de ejemplo para el uso de JEE, DAO y CRUD.

## Guía de inicio rápido

1. Crea una base de datos en Oracle 11g

```sql
create user palabras identified by tuclave;
grant connect, resource, dba to palabras;
```
2. Crea la tabla palabras

```sql
create table palabras ( 
    pal_id          number(5) primary key,
    pal_nombre      varchar(50) not null,
    pal_significado varchar(500),
    pal_referencia  varchar(500));
```

3. Actualiza los datos de conexión en cl.awakelab.model.dao.Conexion.java

```java
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String usr = "palabras";
String psw = "tuClave";

Class.forName("oracle.jdbc.driver.OracleDriver");
con = DriverManager.getConnection(url, usr, psw);
```

4. Ejecuta el servlet Inicio.java.
