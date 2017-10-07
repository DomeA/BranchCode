/**
 * Created by domea on 17-6-12.
 */
define({
    packages: [],
    // urlArgs: "bust=" + (new Date()).getTime(),
    baseUrl: 'js/',
    paths: {
        "jquery": './libs/jquery/jquery',
        "bootstrap": './libs/bootstrap/bootstrap',
        'domReady': './libs/domReady/domReady',
        'vue': './libs/vue/dist/vue',
        'vue-router': './libs/vue-router/vue-router'
    },
    map: {
        '*': {
            'css': './libs/require-css/css',
            'less': './libs/require-less/less'
        }
    },
    shim: {
        'bootstrap': {
            deps: [
                'jquery',
                'css!./libs/bootstrap/bootstrap',
                'css!./libs/bootstrap/bootstrap-theme'
            ]
        },
        'vue-router': {
            deps: [
                'vue'
            ]
        }
    }
});