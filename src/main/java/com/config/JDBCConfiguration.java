package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JDBCConfiguration {

	@Bean
	public static Connection getConnection() {

		Connection connection = null;
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sonar?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "eseo";
		String password = "eseo";
		try {
			Class.forName(dbDriver);
            if(connection == null) {
            	connection = DriverManager.getConnection(url, user, password);
            }
		} catch (ClassNotFoundException e) {
			System.out.println("Erreur pendant la récupération du driver (" + dbDriver + ")" + e);
			e.printStackTrace();
		} catch (SQLException e1) {
			System.out.println("Erreur pendant la creation de la connexion à la BDD." + e1);
			e1.printStackTrace();
		}
		return connection;
	}
}
