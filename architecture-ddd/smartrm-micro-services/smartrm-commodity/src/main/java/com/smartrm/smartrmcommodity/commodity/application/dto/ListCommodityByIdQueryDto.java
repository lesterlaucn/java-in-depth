package com.smartrm.smartrmcommodity.commodity.application.dto;

import java.util.List;

/**
 * @author: liuyuancheng
 * @description:
 */
public class ListCommodityByIdQueryDto {

  private List<String> ids;

  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }
}
