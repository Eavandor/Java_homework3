package homework;
/**
*@author ����: ���  ѧ��:831903309 (���Ǿ����ܵ���������������Ǹ�����������лzmgg!zmggyyds!!!)
*@version ����ʱ��: 2020��12��23�� ����9:49:43
*@declaration ��˵��: ����������MySQL���ݿ��д�����Ӧ���
*/
import java.sql.*;
public class CreateTable {
public static void createTable(Statement st) {
	try {
	String sql = "drop table if exists Situation_of_Countries;";//���˱��Ѵ��ڣ���ɾ����
	st.executeUpdate(sql);
	sql = "create table Situation_of_Countries(country varchar(15),confirmed int,recovered int, deaths int,population int,sq_km_area int,life_expectancy varchar(20),elevation_in_meters varchar(20),continent varchar(20),abbreviation varchar(10),location varchar(20),iso int,capital_city varchar(20));";//������¼��������ı�
	st.executeUpdate(sql);
	sql = "drop table if exists Situation_of_Areas;";//���Ѵ��ڣ���ɾ��ͬ�����Ϊ֮�󴴽��µı���׼��
	st.executeUpdate(sql);
	sql = "create table Situation_of_Areas(nation varchar(20),lat varchar(20),length varchar(20),confirmed int,recovered int,deaths int,updateTime varchar(40),nameOfArea varchar(40));";//�����洢�����и��������������
	st.executeUpdate(sql);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
