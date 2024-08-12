<script setup>
  /*
  * 插值表达式
  * */

  //定义一些常见类型数据
  let msg = "hello vue3"
  let getMsg = ()=>{
    return "hello vue3 message"
  }
  let age = 12
  let bee = "BEE"
  let carts = [{name: "coke", price: 3, number: 10}, {name: "chips", price: 6, number:8}]

// 获得商品总金额的方法
  function compute() {
    let price = 0
    for (let index in carts) {
      price += carts[index].price * carts[index].number
    }
    return price
  }

</script>


<template>
  <div>
    <!-- 将数据绑定到下面的元素上 -->
    <h1>{{ msg }}</h1> <br>
    msg的值为 {{ getMsg() }} <br>
    Age: {{ age }}, Is adult?: {{ age > 18 ? 'yes' : 'no'}} <br>
    <!--插值表达式支持对象调用API-->
    The total price of the item in the cart is: {{compute()}}
  </div>
</template>


<style scoped>

</style>
