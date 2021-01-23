package homework;
/**
*@author 作者: 林宇涵 学号:831903309 (就是经常跑到你宿舍问问题的那个嘻嘻嘻，多谢zmgg!zmggyyds!!!)
*@version 创建时间: 2020年12月23日 下午9:49:43
*@declaration 类说明: 此类为主测试类，整合了多个功能类的作用，整个Maven Project的运行从此类开始。
*/
import java.util.Properties;
import java.sql.*;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;

public class Test {

	public static void main(String[] args) throws IOException, SQLException, InterruptedException {
		ThreadsToGetJSON threads[] = new ThreadsToGetJSON[4];
		threads[0] = new ThreadsToGetJSON("China", 0);
		threads[1] = new ThreadsToGetJSON("US", 1);
		threads[2] = new ThreadsToGetJSON("Japan", 2);
		threads[3] = new ThreadsToGetJSON("United%20Kingdom", 3);
		String json_China = "";
		String json_US = "";
		String json_Japan = "";
		String json_UK = "";
		for (int i = 0; i <= 3; i++) {
			threads[i].start();

		}
		for (Thread i : threads) {
			i.join(); // 让其他四个线程先运行，让出运行池
		}
		json_China = ThreadsToGetJSON.jsons[0];
		json_US = ThreadsToGetJSON.jsons[1];
		json_Japan = ThreadsToGetJSON.jsons[2];
		json_UK = ThreadsToGetJSON.jsons[3];
		Statement st = null;
		Connection con = null;
		ResultSet resC = null;
		ResultSet resA = null;
		try {
			try {
				Properties p = new Properties(); // 使用properties配置文件来提供数据库的用户名，IP地址，密码，端口。
				FileInputStream in = new FileInputStream("src\\set.properties");// 创建一个FileInputStream来获取.properties配置文件的数据库信息。
				p.load(in);// 将FileInputStream载入Properties对象。
				in.close();// 用完就关闭io流
				Class.forName("com.mysql.cj.jdbc.Driver");// 注册MySQL的jdbc驱动
				String url = "jdbc:mysql://" + p.getProperty("ip", "127.0.0.1") + ":"
						+ p.getProperty("port_Of_MySQL", "3306") + "/" + p.getProperty("databaseNameOfMySQL")
						+ "?serverTimezone=UTC"; // 从properties文件获取数据库IP地址，端口和数据库名
				String username = p.getProperty("username", "root"); // 从properties文件获得数据库的用户名
				String password = p.getProperty("password_Of_MySQL");// 从properties文件获得用户的MySQL密码。
				con = DriverManager.getConnection(url, username, password);// 取得数据库的连接
			} catch (Exception e) {
				System.out.println("程序无法连接MySQL数据库，请在src文件夹下的 set.properties 文件中，写下正确配置。");// 若程序的MySQL连接出错，则抛出异常请求用户在set.properties中写入正确的配置。
			}
			st = con.createStatement();
			CreateTable.createTable(st);
			Scanner sc = new Scanner(System.in);
			System.out.println("查询中国，请输入 1 ， 查询美国，请输入2 ， 查询日本，请输入3 ， 查询英国，请输入4，\n可同时输入多个数字来查询多个国家的情况，但是数字之间不要换行哦:");// 让用户从console输入要查询的国家。
			String feedback = sc.nextLine();// 获取用户的输入，了解用户想要查询的国家。
			sc.close();

			Insert_Into_MySQL.addToDatabase(json_China, con);
			Insert_Into_MySQL.addToDatabase(json_US, con);
			Insert_Into_MySQL.addToDatabase(json_Japan, con);
			Insert_Into_MySQL.addToDatabase(json_UK, con);

			System.out.println(
					"***************************************************TESTING__START***************************************************************************************************************\n\n");
			String sql = "select * from Situation_of_Countries where "; // 从记录国家总体情况的表中选出所有记录。
			if (feedback.contains("1")) { // 若用户返回的想查询的国家有中国，则添加中国
				sql += " or country=\'China\' ";
			}
			if (feedback.contains("2")) {
				sql += " or country=\'US\' ";// 若用户返回的想查询的国家有美国，则添加美国
			}
			if (feedback.contains("3")) {
				sql += " or country=\'Japan\' ";// 若用户返回的想查询的国家有日本，则添加日本
			}
			if (feedback.contains("4")) {
				sql += " or country=\'United Kingdom\' ";// 若用户返回的想查询的国家有英国，则添加英国
			}
			sql += ";";
			sql = sql.replaceFirst("or", "");// 由于sql语句中，上面的方法在每一个country=''前都加了or,故应当删除第一个or来保证sql语法正确,来得到正确的sql语句。
			resC = st.executeQuery(sql);// 将记录返回到ResultSet类型中
			System.out.println("国家整体情况:");
			System.out.println();
			while (resC.next()) {// 引出ResultSet里面的记录
				System.out.println("Country: " + resC.getString(1) + "   ; confirmed: " + resC.getInt(2)
						+ "  ; recovered: " + resC.getInt(3) + "  ;  deaths: " + resC.getInt(4) + ";   population: "
						+ resC.getInt(5) + ";  sq_km_area: " + resC.getInt(6) + ";  life_expectancy: "
						+ resC.getString(7) + ";   elevation_in_meters: " + resC.getString(8) + ";   continent: "
						+ resC.getString(9) + ";   abbreviation: " + resC.getString(10) + ";   location: "
						+ resC.getString(11) + ";   iso: " + resC.getInt(12) + ";  capital_city: "
						+ resC.getString(13));
			}
			resC.close();
			System.out.println("\n\n各个地区情况:\n");// 开始印出每个地区分别的情况。
			sql = "select * from Situation_of_Areas where ";
			if (feedback.contains("1")) { // 若用户返回的想查询的国家有中国，则添加中国
				sql += " or  nation=\'China\' ";
			}
			if (feedback.contains("2")) {
				sql += " or  nation=\'US\' ";// 若用户返回的想查询的国家有美国，则添加美国
			}
			if (feedback.contains("3")) {
				sql += " or  nation=\'Japan\' ";// 若用户返回的想查询的国家有日本，则添加日本
			}
			if (feedback.contains("4")) {
				sql += " or  nation=\'United Kingdom\' ";// 若用户返回的想查询的国家有英国，则添加英国
			}
			sql += ";";
			sql = sql.replaceFirst("or", "");// 由于sql语句中，上面的方法在每一个country=''前都加了or,故应当删除第一个or来保证sql语法正确,来得到正确的sql语句。
			resA = st.executeQuery(sql);
			while (resA.next()) {// 引出ResultSet里面的记录
				System.out.println("Name_Of_Area: " + resA.getString(8) + ";  Nation: " + resA.getString(1)
						+ "   ; confirmed:" + resA.getInt(4) + "  ; recovered: " + resA.getInt(5) + "  ;  deaths: "
						+ resA.getInt(6) + ";   lat: " + resA.getString(2) + ";  long: " + resA.getString(3)
						+ ";  Update_Time: " + resA.getString(7));
			}
			System.out.println(
					"\n\n***************************************************TESTING__FINISHED**********************************************************************************************************");
		} catch (Exception e) {
			e.printStackTrace();
		}
		st.close();
		con.close();
		resA.close();

	}

}
