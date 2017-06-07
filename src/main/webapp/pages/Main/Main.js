Application.$controller("MainPageController", ["$scope", function($scope) {
    "use strict";
    $scope.Data = [{
        "empId": 1,
        "firstname": "Eric",
        "lastname": "Lin",
        "street": "45 Houston Street",
        "city": "New York",
        "state": "NY",
        "zip": "10106",
        "birthdate": "1973-10-21",
        "picurl": "http://dev.wavemaker.com/examples/salesrep/Eric-Lin.png",
        "jobTitle": "Product Manager",
        "deptId": 1,
        "username": "eric.lin",
        "password": "wavemaker",
        "role": "admin",
        "managerId": null,
        "tenantId": 1,
        "department": {
            "deptId": 1,
            "name": "Engineering",
            "budget": 1936760,
            "q1": 445455,
            "q2": 522925,
            "q3": 426087,
            "q4": 542293,
            "deptCode": "Eng",
            "location": "San Francisco",
            "tenantId": 1
        },
        "employeeByManagerId": null
    }, {
        "empId": 2,
        "firstname": "Brad",
        "lastname": "Tucker",
        "street": "25 Liberty PI",
        "city": "Boston",
        "state": "MA",
        "zip": "02127",
        "birthdate": "1991-03-19",
        "picurl": "http://dev.wavemaker.com/examples/salesrep/Brad-Tucker.png",
        "jobTitle": "Engineer",
        "deptId": 1,
        "username": "brad.tucker",
        "password": "wavemaker",
        "role": "user",
        "managerId": 1,
        "tenantId": 1,
        "department": {
            "deptId": 1,
            "name": "Engineering",
            "budget": 1936760,
            "q1": 445455,
            "q2": 522925,
            "q3": 426087,
            "q4": 542293,
            "deptCode": "Eng",
            "location": "San Francisco",
            "tenantId": 1
        },
        "employeeByManagerId": {
            "empId": 1,
            "firstname": "Eric",
            "lastname": "Lin",
            "street": "45 Houston Street",
            "city": "New York",
            "state": "NY",
            "zip": "10106",
            "birthdate": "1973-10-21",
            "picurl": "http://dev.wavemaker.com/examples/salesrep/Eric-Lin.png",
            "jobTitle": "Product Manager",
            "deptId": 1,
            "username": "eric.lin",
            "password": "wavemaker",
            "role": "admin",
            "managerId": null,
            "tenantId": 1,
            "department": {
                "deptId": 1,
                "name": "Engineering",
                "budget": 1936760,
                "q1": 445455,
                "q2": 522925,
                "q3": 426087,
                "q4": 542293,
                "deptCode": "Eng",
                "location": "San Francisco",
                "tenantId": 1
            }
        }
    }, {
        "empId": 3,
        "firstname": "Chris",
        "lastname": "Madison",
        "street": "2525 Cypress Lane",
        "city": "Atlanta",
        "state": "GA",
        "zip": "14231",
        "birthdate": "1975-09-30",
        "picurl": "http://dev.wavemaker.com/examples/salesrep/Chris-Madison.png",
        "jobTitle": "Architect",
        "deptId": 1,
        "username": "chris.madison",
        "password": "wavemaker",
        "role": "user",
        "managerId": 1,
        "tenantId": 1,
        "department": {
            "deptId": 1,
            "name": "Engineering",
            "budget": 1936760,
            "q1": 445455,
            "q2": 522925,
            "q3": 426087,
            "q4": 542293,
            "deptCode": "Eng",
            "location": "San Francisco",
            "tenantId": 1
        },
        "employeeByManagerId": {
            "empId": 1,
            "firstname": "Eric",
            "lastname": "Lin",
            "street": "45 Houston Street",
            "city": "New York",
            "state": "NY",
            "zip": "10106",
            "birthdate": "1973-10-21",
            "picurl": "http://dev.wavemaker.com/examples/salesrep/Eric-Lin.png",
            "jobTitle": "Product Manager",
            "deptId": 1,
            "username": "eric.lin",
            "password": "wavemaker",
            "role": "admin",
            "managerId": null,
            "tenantId": 1,
            "department": {
                "deptId": 1,
                "name": "Engineering",
                "budget": 1936760,
                "q1": 445455,
                "q2": 522925,
                "q3": 426087,
                "q4": 542293,
                "deptCode": "Eng",
                "location": "San Francisco",
                "tenantId": 1
            }
        }
    }, {
        "empId": 4,
        "firstname": "Amanda",
        "lastname": "Brown",
        "street": "1 Broadway Street",
        "city": "New York",
        "state": "NY",
        "zip": "10036",
        "birthdate": "1990-11-23",
        "picurl": "http://dev.wavemaker.com/examples/salesrep/Amanda-Brown.png",
        "jobTitle": "Sales Rep",
        "deptId": 4,
        "username": "amanda.brown",
        "password": "wavemaker",
        "role": "admin",
        "managerId": null,
        "tenantId": 1,
        "department": {
            "deptId": 4,
            "name": "Sales",
            "budget": 2743744,
            "q1": 493874,
            "q2": 658499,
            "q3": 713373,
            "q4": 877998,
            "deptCode": "Sales",
            "location": "Austin",
            "tenantId": 1
        },
        "employeeByManagerId": null
    }, {
        "empId": 5,
        "firstname": "Jane",
        "lastname": "Lisa",
        "street": "346 Mulholland Drive",
        "city": "Los Angeles",
        "state": "CA",
        "zip": "94036",
        "birthdate": "1984-02-25",
        "picurl": "http://dev.wavemaker.com/examples/salesrep/Jane-Lisa.png",
        "jobTitle": "Marketing Lead",
        "deptId": 2,
        "username": "jane.lisa",
        "password": "wavemaker",
        "role": "admin",
        "managerId": null,
        "tenantId": 1,
        "department": {
            "deptId": 2,
            "name": "Marketing",
            "budget": 1129777,
            "q1": 225955,
            "q2": 271146,
            "q3": 327635,
            "q4": 305040,
            "deptCode": "Mktg",
            "location": "New York",
            "tenantId": 1
        },
        "employeeByManagerId": null
    }, {
        "empId": 6,
        "firstname": "Jessica",
        "lastname": "Bennet",
        "street": "6000 Sunset Boulevard",
        "city": "Los Angeles",
        "state": "CA",
        "zip": "90028",
        "birthdate": "1992-09-30",
        "picurl": "http://dev.wavemaker.com/examples/salesrep/Jessica-Bennet.png",
        "jobTitle": "Marketing Executive",
        "deptId": 2,
        "username": "jessica.bennet",
        "password": "wavemaker",
        "role": "user",
        "managerId": 5,
        "tenantId": 1,
        "department": {
            "deptId": 2,
            "name": "Marketing",
            "budget": 1129777,
            "q1": 225955,
            "q2": 271146,
            "q3": 327635,
            "q4": 305040,
            "deptCode": "Mktg",
            "location": "New York",
            "tenantId": 1
        },
        "employeeByManagerId": {
            "empId": 5,
            "firstname": "Jane",
            "lastname": "Lisa",
            "street": "346 Mulholland Drive",
            "city": "Los Angeles",
            "state": "CA",
            "zip": "94036",
            "birthdate": "1984-02-25",
            "picurl": "http://dev.wavemaker.com/examples/salesrep/Jane-Lisa.png",
            "jobTitle": "Marketing Lead",
            "deptId": 2,
            "username": "jane.lisa",
            "password": "wavemaker",
            "role": "admin",
            "managerId": null,
            "tenantId": 1,
            "department": {
                "deptId": 2,
                "name": "Marketing",
                "budget": 1129777,
                "q1": 225955,
                "q2": 271146,
                "q3": 327635,
                "q4": 305040,
                "deptCode": "Mktg",
                "location": "New York",
                "tenantId": 1
            }
        }
    }, {
        "empId": 7,
        "firstname": "Keith",
        "lastname": "Neilson",
        "street": "3 YukYuk Way",
        "city": "San Gabriel",
        "state": "CA",
        "zip": "91775",
        "birthdate": "1988-03-04",
        "picurl": "http://dev.wavemaker.com/examples/salesrep/Keith-Neilson.png",
        "jobTitle": "Admin Assistant",
        "deptId": 3,
        "username": "kieth.neilson",
        "password": "wavemaker",
        "role": "admin",
        "managerId": null,
        "tenantId": 1,
        "department": {
            "deptId": 3,
            "name": "General and Admin",
            "budget": 1452570,
            "q1": 435771,
            "q2": 290514,
            "q3": 348617,
            "q4": 377668,
            "deptCode": "G&A",
            "location": "San Francisco",
            "tenantId": 1
        },
        "employeeByManagerId": null
    }, {
        "empId": 8,
        "firstname": "William",
        "lastname": "Hogan",
        "street": "3 YukYuk Way",
        "city": "San Gabriel",
        "state": "CA",
        "zip": "91775",
        "birthdate": "1981-10-21",
        "picurl": "http://dev.wavemaker.com/examples/salesrep/William-Hogan.png",
        "jobTitle": "Program Manager",
        "deptId": 5,
        "username": "william.hogan",
        "password": "wavemaker",
        "role": "admin",
        "managerId": null,
        "tenantId": 2,
        "department": {
            "deptId": 5,
            "name": "Professional Services",
            "budget": 806984,
            "q1": 201746,
            "q2": 201746,
            "q3": 177536,
            "q4": 225955,
            "deptCode": "PS",
            "location": "San Francisco",
            "tenantId": 2
        },
        "employeeByManagerId": null
    }, {
        "empId": 9,
        "firstname": "Sally",
        "lastname": "Jones",
        "street": "300 South Street",
        "city": "Philadephia",
        "state": "PA",
        "zip": "19147",
        "birthdate": "1987-10-04",
        "picurl": "http://dev.wavemaker.com/examples/salesrep/Sally-Jones.png",
        "jobTitle": "Business Analyst",
        "deptId": 5,
        "username": "sally.jones",
        "password": "wavemaker",
        "role": "user",
        "managerId": 8,
        "tenantId": 2,
        "department": {
            "deptId": 5,
            "name": "Professional Services",
            "budget": 806984,
            "q1": 201746,
            "q2": 201746,
            "q3": 177536,
            "q4": 225955,
            "deptCode": "PS",
            "location": "San Francisco",
            "tenantId": 2
        },
        "employeeByManagerId": {
            "empId": 8,
            "firstname": "William",
            "lastname": "Hogan",
            "street": "3 YukYuk Way",
            "city": "San Gabriel",
            "state": "CA",
            "zip": "91775",
            "birthdate": "1981-10-21",
            "picurl": "http://dev.wavemaker.com/examples/salesrep/William-Hogan.png",
            "jobTitle": "Program Manager",
            "deptId": 5,
            "username": "william.hogan",
            "password": "wavemaker",
            "role": "admin",
            "managerId": null,
            "tenantId": 2,
            "department": {
                "deptId": 5,
                "name": "Professional Services",
                "budget": 806984,
                "q1": 201746,
                "q2": 201746,
                "q3": 177536,
                "q4": 225955,
                "deptCode": "PS",
                "location": "San Francisco",
                "tenantId": 2
            }
        }
    }, {
        "empId": 10,
        "firstname": "Patricia",
        "lastname": "George",
        "street": "1000 Brownsville Road",
        "city": "Brooklyn",
        "state": "NY",
        "zip": "11212",
        "birthdate": "1986-06-18",
        "picurl": "http://dev.wavemaker.com/examples/salesrep/Patricia-George.png",
        "jobTitle": "Support Lead",
        "deptId": 5,
        "username": "patricia.george",
        "password": "wavemaker",
        "role": "user",
        "managerId": 8,
        "tenantId": 2,
        "department": {
            "deptId": 5,
            "name": "Professional Services",
            "budget": 806984,
            "q1": 201746,
            "q2": 201746,
            "q3": 177536,
            "q4": 225955,
            "deptCode": "PS",
            "location": "San Francisco",
            "tenantId": 2
        },
        "employeeByManagerId": {
            "empId": 8,
            "firstname": "William",
            "lastname": "Hogan",
            "street": "3 YukYuk Way",
            "city": "San Gabriel",
            "state": "CA",
            "zip": "91775",
            "birthdate": "1981-10-21",
            "picurl": "http://dev.wavemaker.com/examples/salesrep/William-Hogan.png",
            "jobTitle": "Program Manager",
            "deptId": 5,
            "username": "william.hogan",
            "password": "wavemaker",
            "role": "admin",
            "managerId": null,
            "tenantId": 2,
            "department": {
                "deptId": 5,
                "name": "Professional Services",
                "budget": 806984,
                "q1": 201746,
                "q2": 201746,
                "q3": 177536,
                "q4": 225955,
                "deptCode": "PS",
                "location": "San Francisco",
                "tenantId": 2
            }
        }
    }];




    /* perform any action on widgets/variables within this block */
    $scope.onPageReady = function() {
        /*
         * variables can be accessed through '$scope.Variables' property here
         * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
         * $scope.Variables.loggedInUser.getData()
         *
         * widgets can be accessed through '$scope.Widgets' property here
         * e.g. to get value of text widget named 'username' use following script
         * '$scope.Widgets.username.datavalue'
         */
    };

}]);

Application.$controller("grid1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("liveform1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("liveform2Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("liveform3Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("grid2Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("grid3Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("grid4Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("liveform4Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("grid5Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("grid6Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);