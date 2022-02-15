package com.nepplus.kotlinbasic_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//         btnLog가 눌리면 어떤 코드를 실행할지, 할 일을 설정.
        btnLog.setOnClickListener {

//            로그를 찍어보는 기능 실행. => btnLog가 클릭될 때 마다 실행.
            Log.d("MainActivity", "로그 버튼 눌림")
            Log.d("메인화면", "추가 로그 찍어보기")
         //   Log.e("메인화면","E로 로드 찍기")  Log.e(에러로그), Log.i(정보용 로그)
        }

        btnToast.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("확인")
                .setMessage("토스트 클릭했습니다.")
                .setPositiveButton("확인"){_,_ -> }
                .create()
                .show()
        }
        btnVariable.setOnClickListener {
//            변수에 대한 문법 연습용 코드
//            변수 = variabla -> var
//            상수 = value - > val



            var myName: String
            myName = "카카로트"

            myName = "손오반"

            val friendName: String
            friendName = "베지터"

            Toast.makeText(this, friendName, Toast.LENGTH_SHORT).show()
            Log.d("MainActivity",myName.toString())

            var myBirthYear: Int
            myBirthYear = 1991
            var myHeight: Double
            myHeight = 168.8
        }
    }
}