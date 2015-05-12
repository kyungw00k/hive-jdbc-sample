import java.sql.DriverManager

// Load Hive JDBC Driver
Class.forName( "org.apache.hive.jdbc.HiveDriver" );

// Configure JDBC connection
connection = DriverManager.getConnection( "jdbc:hive2://localhost:10000/default", "hive", "" );

statement = connection.createStatement();

resultSet = statement.executeQuery( "show tables");

while ( resultSet.next() ) {
    System.out.println(
            resultSet.getString( 1 )
    );
}

resultSet.close();
statement.close();
connection.close();
