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
		//1-5-2表示这项任务从第一天开始，每隔5天显示一次，一持续2天
		list.add(new EverydayEvent(1, "数学作业", "1-1-1"));
		list.add(new EverydayEvent(1, "语文古诗默写", "1-1-1"));
		list.add(new EverydayEvent(1, "英语卷子", "1-1-1"));
		list.add(new EverydayEvent(1, "政治卷子", "1-1-1"));
		list.add(new EverydayEvent(1, "化学卷子", "1-1-1"));
		list.add(new EverydayEvent(1, "历史作业", "1-1-1"));
		list.add(new EverydayEvent(1, "物理作业", "1-2-1"));
		Util.showText(list, today);
	}

}
