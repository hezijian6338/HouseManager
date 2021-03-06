package cn.service;

import cn.dto.*;
import cn.entity.FollowupHouse;
import cn.entity.HouseOwner;
import cn.entity.Housemsg;

import java.util.List;

/**
 * Created by ZLY on 2017-05-19.
 */
public interface HouseService {
    /**
     * 根据当前登录用户权限查询房源信息
     * @return
     */
    List<HouseList> findHouseByPermission();


    /**
     * 返回增加房源的主键
     * @param houseMessageAvailable
     * @return
     */
    String add(HouseMessageAvailable houseMessageAvailable);


    /**
     * 查找全部房源到房源列表
     * @return
     */
    List<HouseList> findAll();


    HouseMessageAvailable findById(String houseId);

    /**
     * 通过houseId查找所有跟进记录
     * @param houseId
     * @return
     */
    List<FollowupHouse> findFollowupByHouseId(String houseId);

    /**
     * 跟进字段的处理 id-》名称
     * @param followupHouses
     * @return
     */
    List<FollowUpHouseAvailable> followupHouseToFollowUpHouseAvailable(List<FollowupHouse> followupHouses);

    /**
     * 根据房号查询业主
     * @param houseId
     * @return
     */
    HouseOwner findHouseOwner(String houseId);

    /**
     * 增加业主信息
     * @param houseOwner
     * @return 业主id
     */
    int addHouseOwner(HouseOwner houseOwner);

    /**
     * 删除房源信息
     * @param houseId
     * @return
     */
    ResultData<Integer> deleteHouse(String houseId);
    /**
     * 修改房源的归属人（员工）
     * @param houseId
     * @param houseUserName1
     * @return 修改条数
     */
    int editHouseUser(String houseId, String houseUserName1);

    /**
     * 新增房源跟进信息
     * @param houseId
     * @param followupHouse
     * @return
     */
    int addHouseFollowup(String houseId, FollowupHouse followupHouse);

    /**
     * 删除房源跟进
     * @param followUpId
     * @return
     */
    int delFollowHouse(Long followUpId);

    /**
     * 增加钥匙
     * @param keyForm
     * @param houseId
     * @return
     */
    int addHouseKey(KeyForm keyForm, String houseId);
    /**
     * 根据房源查找房源钥匙
     * @param houseId
     * @return
     */
    List<KeyForm> findKeyByHouseId(String houseId);

    /**
     * 删除钥匙
     * @param keyId
     * @return
     */
    int delHouseKey(String keyId);

    /**
     * 编辑业主
     * @param houseOwner
     * @return
     */
    int editHouseOwener(HouseOwner houseOwner);

    /**
     * 房源编辑
     * @param
     * @param
     * @return
     */
    int editHouse(HouseMessageAvailable houseMessageAvailable);
}
