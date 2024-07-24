import { createApp } from 'vue'

import App from './App.vue'

//导入路由对象
import router from './routers/router'

//使用路由对象
const app = createApp(App)
app.use(router)
app.mount('#app')
