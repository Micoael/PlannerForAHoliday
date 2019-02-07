package util;

import java.awt.List;
import java.util.ArrayList;

import lib.EverydayEvent;

public class Util {
	
public static Boolean judgeIsShowToday(EverydayEvent event,int today){
		
		//give you an instant
		if(event.getRule()!=null){
			
			return getShowDate(event.getRule(), today);
		}else{
			return false;
		}
			
	}

	//Get back an boolean value that indicates whether it is going
	//to show today or not.
	private static Boolean getShowDate(String str,int today) {
		String[] ruleText  = new String[3];
		try {
			ruleText = str.split("-");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		int offset=Integer.parseInt(ruleText[0]);
		int interval=Integer.parseInt(ruleText[1]);
		int duration=Integer.parseInt(ruleText[2]);
		return ((today-offset)%interval)<=duration;
	}
	
	
	public ArrayList<EverydayEvent> readStack() {
		//TODO:fetch data from database
		
		return null;
	}
	
	public static void showText(ArrayList<EverydayEvent> list,int today) {
		int i=0;
		System.out.println("今天你要完成：");
		for (EverydayEvent everydayEvent : list) {
			if(judgeIsShowToday(everydayEvent, today)){
				i=i+1;
				//This will be modified when an android app launches
				System.out.println("    "+i+"."+everydayEvent.getName());
			}
		}
	}
	
}
