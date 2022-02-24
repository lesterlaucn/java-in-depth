package com.smartrm.smartrmtrade.trade.infrastructure.mapper;

import com.smartrm.smartrmtrade.trade.infrastructure.dataobject.TradeCabinetVendingMachineDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author: liuyuancheng
 * @description:
 */
@Mapper
public interface TradeCabinetVendingMachineMapper {

  @Select({"select * from trade_cabinet_vending_machine where machine_id=#{machineId}"})
  TradeCabinetVendingMachineDo selectOne(long machineId);

  @Update({
      "update trade_cabinet_vending_machine set `state` = #{state}, cur_user_open_id = #{curUserOpenId} where machine_id=#{machineId}"})
  void update(TradeCabinetVendingMachineDo machine);
}
