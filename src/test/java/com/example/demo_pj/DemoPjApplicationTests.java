//package com.example.demo_pj;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import javax.sql.DataSource;
//
//import java.sql.SQLException;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//@SpringBootTest
//class DemoPjApplicationTests {
//
//
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//	@Test
//	void contextLoads() {
//	}
//	@Test
//	void dbUrlH2() throws Exception {
//		String url = jdbcTemplate.getDataSource().getConnection().getMetaData().getURL();
//		System.out.println("Database URL: " + url);
//		assertTrue(url.contains("jdbc:h2"), "Database URL should contain 'jdbc:h2'");
//	}
//
//	@Test
//	void dbUserNameIsSa() throws SQLException {
//		String name = jdbcTemplate.getDataSource().getConnection().getMetaData().getUserName();
//		System.out.println(name);
//		assertTrue(name.contains("SA"), "User name should contain 'sa'");
//
//	}
//}
