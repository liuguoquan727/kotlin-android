package com.michaelliu.kotlin

import com.mdroid.PausedHandler
import com.trello.rxlifecycle2.LifecycleProvider
import com.trello.rxlifecycle2.android.ActivityEvent

/**
 * Description:
 *
 * Created by liuguoquan on 2017/11/3 17:22.
 */
class MainPresenter(mProvider: LifecycleProvider<ActivityEvent>,
    mHandler: PausedHandler) : IMainContract.IMainPresenter(mProvider, mHandler) {
  override fun query() {
    var mCondition = MainCondition()
    mCondition.q = "language:java"
    mCondition.sort = "stars"
    mCondition.order = "desc"
    mCondition.page = 1
    mCondition.limit = 10
//    Api.getSearchApi().search(mCondition.q, mCondition.sort, mCondition.order, mCondition.page,
//        mCondition.limit)
//        .subscribeOn(Schedulers.io()).observeOn(PausedHandlerScheduler.from(mHandler))
  }
}