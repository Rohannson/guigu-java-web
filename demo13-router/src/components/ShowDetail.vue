<script setup>
//  接受传递过来的路径参数
// useRoute函数是用来接收参数
// route.param表示路径参数
// route.query

  import {useRoute} from 'vue-router'
  import {ref} from 'vue'

  let route = useRoute()
  route.param.id
  route.param.language

</script>

<template>
  <div>
    <h1> ShowDetail接收路径参数 </h1>
  </div>
</template>

<style scoped>

</style>
