/**
 * Created by domea on 17-6-23.
 */
define([], function () {
    return [
        {path: '/', redirect: '/index'},
        {path: '/login', component: loginForm},
        {
            path: '/index', component: indexForm,
            children: [
                {
                    path: '/task', component: taskForm,
                    children: [
                        {path: '/create', component: createForm},
                        {path: '/upload', component: uploadForm},
                        {path: '/deploy/:pId', component: deployForm},
                        {path: '/delete/:pId', component: deleteForm},
                        {path: '/update/:pId', component: updateForm}
                    ]
                },
                {
                    path: '/map', component: mapForm,
                    children: [
                        {path: '/2d', component: twoDForm},
                        {path: '/3d', component: threeDForm}
                    ]
                },
                {
                    path: '/server', component: serverForm,
                    children: [
                        {path: '/server/:serverId/view', component: viewForm},
                        {path: '/server/:serverId/content', component: contentForm},
                        {path: '/add', component: addForm},
                        {path: '/server/:serverId/delete', component: deleteForm}
                    ]
                },
                {
                    path: '/api', component: apiForm,
                    children: [
                        {path: '/sample/:sampleId', component: sampleForm},
                        {path: '/sdk', component: sdkForm}
                    ]
                },
                {
                    path: '/manager', component: managerForm,
                    children: [
                        {
                            path: '/user', component: userForm,
                            children: [
                                {path: '/update/:userId', component: userInfoUpdateForm},
                                {path: '/delete/:userId', component: userInfoDeleteForm}
                            ]
                        },
                        {
                            path: '/role', component: 'roleForm',
                            children: [
                                {path: '/add', component: roleInfoAddForm},
                                {path: '/update/:roleId', component: roleInfoUpdateForm},
                                {path: '/delete/:roleId', component: roleInfoDeleteForm}
                            ]
                        },
                        {
                            path: '/resource', component: resourceForm,
                            children: [
                                {path: '/add', component: resourceInfoAddForm},
                                {path: '/update/:resourceId', component: resourceInfoUpdateForm},
                                {path: '/delete/:resourceId', component: resourceInfoDeleteForm}
                            ]
                        },
                        {
                            path: '/microserver', component: microServerForm,
                            children: [
                                {path: '/microserver/:serverId/info', component: microServerInfoForm},
                                {path: '/microserver/:serverId/pause'},
                                {path: '/microserver/:serverId/start'},
                                {path: '/microserver/:serverId/stop'}
                            ]
                        },
                        {
                            path: '/systemstate', component: systemStateForm,
                            children: [
                                {path: '/cpu', component: cpuInfoForm},
                                {path: '/memory', component: memoryInfoForm},
                                {path: '/network', component: networkInfoForm},
                                {path: '/stress', component: stressInfoForm}
                            ]
                        }
                    ]
                }
            ]
        }
    ];
});