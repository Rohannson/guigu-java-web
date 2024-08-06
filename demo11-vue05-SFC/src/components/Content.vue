<script setup>
// 接收父组件的参数
  import {defineProps} from "vue"

  defineProps({
    message:String
  })

</script>

<template>
  <div>
    {{ message }}
  </div>
</template>

<style scoped>

</style>
