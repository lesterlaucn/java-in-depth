package com.smartrm.smartrmcommodity.commodity.adapter.convertor.plaintext;

import com.smartrm.smartrmcommodity.commodity.adapter.convertor.CommodityPropertyParser;
import org.apache.commons.lang3.StringUtils;

/**
 * @author: liuyuancheng
 * @description:
 */
public class StringPropertyTextParser implements
    CommodityPropertyParser<String, String> {

  @Override
  public String parse(String content) {
    return StringUtils.trimToNull(content);
  }
}
