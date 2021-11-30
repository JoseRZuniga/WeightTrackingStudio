package com.wts.njp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wts.njp.model.Log;

@Service
public class LogServiceImpl implements LogService {
	
	private static Long logId = new Long(0);
	private static List<Log> logs = new ArrayList<Log>();
	
	static {
		logs = populateLogs();
	}

	private static List<Log> populateLogs() {

		Log log1 = new Log();
		log1.setId(++logId);
		log1.setDate("10/10/2021");
		log1.setWeight(185);
		
		Log log2 = new Log();
		log2.setId(++logId);
		log2.setDate("10/15/2021");
		log2.setWeight(183);
		
		Log log3 = new Log();
		log3.setId(++logId);
		log3.setDate("10/20/2021");
		log3.setWeight(182);
		
		logs.add(log1);
		logs.add(log2);
		logs.add(log3);
		
		return logs;
	}

	public List<Log> retrieveAllLogs() {
		return logs;
	}
	
	public Log saveLog(Log log) {
		log.setId(++logId);
		logs.add(log);
		return log;
	}
	
	public static Long getLogId() {
		return logId;
	}
	public static void setLogId(Long logId) {
		LogServiceImpl.logId = logId;
	}
	
	public static List<Log> getLogs() {
		return logs;
	}

	public static void setLogs(ArrayList<Log> logs) {
		LogServiceImpl.logs = logs;
	}
	
}
