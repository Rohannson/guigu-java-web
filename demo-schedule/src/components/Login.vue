<script setup>
  import {ref, reactive} from "vue";

  import request from '../utils/request'
  import {useRouter} from "vue-router";

  const router = useRouter()

  import {defineUser} from '../store/userStore.js'
  let sysUser = defineUser()

  let loginUser = reactive({
    username:"",
    userPwd:""
  })

  let usernameMsg = ref("")
  let userPwdMsg= ref("")

  function checkUsername() {
    let usernameReg = /^[a-zA-Z0-9]{5,10}$/
    if (!usernameReg.test(loginUser.username)){
      usernameMsg.value="Wrong Format"
      return false
    }
    usernameMsg.value = "OK"
    return true
  }

  function checkUserPwd() {
    let userPwdReg = /^[0-9]{6}$/

    if (!userPwdReg.test(loginUser.userPwd)) {
      userPwdMsg.value = "Wrong Format"
      return false
    }

    userPwdMsg.value = "OK"
    return true
  }

  async function login() {
    let flag1 = checkUsername()
    let flag2 = checkUserPwd()
    if (!(flag1 && flag2)) {
      return
    }

    let {data} = await request.post("user/login", loginUser)
    console.log("Here is login data: " + data)
    if (data.code == 200) {
      alert("Login Success")

      // 将用户信息更新到Pinia中
      sysUser.uid = data.data.loginUser.uid
      sysUser.username = data.data.loginUser.username

      router.push("/showSchedule")
    } else if (data.code == 501) {
      alert("Wrong Username")
    } else if (data.code == 503) {
      alert("Wrong Password")
    } else {
      alert("Unknown Error")
    }
  }

</script>

<template>
  <div>
    <h3 class="ht">请登录</h3>
    <table class="tab" cellspacing="0px">
      <tr class="ltr">
        <td>请输入账号</td>
        <td>
          <input class="ipt"
                 type="text"
                 v-model="loginUser.username"
                 @blur="checkUsername()">
          <span id="usernameMsg" v-text="usernameMsg"></span>
        </td>
      </tr>
      <tr class="ltr">
        <td>请输入密码</td>
        <td>
          <input class="ipt"
                 type="password"
                 v-model="loginUser.userPwd"
                 @blur="checkUserPwd()">
          <span id="userPwdMsg" v-text="userPwdMsg"></span>
        </td>
      </tr>
      <tr class="ltr">
        <td colspan="2" class="buttonContainer">
          <input class="btn1" type="button" @click="login()" value="登录">
          <input class="btn1" type="button" value="重置">
          <router-link to="/regist">
            <button class="btn1">去注册</button>
          </router-link>
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
  width: 500px;
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
  width:60px;
  background-color: antiquewhite;
}
#usernameMsg , #userPwdMsg {
  color: gold;
}
.buttonContainer{
  text-align: center;
}
</style>