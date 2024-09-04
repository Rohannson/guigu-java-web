// 专门用于存储日程状态的Pinia
import {defineStore} from "pinia";

export const defineSchedule = defineStore(
    "scheduleList",
    {
        state: ()=>{
            return {
                itemList:[]
            }
        },
        getters:{

        },
        actions:{

        }
    }
)