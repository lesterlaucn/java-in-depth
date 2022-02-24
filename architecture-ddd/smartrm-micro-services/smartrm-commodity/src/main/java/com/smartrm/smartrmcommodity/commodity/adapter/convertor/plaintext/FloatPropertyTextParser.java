package com.smartrm.smartrmcommodity.commodity.adapter.convertor.plaintext;

import com.smartrm.smartrmcommodity.commodity.adapter.convertor.CommodityPropertyParser;
import com.smartrm.smartrmcommodity.commodity.infrastructure.CommodityError;
import com.smartrm.infracore.exception.DomainException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * @author: liuyuancheng
 * @description:
 */
public class FloatPropertyTextParser implements
    CommodityPropertyParser<Double, String> {

  @Override
  public Double parse(String content) {
    if (StringUtils.isBlank(content)) {
      return null;
    }

    try {
      return NumberUtils.createDouble(content);
    } catch (NumberFormatException e) {
      throw new DomainException(CommodityError.CommodityParseError);
    }
  }
}
