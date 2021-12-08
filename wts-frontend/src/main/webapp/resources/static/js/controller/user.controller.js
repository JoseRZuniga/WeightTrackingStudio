/**
 * 
 */
'use strict';

angular.module('myApp').controller('UserController', 
	[ 'UserService', function(UserService) {
    	var self= this;

		self.user={
			id : '',
			name :'',
			age : '',
			email : '',
		};
		self.users = [];
		
		self.fetchAllUsers = function(){
			UserService.fetchAllUsers().then(function(data){
				self.users = data;
			});
		}
		
		self.addUser = function(){
			return UserService.createUser(self.user).then(function(){
				self.fetchAllUsers();
			});
		}
		
		self.fetchAllUsers();
}]);