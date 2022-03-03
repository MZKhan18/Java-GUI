package javaGUI;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerMain {
	
	public static void main(String[] args) {
		
		// Timer = 		A facility for threads to schedule tasks 
		//				for future execution in a background thread
		
		// TimerTask = 	A task that can be scheduled for one-time 
		//				or repeated execution by a Timer
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
//			int counter = 10;
			@Override
			public void run() {   //method to use timer task
				System.out.println("task is complete");
			}		
		};
		
		
		timer.schedule(task, 100);  //link the timer and task
		
//		Calendar date = Calendar.getInstance();
//		date.set(Calendar.YEAR,2020);
//		date.set(Calendar.MONTH,Calendar.DECEMBER);
//		date.set(Calendar.DAY_OF_MONTH,31);
//		date.set(Calendar.HOUR_OF_DAY,23);
//		date.set(Calendar.MINUTE,59);
//		date.set(Calendar.SECOND,50);
//		date.set(Calendar.MILLISECOND,0);
		
		//timer.schedule(task, 0);
		//timer.schedule(task, date.getTime());
		//timer.scheduleAtFixedRate(task, 0, 1000);
//		timer.scheduleAtFixedRate(task, date.getTime(), 1000);
	}

}