<script setup>
//  import multiple vue components
  import {ref} from 'vue'

  import Header from "./components/Header.vue";
  import Navigator from "./components/Navigator.vue";
  import Content from "./components/Content.vue";

  let menu = ref("")

  function receiver(data) {
    menu.value = data
  }
</script>

<template>
  <div>
    <Header class="header"></Header>
    <Navigator @sendMenu="receiver" class="navigator"></Navigator>
    <Content class="content" :message="menu"></Content>
  </div>
</template>

<style scoped>
  .header{
    height: 80px;
    border: 1px solid red;
  }

  .navigator{
    width: 15%;
    height: 800px;
    border: 1px solid green;
    float: left;
  }

  .content{
    width: 83%;
    height: 800px;
    border: 1px solid blue;
    float: right;
  }
</style>
