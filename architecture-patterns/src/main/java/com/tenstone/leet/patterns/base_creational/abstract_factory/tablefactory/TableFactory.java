package com.tenstone.leet.patterns.base_creational.abstract_factory.tablefactory;

import com.tenstone.leet.patterns.base_creational.abstract_factory.factory.Factory;
import com.tenstone.leet.patterns.base_creational.abstract_factory.factory.Link;
import com.tenstone.leet.patterns.base_creational.abstract_factory.factory.Page;
import com.tenstone.leet.patterns.base_creational.abstract_factory.factory.Tray;

/**
 * Created by liuyuancheng on 2021/7/15  <br/>
 */
public class TableFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title,author);
    }
}
