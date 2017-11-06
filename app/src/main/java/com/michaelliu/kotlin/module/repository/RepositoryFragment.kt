package com.michaelliu.kotlin.module.repository

import android.os.Bundle
import android.view.View
import com.mdroid.lib.core.base.BaseFragment
import com.mdroid.lib.core.base.BasePresenter
import com.mdroid.lib.core.base.Status
import com.mdroid.lib.core.base.Status.STATUS_NORMAL
import com.mdroid.lib.core.utils.UIUtil
import com.michaelliu.kotlin.R
import com.michaelliu.kotlin.utils.CommonUtils
import kotlinx.android.synthetic.main.fragment_repository.tablayout
import kotlinx.android.synthetic.main.fragment_repository.tool_bar
import kotlinx.android.synthetic.main.fragment_repository.viewpager
import java.util.Arrays

/**
 * Description:
 *
 * Created by liuguoquan on 2017/11/6 10:34.
 */
class RepositoryFragment : BaseFragment<Any, BasePresenter<Any>>() {

  override fun getContentView(): Int {
    return R.layout.fragment_repository
  }

  override fun getPageTitle(): String {
    return "仓库"
  }

  override fun getCurrentStatus(): Status {
    return STATUS_NORMAL
  }

  override fun initPresenter(): BasePresenter<Any>? {
    return null
  }

  override fun initData(savedInstanceState: Bundle?) {
  }

  override fun initView(parent: View?) {
    mContentContainer.setPadding(0, statusBarHeight, 0, 0)
    toolBarContainer.visibility = View.GONE
    var textVew = UIUtil.setCenterTitle(tool_bar, pageTitle)
    CommonUtils.updateTitleText(textVew)
    val titles = Arrays.asList(*resources.getStringArray(R.array.category))
    viewpager.adapter = RepositoryAdapter(childFragmentManager, titles)
    tablayout.setupWithViewPager(viewpager)
  }


}