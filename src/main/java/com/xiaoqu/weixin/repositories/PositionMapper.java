package com.xiaoqu.weixin.repositories;

import com.xiaoqu.weixin.models.Position;

import java.util.List;

public interface PositionMapper {
    int insert(Position record);

    int insertSelective(Position record);

    List<Position> selectByEmpno(String userid);
}