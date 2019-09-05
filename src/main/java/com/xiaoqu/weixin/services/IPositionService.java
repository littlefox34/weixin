package com.xiaoqu.weixin.services;

import com.xiaoqu.weixin.models.Position;

import java.util.List;

public interface IPositionService {
    List<Position> getListByEmpno(String userid);
}
