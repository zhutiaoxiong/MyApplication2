package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*
import kotlin.math.PI
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        looptest()
        qujianTest()
        listTest()
        mapTest()
        add(3,5)
        //表达式一
        Log.i("kotlin","${addTwo(3,5)}"+"函数表达式二")
        //表达式二
        addThree()
        addFour()
        获取长方形周长(3.3f,5.5f)
        获取圆周长(PI,4.0f)
        获取圆柱体体积(PI,4.0f,4.0f)

    }
    /**
     *  kotlin循环
     * */
    fun looptest(){
        var nums=1..10
        var result=0
       for(num in nums){
           result=result+num
       }
        Log.i("kotlin","result=${result}")
    }

    /**
     *  kotlin区间
     * */
    fun qujianTest(){
        var nums=1 until  10  //1到10
        var result=0
        for(num in nums){
            Log.i("kotlin","num=${num}")
        }
        //奇数1到16里面的
        var num2=1..16
        for(a in num2 step 2){
            Log.i("kotlin","a=${a}")
        }
        //数组的倒序，1到16变成16到1
        var num3=num2.reversed()
        for(b in num3 ){
            Log.i("kotlin","${b}")
        }
        //查看数组里面元素个数
        Log.i("kotlin","${num3.count()}")
    }

    /**
     *  kotlin list入门
     * */
    fun listTest(){
        var lists= listOf<String>("买鸡蛋","杜蕾斯","买土豆")
        for((i,e)in lists.withIndex()){
            Log.i("kotlin","${i} ${e}")
        }
    }

    /**
     *  kotlin list和map入门
     * */
    fun mapTest(){
        var map= TreeMap<String,String>()
        map["好"]="good"
        map["学"]="fuck"
        Log.i("kotlin","${map["好"]}")
    }

    /**
     *  kotlin 函数和函数表达式
     * */
    fun add(x:Int,y:Int):Int{
        Log.i("kotlin","${x+y}"+"函数表达式一")

       return x+y
    }

    /**
     *  kotlin 函数和函数表达式
     * */
    fun addTwo(x:Int,y:Int):Int= x+y
    /**
     *  kotlin 函数和函数表达式
     * */
    fun addThree(){
        var i={x:Int,y:Int ->x+y}
        var result=i(3,5)
        Log.i("kotlin","${result}"+"函数表达式三")
    }

    /**
     *  kotlin 函数和函数表达式
     * */
    fun addFour(){
       var j:(Int,Int)->Int={x,y->x+y}
        var result=j(3,5)
        Log.i("kotlin","${result}"+"函数表达式四")
    }
    /**
     *  kotlin 默认参数和具名参数
     * */
    fun 获取长方形周长(a:Float,b:Float):Float{
        Log.i("kotlin","${a*b}"+"获取长方形周长")
        return a*b
    }
    /**
     *  kotlin 默认参数和具名参数
     * */
    fun 获取圆周长(PI:Double,圆的半径:Float):Double{
        Log.i("kotlin","${2*PI*圆的半径}"+"获取圆周长")
        return 2*PI*圆的半径
    }

    fun 获取圆柱体体积(PI:Double,圆的半径:Float,高:Float):Double{
        Log.i("kotlin","${PI*圆的半径*圆的半径*高}"+"获取圆柱体体积")
        return PI*圆的半径*圆的半径*高
    }


}
