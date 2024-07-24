import {createRouter,createWebHashHistory} from 'vue-router'

// 导入.vue组件
import Home from '../components/Home.vue'
import Add from '../components/Add.vue'
import List from '../components/List.vue'
import Update from '../components/Update.vue'
import ShowDetail from '../components/ShowDetail.vue'



const router = createRouter({
    history:createWebHashHistory(),
    routes:[
        {
            path:"/showDetail/:id/:language",
            component:ShowDetail
        },
        {
            path:"/",
            component:Home
        },
        {
            path:"/home",
            component:Home
        },
        {
            path:"/add",
            component:Add
        },
        {
            path:"/list",
            component:List
        },
        {
            path:"/update",
            component:Update
        }
    ]
})

export default router