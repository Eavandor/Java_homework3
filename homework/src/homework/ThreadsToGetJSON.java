package homework;
/**
*@author 作者: 林宇涵 学号:831903309 (就是经常跑到你宿舍问问题的那个嘻嘻嘻，多谢zmgg!zmggyyds!!!)
*@version 2020年12月23日 下午9:49:43
*@declaration 类说明: 由于没有VPN访问外网API较慢，此类用于将四次API访问，分为四个线程，几乎同时进行四次API的访问，将从API获取信息的时间缩短为四分之一，提高程序运行速度。
*/
import java.io.IOException;

import org.apache.http.ParseException;

public class ThreadsToGetJSON extends Thread {
public static String jsons[]=new String[4];
public String country;
public int index;
public ThreadsToGetJSON(String country,int index) {
	this.country=country;
	this.index=index;
}
	
public void run() {
try {
	jsons[index]=GetJSON.getCountry(country);
	
} catch (ParseException e) {
		e.printStackTrace();
} catch (IOException e2) {
		e2.printStackTrace();
}

}
}
