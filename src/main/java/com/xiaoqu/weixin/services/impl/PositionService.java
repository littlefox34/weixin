package com.xiaoqu.weixin.services.impl;

import com.xiaoqu.weixin.models.Position;
import com.xiaoqu.weixin.repositories.PositionMapper;
import com.xiaoqu.weixin.services.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public List<Position> getListByEmpno(String userid) {
        return positionMapper.selectByEmpno(userid);
    }
}
