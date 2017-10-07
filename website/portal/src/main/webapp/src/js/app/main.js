/**
 * Created by domea on 17-6-12.
 */
'use strict';
(function (root) {
    require(["./config"], function (config) {
        requirejs.config(config);
        require(['domReady!', 'bootstrap'], function () {

        });
    });
})(this);