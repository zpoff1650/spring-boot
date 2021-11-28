'use strict';

describe('BaseAppExample.version module', function() {
  beforeEach(module('BaseAppExample.version'));

  describe('version service', function() {
    it('should return current version', inject(function(version) {
      expect(version).toEqual('0.1');
    }));
  });
});
