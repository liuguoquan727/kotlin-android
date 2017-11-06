package com.michaelliu.kotlin

import com.mdroid.lib.recyclerview.BaseRecyclerViewAdapter
import com.mdroid.lib.recyclerview.BaseViewHolder

/**
 * Description:
 *
 * Created by liuguoquan on 2017/11/3 16:52.
 */
class MainAdapter(var titles: MutableList<String>) : BaseRecyclerViewAdapter<String>(
    R.layout.list_item_main, titles) {

  override fun convert(holder: BaseViewHolder?, item: String?) {
    holder?.setText(R.id.content, item)
  }
}