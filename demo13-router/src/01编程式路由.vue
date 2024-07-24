<script setup>
  import {useRouter} from 'vue-router'
  import {ref} from 'vue'
  const router = useRouter()
  let myPath = ref("")

  function showList() {
    // 编程式路由实现页面跳转
    // router.push("/list")
    router.push({path:"/list"})
  }
  function goMyPage() {
    router.push(myPath.value)
  }

</script>

<template>
  <div>
<!--    生命式路由   -->
    <router-link to="/home">home</router-link> <br>
    <router-link to="/add">add</router-link> <br>
    <router-link to="/list">list</router-link> <br>
    <router-link to="/update">update</router-link> <br>
<!--编程式路由-->
    <button @click="goMyPage()">GO</button><input type="text" v-model="myPath">
    <hr>
    <router-view></router-view>
  </div>
</template>

<style scoped>

</style>
