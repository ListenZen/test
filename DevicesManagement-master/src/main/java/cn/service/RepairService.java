package cn.service;

import cn.entity.Repair;

import java.util.List;

public interface RepairService {
    //根据id查看信息
    public List<Repair> findById(Integer deviceId);

    //添加维修信息
    public Repair addRepair(Repair repair);
}
