(function () {
    'use strict'

    angular.module('BaseAppExample')
        .factory('EmployerService', EmployerService);

    EmployerService.$inject = ['$resource'];

    function EmployerService($resource) {
        let resourceURL = 'api/employer-service/';

        return $resource(resourceURL, {}, {
            'findAllDTOs': {
                method: 'GET',
                url: 'api/employer-service/find-all',
                isArray: true
            }
        });
    }

})();
