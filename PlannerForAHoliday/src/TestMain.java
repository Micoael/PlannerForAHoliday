import util.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import lib.EverydayEvent;

public class TestMain {

	public static void main(String[] args) {
		int today=1;
		ArrayList<EverydayEvent> list=new ArrayList<EverydayEvent>();
		// 1 2 1 represents that:
		// a task starts on the first day
		//it lasts for a day
		//and show every two days
		//1-5-2��ʾ��������ӵ�һ�쿪ʼ��ÿ��5����ʾһ�Σ�һ����2��
		list.add(new EverydayEvent(1, "��ѧ��ҵ", "1-1-1"));
		list.add(new EverydayEvent(1, "���Ĺ�ʫĬд", "1-1-1"));
		list.add(new EverydayEvent(1, "Ӣ�����", "1-1-1"));
		list.add(new EverydayEvent(1, "���ξ���", "1-1-1"));
		list.add(new EverydayEvent(1, "��ѧ����", "1-1-1"));
		list.add(new EverydayEvent(1, "��ʷ��ҵ", "1-1-1"));
		list.add(new EverydayEvent(1, "������ҵ", "1-2-1"));
		Util.showText(list, today);
	}

}
