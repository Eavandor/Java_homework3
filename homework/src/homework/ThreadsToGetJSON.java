package homework;
/**
*@author ����: ��� ѧ��:831903309 (���Ǿ����ܵ���������������Ǹ�����������лzmgg!zmggyyds!!!)
*@version 2020��12��23�� ����9:49:43
*@declaration ��˵��: ����û��VPN��������API�������������ڽ��Ĵ�API���ʣ���Ϊ�ĸ��̣߳�����ͬʱ�����Ĵ�API�ķ��ʣ�����API��ȡ��Ϣ��ʱ������Ϊ�ķ�֮һ����߳��������ٶȡ�
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
