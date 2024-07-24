<script setup>
  import {useRouter} from 'vue-router'
  import {ref} from 'vue'
  const router = useRouter()

</script>

<template>
  <div>
    <router-link to="/showDetail/1/Java">声明式路由路径传参</router-link>
    <hr>

    <router-view></router-view>
  </div>
</template>

<style scoped>

</style>
