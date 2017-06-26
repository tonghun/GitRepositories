package dao.jdbcTemplate01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory factory = new ClassPathXmlApplicationContext("JdbcTemplate01.xml");
		JdbcTemplate template = (JdbcTemplate) factory.getBean("jdbcTemplate");
		String sql = "insert into tb_books(name,price,bookCount,author) values('JdbcTemplate',200,200,'зїеп')";
		template.update(sql);
		
		// DriverManagerDataSource dataSource=null;
		// dataSource.getJdbcTemplate();
	}

}
