package com.michaelliu.kotlin.module.me.livedata;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.persistence.room.RoomDatabase;
import com.michaelliu.kotlin.db.DBRoom;
import com.michaelliu.kotlin.db.entity.User;
import java.util.List;

/**
 * Description:
 *
 * Created by liuguoquan on 2018/1/19 09:37.
 */

public class UserViewModel extends ViewModel {

  public LiveData<List<User>> getUsers() {
    return null;
  }
}
