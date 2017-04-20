package com.fdmgroup.util;

import org.apache.log4j.Logger;

public class AppLogger {

	private static Logger userLogger = null;
	private static Logger sysLogger = null;
	private static AppLogger appLogger = null;
	
	
	public AppLogger() {
		super();
		userLogger = Logger.getLogger("userLogger");
		sysLogger = Logger.getLogger("sysLogger");
	}



	public static Logger getUserLogger(){
		if(userLogger == null){
			appLogger = new AppLogger();
			
		}
		return userLogger;
	}
	
	public static Logger getSysLogger(){
		if(sysLogger == null){
			appLogger = new AppLogger();
			
		}
		return sysLogger;
	}
	
}
