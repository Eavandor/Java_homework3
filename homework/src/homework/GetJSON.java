package homework;
/**
*@author 作者: 林宇涵 学号:831903309 (就是经常跑到你宿舍问问题的那个嘻嘻嘻，多谢zmgg!zmggyyds!!!)
*@version 创建时间: 2020年12月23日 下午9:49:43
*@declaration 类说明: 此类用于访问API接口得到对应国家及地区疫情的JSON信息
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
		
		HttpClient client = HttpClients.createDefault();// 创建默认http连接
		HttpGet get = new HttpGet("https://covid-api.mmediagroup.fr/v1/cases?country=" + country);// 创建一个get请求
		HttpResponse response = client.execute(get);// 用http连接去执行get请求并且获得http响应
		HttpEntity entity = response.getEntity();// 从response中取到响实体
		String json = EntityUtils.toString(entity);// 把响应实体转成文本

		return json;//返回json文本
	}
}
