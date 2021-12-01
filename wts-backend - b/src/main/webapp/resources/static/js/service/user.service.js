///**
// * 
// */
//
//'use strict';
//
//angular.module('myApp').service('UserService', ['$http', function($http) {
//
//		var REST_SERVICE_URL = 'user/';
//
//		var factory = {
//			fetchAllUsers : fetchAllUsers,
//			createUser : createUser
//		};
//
//		return factory;
//
//		function fetchAllUsers() {
//			return $http.get(REST_SERVICE_URL + 'getAll').then(function(response) {
//					return response.data;
//				}
//			);
//		}
//
//		function createUser(user) {
//			return $http.post(REST_SERVICE_URL, user).then(function(response) {
//					return response.data;
//				}
//			);
//		}
//
//}]);