// 专门用于存储日程状态的Pinia
import {defineStore} from "pinia";

export const defineSchedule = defineStore(
    "scheduleList",
    {
        state: ()=>{
            return {
                itemList:[
                    {
                        sid:1,
                        uid:1,
                        title:'Learn Java',
                        completed:0
                    },
                    {
                        sid:1,
                        uid:1,
                        title:'Learn Java',
                        completed:0
                    },
                    {
                        sid:1,
                        uid:1,
                        title:'Learn Java',
                        completed:0
                    },
                ]
            }
        },
        getters:{

        },
        actions:{

        }
    }
)