package com.michaelliu.kotlin.base;

import android.view.View;
import com.mdroid.lib.core.base.BaseFragment;
import com.mdroid.lib.core.eventbus.EventBusEvent;
import com.michaelliu.kotlin.R;

/**
 * Description：
 */
public abstract class AppBaseFragment<V extends AppBaseView, T extends AppBaseFragmentPresenter<V>>
    extends BaseFragment<V, T> implements EventBusEvent.INotify {

  protected View initErrorView() {
    View errorView = mInflater.inflate(R.layout.view_error, mContentContainer, false);
    setErrorView(errorView);
    return errorView;
  }

  @Override public void onDestroy() {
    super.onDestroy();
  }

  protected void showProcessDialog() {

  }

  protected void dismissProcessDialog() {

  }

  @Override public void onNotify(EventBusEvent event) {

  }
}
