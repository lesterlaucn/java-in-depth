package com.tenstone.leet.patterns.action.visitor;

import java.util.Iterator;

/**
 * Created by liuyuancheng on 2022/1/4  <br/>
 *
 * @author liuyuancheng
 */
public abstract class Entry implements Element {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) {
        throw new FileTreatmentException();
    }

    public Iterator iterator() {
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }

}
