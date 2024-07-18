<script setup>
</script>

<template>
  <div>
    App 开头内容 <br>
    <router-link to="/home"> home </router-link> <br>
    <router-link to="/add"> add </router-link> <br>
    <router-link to="/list"> list </router-link> <br>
    <router-link to="/update"> update </router-link> <br>

    <hr>
    <router-view></router-view>
    <hr>
    App 结束内容
  </div>
</template>

<style scoped>

</style>
