/**
 * @author pawanl
 */

/*var app = angular.module('loginApp', ['pascalprecht.translate']);
app.config( function($translateProvider) {

	  $translateProvider
	  .useStaticFilesLoader({
	    prefix: './resources/json/',
	    suffix: '.json'
	  });
		$translateProvider.preferredLanguage('en');
	});


app.controller('loginCtrl',function($scope, $rootScope, $translate) {
                $scope.changeLanguage = function(langKey) {
                	console.log(langKey);
                    $translate.use(langKey);
                };

       });*/





			$(document).ready(function() {
				$.cookie("lang", "en");
			});
			
			$("#en").click(function(){
				
			
							var selectedLang = "en";
						var prevLang = $.cookie("lang");
						if (selectedLang != prevLang) {
							$.get("./resources/json/" + selectedLang
									+ ".json", function(data, status) {
								changeLanguage(data);
			
							});
						}
						$.cookie("lang", "en");
					
			});
			
			$("#de").click(
					function() {
						var selectedLang = "de";
						var prevLang = $.cookie("lang");
						if (selectedLang != prevLang) {
							$.get("./resources/json/" + selectedLang
									+ ".json", function(data, status) {
								changeLanguage(data);
			
							});
						}
						$.cookie("lang", "de");
						localStorage.de="de";
				});
			
			$("#zh").click(
					function() {
						var selectedLang = "zh";
						var prevLang = $.cookie("lang");
						if (selectedLang != prevLang) {
							$.get("./resources/json/" + selectedLang
									+ ".json", function(data, status) {
								changeLanguage(data);
			
							});
						}
						$.cookie("lang", "zh");
				});
			
			

			function changeLanguage(selectedLangData) {
				console.log(selectedLangData);
				$("#loginheading").html(selectedLangData.loginheading);
				$("#loginfailmsg").html(selectedLangData.loginfailmsg);
				$("#loginfailreson").html(selectedLangData.loginfailreson);
				$("#loginentermsg").html(selectedLangData.loginentermsg);
				$("#loginusername").html(selectedLangData.loginusername);
				$("#loginpassword").html(selectedLangData.loginpassword);
				$("#loginsubmit").html(selectedLangData.loginsubmit);
				
				$("#userInfoheading").html(selectedLangData.userInfoheading);
				$("#userInfowelcome").html(selectedLangData.userInfowelcome);
				$("#userInfoprotectedmsg").html(selectedLangData.userInfoprotectedmsg);
				$("#userInfopaypalindicater").html(selectedLangData.userInfopaypalindicater);

				
			}