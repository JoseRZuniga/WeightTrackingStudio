/**
 * 
 */
'use strict'

angular.module('myApp').controller('LogController',
	['LogService', function(LogService){
		var self = this;
		
		self.log={
			id : '',
			date : '',
			weight : '',
		};
		self.logs = [];		
		
		self.fetchAllLogs = function(){
			LogService.fetchAllLogs().then(function(data){
				self.logs = data;
			});
		}
		
		self.addLog = function(){
			return LogService.createLog(self.log).then(function(){
				self.fetchAllLogs();
			});
		}

		self.fetchAllLogs();
}]);