package com.michaelliu.kotlin

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.mdroid.lib.core.base.BaseActivity
import com.mdroid.lib.core.base.Status
import com.mdroid.lib.core.base.Status.STATUS_NORMAL
import com.michaelliu.kotlin.IMainContract.IMainPresenter
import kotlinx.android.synthetic.main.activity_main.recyclerView
import kotlinx.android.synthetic.main.activity_main.text_title

class MainActivity : BaseActivity<IMainContract.IMainView, IMainContract.IMainPresenter>() {

  private var mTitles: ArrayList<String> = ArrayList()

  override fun initPresenter(): IMainPresenter {
    return MainPresenter(mLifecycleProvider,handler)
  }

  override fun getContentView(): Int {
    return R.layout.activity_main
  }

  override fun getPageTitle(): String {
    return ""
  }

  override fun getCurrentStatus(): Status {
    return STATUS_NORMAL
  }

  override fun initData(savedInstanceState: Bundle?) {
    text_title.text = "Hello Kotlin"
    text_title.setOnClickListener {
      toastMsg("hello")
    }
    text_title.setOnLongClickListener { v ->
      println(v.id)
      return@setOnLongClickListener true
    }
    for (i in 0..5) {
      mTitles.add("liu" + i)
    }
    recyclerView.layoutManager = LinearLayoutManager(this)
    var adapter = MainAdapter(mTitles)
    recyclerView.adapter = adapter
  }
  fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, length).show()
  }
}
