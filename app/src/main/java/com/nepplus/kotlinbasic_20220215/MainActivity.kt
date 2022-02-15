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



            var myName = "카카로트"
            val friendName = "베지터"

            Toast.makeText(this, friendName, Toast.LENGTH_SHORT).show()
            Log.d("MainActivity",myName.toString())

            var myBirthYear = 1991

            var myHeight = 168.8

        }

        btnCondition.setOnClickListener {
//            조건문 연습

            val userAge = 16

//            사용자의 나이가 20살 이상? 맞으면 성인입니다. 토스트로
            if(userAge >= 20){
//                사용자 나이가 20살 이상일떄만 실행할 내용.
                Toast.makeText(this, "성인입니다.", Toast.LENGTH_SHORT).show()
            }
            else if (userAge >= 17){
                Toast.makeText(this, "고등학생 입니다.", Toast.LENGTH_SHORT).show()
            }
            else if (userAge >= 14){
                Toast.makeText(this, "중학생 입니다.", Toast.LENGTH_SHORT).show()
            }
            else if (userAge >= 8){
                Toast.makeText(this, "초등학생 입니다.", Toast.LENGTH_SHORT).show()
            }
            else {
//                위에 질몬이 틀렸을때만 실행할 내용
                Toast.makeText(this, "미취학 아동 입니다.", Toast.LENGTH_SHORT).show()
            }

        }
        btnCondition2.setOnClickListener {

//            회사 상황
            val salary = 3600
            val minutes = 50
            val overwork = true
//            취업 조건.
//            1. 연봉 3000이상 AND 출퇴시간 30분 이내

            if(salary >= 3000 && minutes < 30){
                Log.d("조건문2", "연봉과, 거리 모두 OK")
            }
//            2. 연봉 3500이상 OR 출퇴근시간 10분 이내
            if (salary >= 3500 || minutes < 10){
                Log.d("조건문2", "연봉이나 거리 중 하나 Ok")
            }
//            3. 야근만 한하면 됨
            if (!overwork){
                Log.d("조건문2", "야근을 안해야 OK")
            }
//            4. 연봉은 2800이상 AND 출퇴근시간 30분이내 AND 야근도 없어야.
            if (salary >= 2800 && minutes < 30 && !overwork){
                Log.d("조건문2","연봉/거리/야근여부 모두 만족.")
            }
        }
    }
}