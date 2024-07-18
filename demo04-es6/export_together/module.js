// 变量
export const PI = 3.14

// function
export function sum (a,b) {
    return a + b
}

// Class
export class Person{
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
    sayHello() {
        console.log(`Hello, My name is ${this.name}, I am ${this.age} years old.`)
    }
}