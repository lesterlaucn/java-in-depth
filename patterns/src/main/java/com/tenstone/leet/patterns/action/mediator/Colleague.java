package com.tenstone.leet.patterns.action.mediator;

/**
 * Created by liuyuancheng on 2022/1/9  <br/>
 *
 * @author liuyuancheng
 */
public interface Colleague {

    void setMediator(Mediator mediator);

    void setColleagueEnabled(boolean enabled);
}
