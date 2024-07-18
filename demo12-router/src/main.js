import { createApp } from 'vue'
import './style.css'
import App from './App.vue'

// 在整个App.vue中可以使用路由
import router from './router/router.js'

const app = createApp(App)

app.use(router)
app.mount('#app')