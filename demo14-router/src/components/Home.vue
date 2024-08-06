<script setup>

  import {ref} from "vue";
  import {useRouter} from "vue-router"
  const router = useRouter()

  let username = window.sessionStorage.getItem('username')

  function logout(){
    // 清楚session story中的用户登陆信息
    window.sessionStorage.removeItem('username')
    // 跳转到login的页面
    router.push("/login")
  }

</script>

<template>
  <div>
    <h1>home页面</h1>
    <h3> 欢迎 {{username}} 登陆</h3>
    <button @click="logout()"> 推出登陆 </button>
  </div>
</template>

<style scoped>

</style>
