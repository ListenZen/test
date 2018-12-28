package cn.service;

import cn.entity.Devices;
import cn.util.PageBean;

import java.util.List;

public interface DevicesService {
    //查询所有，分页，模糊查询
    public List<Devices> findAll(Devices devices, PageBean pageBean);

    //查询记录数
    public Integer count(Devices devices);

    //根据id查询
    public Devices findById(Integer id);
}
