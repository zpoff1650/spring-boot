'use strict';

angular.module('BaseAppExample.version', [
  'BaseAppExample.version.interpolate-filter',
  'BaseAppExample.version.version-directive'
])

.value('version', '0.1');
