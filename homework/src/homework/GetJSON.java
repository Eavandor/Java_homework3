package homework;
/**
*@author ����: ��� ѧ��:831903309 (���Ǿ����ܵ���������������Ǹ�����������лzmgg!zmggyyds!!!)
*@version ����ʱ��: 2020��12��23�� ����9:49:43
*@declaration ��˵��: �������ڷ���API�ӿڵõ���Ӧ���Ҽ����������JSON��Ϣ
*/
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class GetJSON {
	public static String getCountry(String country) throws ParseException, IOException {
		
		HttpClient client = HttpClients.createDefault();// ����Ĭ��http����
		HttpGet get = new HttpGet("https://covid-api.mmediagroup.fr/v1/cases?country=" + country);// ����һ��get����
		HttpResponse response = client.execute(get);// ��http����ȥִ��get�����һ��http��Ӧ
		HttpEntity entity = response.getEntity();// ��response��ȡ����ʵ��
		String json = EntityUtils.toString(entity);// ����Ӧʵ��ת���ı�

		return json;//����json�ı�
	}
}
