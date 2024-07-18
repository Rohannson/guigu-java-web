// 导入 创建路由对象需要使用的函数
import {createRouter,createWebHashHistory} from "vue-router";

// 导入 .vue 组件
import Home from '../components/Home.vue'
import List from '../components/List.vue'
import Update from '../components/Update.vue'
import Add from '../components/Add.vue'

// 创建一个路由对象
const router = createRouter({
    // history属性用于记录路由的历史
    history: createWebHashHistory(),
    // 用于定义多个不同路径和组件之间的对应关系
    routes: [
        {
            path:"/home",
            component: Home
        },
        {
            path: "/list",
            component: List
        },
        {
            path:"/update",
            component: Update
        },
        {
            path:"/add",
            component: Add
        },
        {
            path:"/",
            component: Home
        }
    ]
})

// 向外暴露以上router
export default router