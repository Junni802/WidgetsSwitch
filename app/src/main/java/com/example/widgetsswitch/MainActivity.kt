package com.example.widgetsswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.example.widgetsswitch.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
	val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
	val listener by lazy{
		CompoundButton.OnCheckedChangeListener { btnCom, chk ->
			if(chk){
				when(btnCom.id) {
					R.id.switch1 -> Log.d("switch", "스위치1을 선택하셨습니다.")
					R.id.switch2 -> Log.d("switch", "스위치2을 선택하셨습니다.")
					R.id.switch3 -> Log.d("switch", "스위치3을 선택하셨습니다.")
				}
			}else {
				when(btnCom.id) {
					R.id.switch1 -> Log.d("switch", "스위치1을 해제하셨습니다.")
					R.id.switch2 -> Log.d("switch", "스위치2을 해제하셨습니다.")
					R.id.switch3 -> Log.d("switch", "스위치3을 해제하셨습니다.")
				}
			}
		}
	}
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		binding.switch1.setOnCheckedChangeListener(listener)
		binding.switch2.setOnCheckedChangeListener(listener)
		binding.switch3.setOnCheckedChangeListener(listener)

	}
}