package com.zeroami.youliao.presenter;

import com.zeroami.commonlib.mvp.LBasePresenter;
import com.zeroami.commonlib.mvp.LMvpModel;
import com.zeroami.youliao.contract.MeContract;
import com.zeroami.youliao.model.IUserModel;
import com.zeroami.youliao.model.real.UserModel;

/**
 * <p>作者：Zeroami</p>
 * <p>邮箱：826589183@qq.com</p>
 * <p>描述：我的Presenter</p>
 */
public class MePresenter extends LBasePresenter<MeContract.View,IUserModel> implements MeContract.Presenter{
    public MePresenter(MeContract.View view) {
        super(view);
    }

    @Override
    protected IUserModel getRealModel() {
        return new UserModel();
    }

    @Override
    protected IUserModel getTestModel() {
        return null;
    }

    @Override
    public void doPersonalInfoAreaClick() {
        getMvpView().gotoPersonalInfo();
    }

    @Override
    public void doLogout() {
        getMvpModel().logout();
        getMvpView().gotoLogin();
    }
}
