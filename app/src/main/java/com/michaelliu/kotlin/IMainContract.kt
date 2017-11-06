package com.michaelliu.kotlin

import com.mdroid.PausedHandler
import com.michaelliu.kotlin.base.AppBaseActivityPresenter
import com.michaelliu.kotlin.base.AppBaseView
import com.trello.rxlifecycle2.LifecycleProvider
import com.trello.rxlifecycle2.android.ActivityEvent

/**
 * Description:
 *
 * Created by liuguoquan on 2017/11/3 17:14.
 */
interface IMainContract {
  interface IMainView : AppBaseView<IMainContract.IMainPresenter> {

  }

  abstract class IMainPresenter(mProvider: LifecycleProvider<ActivityEvent>,
      mHandler: PausedHandler) : AppBaseActivityPresenter<IMainView>(mProvider, mHandler) {
    abstract fun query()
  }
}