const app = angular.module("admin-app",["ngRoute"]);

app.config(function($routeProvider, $locationProvider){
	$locationProvider.hashPrefix('');
    $routeProvider

    .when("/product",{
        templateUrl: "product/index.html",
        controller:"product-ctrl"
    })
    .when("/authorize",{
        templateUrl: "authority/index.html",
        controller:"authority-ctrl"
    })
    .when("/unauthorized",{
        templateUrl: "assets/admin/authority/unauthorized.html",
        controller:"authority-ctrl"
    });
})