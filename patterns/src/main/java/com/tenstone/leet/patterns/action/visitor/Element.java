package com.tenstone.leet.patterns.action.visitor;

/**
 * Created by liuyuancheng on 2022/1/4  <br/>
 *
 * @author liuyuancheng
 */
public interface Element {
    public abstract void accept(Visitor visitor);
}
