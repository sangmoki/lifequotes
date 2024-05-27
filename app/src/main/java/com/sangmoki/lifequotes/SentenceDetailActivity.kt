package com.sangmoki.lifequotes

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sangmoki.lifequotes.databinding.ActivityMainBinding
import com.sangmoki.lifequotes.databinding.ActivitySentenceDetailBinding

class SentenceDetailActivity : AppCompatActivity(){

    private lateinit var binding : ActivitySentenceDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sentence)

        // DataBinding을 사용하여 레이아웃 설정 및 바인딩 초기화
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sentence_detail)

        // 받아온 데이터 변수에 담기
        val intent = intent
        val sentence = intent.getStringExtra("sentence")

        // 받아온 데이터를 TextView에 보여주기
        binding.sentenceDetailView.setText(sentence)

        // 전체 명언 보기 버튼 클릭 시 SentenceActivity로 이동
        // 액티비티 이동 시 이벤트 발생
        binding.showAllSentenceBtn.setOnClickListener {
            var intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }

    }
}