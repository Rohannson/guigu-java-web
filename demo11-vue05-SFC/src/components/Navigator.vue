<script setup>
//  Pass parameter to father component

  // defineEmits used to define message to be passed to father component and formly submit data
  import {defineEmits} from 'vue'

  // 定义一个向父组件提交数据的事件 事件名称自定义
  const emits = defineEmits(["sendMenu"])

  // 提交数据的方法
  function send(data) {
    emits("sendMenu", data)
  }

</script>

<template>
  <div>
    <ul>
      <li @click="send('Student Management')">Student Management</li>
      <li @click="send('Books Management')">Books Management</li>
      <li @click="send('Vacation Management')">Vacation Management</li>
      <li @click="send('Exam Management')">Exam Management</li>
      <li @click="send('Class Management')">Class Management</li>
      <li @click="send('Lecturer Management')">Lecturer Management</li>
    </ul>
  </div>
</template>

<style scoped>

</style>
