package homework;
/**
*@author 作者: 林宇涵 学号:831903309 (就是经常跑到你宿舍问问题的那个嘻嘻嘻，多谢zmgg!zmggyyds!!!)
*@version 创建时间: 2020年12月23日 下午9:49:43
*@declaration 类说明: 此类用于破译JSON中的信息，并插入已创建好的MySQL表格中。
*/
import java.util.Map;
import com.alibaba.fastjson.JSONObject;
import java.sql.*;

public class Insert_Into_MySQL {
	public static void addToDatabase(String JSON_OF_A_Country, Connection con) {
		try {
		PreparedStatement pCountry=con.prepareStatement("insert into Situation_of_Countries values(?,?,?,?,?,?,?,?,?,?,?,?,?);");
		PreparedStatement pArea=con.prepareStatement("insert into Situation_of_Areas values(?,?,?,?,?,?,?,?);");
		//用预编译语句，提高效率，也提高了灵活性，使得不同数据可以多次插入语句运行。
	
		Map<String, JSONObject> map = JSONObject.parseObject(JSON_OF_A_Country, Map.class);
		final String nation = map.get("All").getString("country");  //得到各地区所属的国家名称

		for (String str : map.keySet()) {
			if (map.get(str).size() >= 1) {
				for (String key : map.get(str).keySet()) {
					try {
						if (str.equals("All")) {                       // 如果是All, 表示这是全国总体的情况，插入国家的表格。
							pCountry.setString(1,""+map.get(str).get("country"));  //得到key 为"contry"的对应的值
							pCountry.setInt(2,Integer.parseInt(""+map.get(str).get("confirmed")));
							pCountry.setInt(3,Integer.parseInt(""+map.get(str).get("recovered")));
							pCountry.setInt(4,Integer.parseInt(""+map.get(str).get("deaths")));
							pCountry.setInt(5,Integer.parseInt(""+map.get(str).get("population")));
							pCountry.setInt(6,Integer.parseInt(""+map.get(str).get("sq_km_area")));
							pCountry.setString(7,""+map.get(str).get("life_expectancy"));
							pCountry.setString(8,""+map.get(str).get("elevation_in_meters"));
							pCountry.setString(9,""+map.get(str).get("continent"));
							pCountry.setString(10,""+map.get(str).get("abbreviation"));
							pCountry.setString(11,""+map.get(str).get("location"));
							pCountry.setInt(12,Integer.parseInt(""+map.get(str).get("iso")));
							pCountry.setString(13,""+map.get(str).get("capital_city"));
                            pCountry.executeUpdate();
							break;
						} else { // 不是All，则是地区名，插入地区的表格

							pArea.setString(1,nation);    
							pArea.setString(2,""+map.get(str).get("lat"));
							pArea.setString(3,""+map.get(str).get("long"));
							pArea.setInt(4,Integer.parseInt(""+map.get(str).get("confirmed")));
							pArea.setInt(5,Integer.parseInt(""+map.get(str).get("recovered")));
							pArea.setInt(6,Integer.parseInt(""+map.get(str).get("deaths")));
							pArea.setString(7,""+map.get(str).get("updated"));
							pArea.setString(8,str);
							
							pArea.executeUpdate();//执行当前地区的插入操作。
							break;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
