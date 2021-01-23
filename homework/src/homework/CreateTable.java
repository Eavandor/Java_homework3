package homework;
/**
*@author 作者: 林宇涵  学号:831903309 (就是经常跑到你宿舍问问题的那个嘻嘻嘻，多谢zmgg!zmggyyds!!!)
*@version 创建时间: 2020年12月23日 下午9:49:43
*@declaration 类说明: 此类用于在MySQL数据库中创建对应表格
*/
import java.sql.*;
public class CreateTable {
public static void createTable(Statement st) {
	try {
	String sql = "drop table if exists Situation_of_Countries;";//若此表已存在，则删除。
	st.executeUpdate(sql);
	sql = "create table Situation_of_Countries(country varchar(15),confirmed int,recovered int, deaths int,population int,sq_km_area int,life_expectancy varchar(20),elevation_in_meters varchar(20),continent varchar(20),abbreviation varchar(10),location varchar(20),iso int,capital_city varchar(20));";//创建记录国家情况的表
	st.executeUpdate(sql);
	sql = "drop table if exists Situation_of_Areas;";//若已存在，则删除同名表格，为之后创建新的表做准备
	st.executeUpdate(sql);
	sql = "create table Situation_of_Areas(nation varchar(20),lat varchar(20),length varchar(20),confirmed int,recovered int,deaths int,updateTime varchar(40),nameOfArea varchar(40));";//创建存储国家中各个地区的情况。
	st.executeUpdate(sql);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
