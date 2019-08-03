import Vue from 'vue';
import VueRouter from 'vue-router';

Vue.use(VueRouter);

export default new VueRouter({
    mode: "history",
    routes: [
        {
            path: '/',
            redirect: "/page",
        },
        {
            path: '/page',
            component: () => import('@/views/HelloWorld'),
        },
        {
            path:'/login',
            component: () => import('@/views/LoginView'),
        }
    ]
})