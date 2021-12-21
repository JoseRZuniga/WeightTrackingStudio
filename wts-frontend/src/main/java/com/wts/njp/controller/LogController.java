//package com.wts.njp.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.wts.njp.model.Log;
//import com.wts.njp.service.LogService;
//@RequestMapping(value ="/logs")
//@RestController
//public class LogController {
//	
//	@Autowired
//	private LogService logService;
//	
//	@RequestMapping(value="/getLogs", method= RequestMethod.GET)
//	public ResponseEntity<List<Log>> fetchAllLogs(){
//		return new ResponseEntity<List<Log>>(logService.retrieveAllLogs(), HttpStatus.OK);
//	}
//	
//	@RequestMapping(value="/", method=RequestMethod.POST)
//	public ResponseEntity<Void> createLog(@RequestBody Log log){
//		logService.saveLog(log);
//		return new ResponseEntity<Void>(HttpStatus.OK);
//	}
//	
//  
//}
