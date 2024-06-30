package com.sangmoki.lifequotes

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sentence)

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
        sentenceList.add("가는 말이 고와야 오는 말도 곱다.")
        sentenceList.add("내일은 내일의 태양이 뜬다.")
        sentenceList.add("피할수 없으면 즐겨라.")
        sentenceList.add("마음만을 가지고 있어서는 안된다. 반드시 실천하여야 한다.")
        sentenceList.add("최고에 도달하려면 최저에서 시작하라.")

        // sentenceList를 ListViewAdapter에 연결
        val sentenceAdapter = ListViewAdapter(sentenceList)

        // ListView에 Adapter 연결
        val listview = findViewById<ListView>(R.id.sentenceListView)
        listview.adapter = sentenceAdapter

        // ListView의 아이템 클릭 시 SentenceDetailActivity로 이동
        listview.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, SentenceDetailActivity::class.java)
            intent.putExtra("sentence", sentenceList[position])
            startActivity(intent)
        }

    }
}