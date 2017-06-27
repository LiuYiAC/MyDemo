package com.liuyi.rxjava2;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by LiuYi on 17/6/27.
 * description
 */

public interface Api {
    @GET("v2/movie/top250?start=0&count=50")
    Observable<MoveListBean> getMoveListBean();
}
