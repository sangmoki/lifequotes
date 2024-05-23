package com.sangmoki.lifequotes

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.sangmoki.lifequotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // String 타입 하나만을 가진 리스트 생성
        var sentenceList = mutableListOf<String>()

        // 리스트에 명언 추가
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.")
        sentenceList.add("사람에게 하나의 입과 두 개의 귀가 있는 것은 말하기보다 듣기를 두 배로 하라는 뜻이다.")
        sentenceList.add("결점이 없는 친구를 사귀려고 한다면 평생 친구를 가질 수 없을 것이다.")
        sentenceList.add("자기 아이에게 육체적 노동을 가르치지 않는 것은 약탈과 강도를 가르치는 것과 마찬가지다.")
        sentenceList.add("승자는 눈을 밟아 길을 만들지만 패자는 눈이 녹기를 기다린다.")
        sentenceList.add("두 개의 화살을 갖지 마라. 두 번째 화살이 있기 때문에 첫 번째 화살에 집중하지 않게 된다.")
        sentenceList.add("그 사람 입장에 서기 전까지 절대 그 사람을 욕하거나 책망하지 마라.")
        sentenceList.add("뛰어난 말에게도 채찍이 필요하다.")

        // DataBinding을 사용하여 레이아웃과 연결
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // 전체 명언 보기 버튼 클릭 시 SentenceActivity로 이동
        binding.showAllSentenceBtn.setOnClickListener {
            var intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }

        // 명언 텍스트뷰에 랜덤으로 선택된 명언을 보여줌
        binding.sentenceTextView.setText(sentenceList.random())

    }
}