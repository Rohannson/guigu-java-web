<script setup>

  import {ref} from 'vue'
  import {useRouter} from "vue-router";
  let router = useRouter()

  let username = ref('')
  let password = ref('')

  function login(){
    // 获取用户名和密码 校验用户名为root却密码为123456 则登陆成功
    // 登陆成功则自动跳转
    if (username.value == 'root' && password.value == '123456') {
      // 将用户名保存在浏览器上 sessionStorage localStorage
      window.sessionStorage.setItem("username",username.value)

      // 路由跳转 /home
      router.push("/home")
    } else {
      alert("用户名或者密码错误")
    }
  }

</script>

<template>
  <div>
    账号: <input type="text" v-model="username"> <br>
    密码: <input type="password" v-model="password"> <br>
    <button @click="login()">登陆</button>
  </div>
</template>

<style scoped>

</style>
