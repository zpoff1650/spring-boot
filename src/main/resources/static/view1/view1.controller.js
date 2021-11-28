(function () {
    'use strict'

    angular.module('BaseAppExample')
        .controller('View1Ctrl', View1Ctrl);

    View1Ctrl.$inject = ['EmployerService'];

    function View1Ctrl(EmployerService) {
        let vm = this;

        function init() {
            EmployerService.findAllDTOs({}, function (data) {
                    vm.employers = data;
                },
                function () {
                    alert("Failed to load employers")
                });
        }


        init();
    }

})();
