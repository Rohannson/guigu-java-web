import {createRouter, createWebHashHistory} from "vue-router";

import Home from '../components/Home.vue'
import Login from '../components/Login.vue'


const router = createRouter({
    history:createWebHashHistory(),
    routes:[
        {
            path:"/home",
            component:Home
        },
        {
            path:"/login",
            component:Login
        },
    ]
})

// 通过路由的前置守卫 校验登陆
router.beforeEach((to,from,next)=>{
    if(to.path == '/login'){
        //判断如果是去登陆试图,直接放行
        next()
    } else {
        // 如果是去访问其他资源, 都要在登陆之后才会放行, 如果没有登陆,则重定向到登陆试图
        const username = sessionStorage.getItem("username")
        if (null != username) {
            next()
        } else {
            next("/login")
        }
    }
})

export default router