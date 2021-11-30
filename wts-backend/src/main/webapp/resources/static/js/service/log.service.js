/**
 * 
 */

angular.module('myApp').service('LogService', ['$http', function($http){
	
	var REST_SERVICE_URL = 'logs/';
	
	var factory = {
		fetchAllLogs : fetchAllLogs,
		createLog : createLog
	};
	
	return factory;
	
	function fetchAllLogs(){
		return $http.get(REST_SERVICE_URL + 'getLogs').then(function(response){
				return response.data;
			}
		);
	}
	
	function createLog(log){
		return $http.post(REST_SERVICE_URL, log).then(function(response){
			return response.data;
			}
		);
	}
	
}]);