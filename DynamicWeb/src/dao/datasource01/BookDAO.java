package dao.datasource01;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

/*
 * SQL语句中含有变量的处理方式：
 * 1.变量为字符串时三个引号（内层双引号，外层单引号）+“+”加号；
 * 2.变量为数值类型时：“+arg+”
 */
public class BookDAO implements BookDAOImpl {

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Book book) {
		// TODO Auto-generated method stub
		String name = book.getName();
		double price = book.getPrice();
		int count = book.getCount();
		String author = book.getAuthor();

		// System.out.println("name:" + name);
		// System.out.println("author:" + author);
		Connection conn = null;
		Statement state = null;

		try {
			conn = dataSource.getConnection();
			state = conn.createStatement();
			String sql = "insert into tb_books(name,price,bookCount,author)  values('" + name + "'," + price + ","
					+ count + ",'" + author + "')";
			state.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
