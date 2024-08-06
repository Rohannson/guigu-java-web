<script setup>
  import {ref,onBeforeMount,onMounted,onBeforeUpdate,onUpdated} from "vue";

//   挂载之前
  onBeforeMount(()=>{
    console.log("---------------------onBeforeMount----------------------")
  })

//   挂载完成
  onMounted(()=>{
    console.log("---------------------onMounted----------------------")
  })

//   更新之前
  onBeforeUpdate(()=>{
    console.log("---------------------onBeforeUpdate----------------------")
    let ele = document.getElementById("s1")
    console.log(message.value,ele.innerText)
  })

//   更新之后
  onUpdated(()=>{
    console.log("---------------------onUpdated----------------------")
    let ele = document.getElementById("s1")
    console.log(message.value,ele.innerText)
  })

  let message = ref(1)

</script>

<template>
  <div>
    <span id="s1">{{message}}</span>
    <button @click="message++"> changeMessage </button>
  </div>
</template>

<style scoped>
.logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
  transition: filter 300ms;
}
.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}
.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
</style>
