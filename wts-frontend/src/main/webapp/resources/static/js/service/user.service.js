/**
 * 
 */

'use strict';

angular.module('myApp').service('UserService', ['$http', function($http) {

		var REST_SERVICE_URL = 'user/';

		var factory = {
			fetchAllUsers : fetchAllUsers,
			createUser : createUser
//			updateUser : updateUser,
//			deleteUser : deleteUser
		};

		return factory;

		function fetchAllUsers() {
			return $http.get(REST_SERVICE_URL + 'list').then(function(response) {
					return response.data;
				}
			);
		}

		function createUser(user) {
			return $http.post(REST_SERVICE_URL, user).then(function(response) {
					return response.data;
				}
			);
		}
		
//		function deleteUser(id) {
//			return $http.post(REST_SERVICE_URL + "/delete-"+ {id}).then(function(response) {
//					return response.data;
//				}
//			);
//		}

}]);