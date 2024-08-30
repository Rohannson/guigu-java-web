<script setup>
  // 导入Pinia数据
  import {defineUser} from '../store/userStore.js'
  import {defineSchedule} from '../store/scheduleStore.js'
  let sysUser = defineUser()
  let schedule = defineSchedule()

</script>

<template>
  <div>
    <h3 class="ht">您的日程如下</h3>
    <table class="tab" cellspacing="0px">
      <tr class="ltr">
        <th>编号</th>
        <th>内容</th>
        <th>进度</th>
        <th>操作</th>
      </tr>
      <tr class="ltr" v-for="item,index in schedule.itemList" :key="index">
        <td v-text = "index + 1"></td>
        <td v-text = "item.title"></td>
        <td>
            <input type="radio" value="1" v-model="item.completed"> Completed
            <input type="radio" value="0" v-model="item.completed"> Incomplete
        </td>
        <td class="buttonContainer">
          <button class="btn1">删除</button>
          <button class="btn1">保存修改</button>
        </td>
      </tr>
      <tr class="ltr buttonContainer" >
        <td colspan="4">
          <button class="btn1">新增日程</button>
        </td>

      </tr>
    </table>
  </div>
</template>

<style scoped>

.ht{
  text-align: center;
  color: cadetblue;
  font-family: 幼圆;
}
.tab{
  width: 80%;
  border: 5px solid cadetblue;
  margin: 0px auto;
  border-radius: 5px;
  font-family: 幼圆;
}
.ltr td{
  border: 1px solid  powderblue;

}
.ipt{
  border: 0px;
  width: 50%;

}
.btn1{
  border: 2px solid powderblue;
  border-radius: 4px;
  width:100px;
  background-color: antiquewhite;

}
#usernameMsg , #userPwdMsg {
  color: gold;
}

.buttonContainer{
  text-align: center;
}

</style>