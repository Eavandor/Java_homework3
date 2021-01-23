package homework;
/**
*@author ����: ��� ѧ��:831903309 (���Ǿ����ܵ���������������Ǹ�����������лzmgg!zmggyyds!!!)
*@version ����ʱ��: 2020��12��23�� ����9:49:43
*@declaration ��˵��: ������������JSON�е���Ϣ���������Ѵ����õ�MySQL����С�
*/
import java.util.Map;
import com.alibaba.fastjson.JSONObject;
import java.sql.*;

public class Insert_Into_MySQL {
	public static void addToDatabase(String JSON_OF_A_Country, Connection con) {
		try {
		PreparedStatement pCountry=con.prepareStatement("insert into Situation_of_Countries values(?,?,?,?,?,?,?,?,?,?,?,?,?);");
		PreparedStatement pArea=con.prepareStatement("insert into Situation_of_Areas values(?,?,?,?,?,?,?,?);");
		//��Ԥ������䣬���Ч�ʣ�Ҳ���������ԣ�ʹ�ò�ͬ���ݿ��Զ�β���������С�
	
		Map<String, JSONObject> map = JSONObject.parseObject(JSON_OF_A_Country, Map.class);
		final String nation = map.get("All").getString("country");  //�õ������������Ĺ�������

		for (String str : map.keySet()) {
			if (map.get(str).size() >= 1) {
				for (String key : map.get(str).keySet()) {
					try {
						if (str.equals("All")) {                       // �����All, ��ʾ����ȫ������������������ҵı��
							pCountry.setString(1,""+map.get(str).get("country"));  //�õ�key Ϊ"contry"�Ķ�Ӧ��ֵ
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
						} else { // ����All�����ǵ���������������ı��

							pArea.setString(1,nation);    
							pArea.setString(2,""+map.get(str).get("lat"));
							pArea.setString(3,""+map.get(str).get("long"));
							pArea.setInt(4,Integer.parseInt(""+map.get(str).get("confirmed")));
							pArea.setInt(5,Integer.parseInt(""+map.get(str).get("recovered")));
							pArea.setInt(6,Integer.parseInt(""+map.get(str).get("deaths")));
							pArea.setString(7,""+map.get(str).get("updated"));
							pArea.setString(8,str);
							
							pArea.executeUpdate();//ִ�е�ǰ�����Ĳ��������
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
