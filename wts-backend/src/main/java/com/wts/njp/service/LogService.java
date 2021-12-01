package com.wts.njp.service;

import java.util.List;

import com.wts.njp.model.Log;

public interface LogService {

	List<Log> retrieveAllLogs(); 
    Log saveLog(Log log);
    
}
