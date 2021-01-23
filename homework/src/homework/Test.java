package homework;
/**
*@author ����: ��� ѧ��:831903309 (���Ǿ����ܵ���������������Ǹ�����������лzmgg!zmggyyds!!!)
*@version ����ʱ��: 2020��12��23�� ����9:49:43
*@declaration ��˵��: ����Ϊ�������࣬�����˶������������ã�����Maven Project�����дӴ��࿪ʼ��
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
			i.join(); // �������ĸ��߳������У��ó����г�
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
				Properties p = new Properties(); // ʹ��properties�����ļ����ṩ���ݿ���û�����IP��ַ�����룬�˿ڡ�
				FileInputStream in = new FileInputStream("src\\set.properties");// ����һ��FileInputStream����ȡ.properties�����ļ������ݿ���Ϣ��
				p.load(in);// ��FileInputStream����Properties����
				in.close();// ����͹ر�io��
				Class.forName("com.mysql.cj.jdbc.Driver");// ע��MySQL��jdbc����
				String url = "jdbc:mysql://" + p.getProperty("ip", "127.0.0.1") + ":"
						+ p.getProperty("port_Of_MySQL", "3306") + "/" + p.getProperty("databaseNameOfMySQL")
						+ "?serverTimezone=UTC"; // ��properties�ļ���ȡ���ݿ�IP��ַ���˿ں����ݿ���
				String username = p.getProperty("username", "root"); // ��properties�ļ�������ݿ���û���
				String password = p.getProperty("password_Of_MySQL");// ��properties�ļ�����û���MySQL���롣
				con = DriverManager.getConnection(url, username, password);// ȡ�����ݿ������
			} catch (Exception e) {
				System.out.println("�����޷�����MySQL���ݿ⣬����src�ļ����µ� set.properties �ļ��У�д����ȷ���á�");// �������MySQL���ӳ������׳��쳣�����û���set.properties��д����ȷ�����á�
			}
			st = con.createStatement();
			CreateTable.createTable(st);
			Scanner sc = new Scanner(System.in);
			System.out.println("��ѯ�й��������� 1 �� ��ѯ������������2 �� ��ѯ�ձ���������3 �� ��ѯӢ����������4��\n��ͬʱ��������������ѯ������ҵ��������������֮�䲻Ҫ����Ŷ:");// ���û���console����Ҫ��ѯ�Ĺ��ҡ�
			String feedback = sc.nextLine();// ��ȡ�û������룬�˽��û���Ҫ��ѯ�Ĺ��ҡ�
			sc.close();

			Insert_Into_MySQL.addToDatabase(json_China, con);
			Insert_Into_MySQL.addToDatabase(json_US, con);
			Insert_Into_MySQL.addToDatabase(json_Japan, con);
			Insert_Into_MySQL.addToDatabase(json_UK, con);

			System.out.println(
					"***************************************************TESTING__START***************************************************************************************************************\n\n");
			String sql = "select * from Situation_of_Countries where "; // �Ӽ�¼������������ı���ѡ�����м�¼��
			if (feedback.contains("1")) { // ���û����ص����ѯ�Ĺ������й���������й�
				sql += " or country=\'China\' ";
			}
			if (feedback.contains("2")) {
				sql += " or country=\'US\' ";// ���û����ص����ѯ�Ĺ��������������������
			}
			if (feedback.contains("3")) {
				sql += " or country=\'Japan\' ";// ���û����ص����ѯ�Ĺ������ձ���������ձ�
			}
			if (feedback.contains("4")) {
				sql += " or country=\'United Kingdom\' ";// ���û����ص����ѯ�Ĺ�����Ӣ���������Ӣ��
			}
			sql += ";";
			sql = sql.replaceFirst("or", "");// ����sql����У�����ķ�����ÿһ��country=''ǰ������or,��Ӧ��ɾ����һ��or����֤sql�﷨��ȷ,���õ���ȷ��sql��䡣
			resC = st.executeQuery(sql);// ����¼���ص�ResultSet������
			System.out.println("�����������:");
			System.out.println();
			while (resC.next()) {// ����ResultSet����ļ�¼
				System.out.println("Country: " + resC.getString(1) + "   ; confirmed: " + resC.getInt(2)
						+ "  ; recovered: " + resC.getInt(3) + "  ;  deaths: " + resC.getInt(4) + ";   population: "
						+ resC.getInt(5) + ";  sq_km_area: " + resC.getInt(6) + ";  life_expectancy: "
						+ resC.getString(7) + ";   elevation_in_meters: " + resC.getString(8) + ";   continent: "
						+ resC.getString(9) + ";   abbreviation: " + resC.getString(10) + ";   location: "
						+ resC.getString(11) + ";   iso: " + resC.getInt(12) + ";  capital_city: "
						+ resC.getString(13));
			}
			resC.close();
			System.out.println("\n\n�����������:\n");// ��ʼӡ��ÿ�������ֱ�������
			sql = "select * from Situation_of_Areas where ";
			if (feedback.contains("1")) { // ���û����ص����ѯ�Ĺ������й���������й�
				sql += " or  nation=\'China\' ";
			}
			if (feedback.contains("2")) {
				sql += " or  nation=\'US\' ";// ���û����ص����ѯ�Ĺ��������������������
			}
			if (feedback.contains("3")) {
				sql += " or  nation=\'Japan\' ";// ���û����ص����ѯ�Ĺ������ձ���������ձ�
			}
			if (feedback.contains("4")) {
				sql += " or  nation=\'United Kingdom\' ";// ���û����ص����ѯ�Ĺ�����Ӣ���������Ӣ��
			}
			sql += ";";
			sql = sql.replaceFirst("or", "");// ����sql����У�����ķ�����ÿһ��country=''ǰ������or,��Ӧ��ɾ����һ��or����֤sql�﷨��ȷ,���õ���ȷ��sql��䡣
			resA = st.executeQuery(sql);
			while (resA.next()) {// ����ResultSet����ļ�¼
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
