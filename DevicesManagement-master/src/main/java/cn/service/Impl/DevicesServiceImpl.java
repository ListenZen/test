package cn.service.Impl;

import cn.entity.Devices;
import cn.mapper.DevicesMapper;
import cn.service.DevicesService;
import cn.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("devicesService")
public class DevicesServiceImpl implements DevicesService {
    @Resource
    private DevicesMapper devicesMapper;

    @Override
    public List<Devices> findAll(Devices devices, PageBean pageBean) {
        return devicesMapper.findAll(devices,pageBean);
    }

    @Override
    public Integer count(Devices devices) {
        return devicesMapper.count(devices);
    }

    @Override
    public Devices findById(Integer id) {
        return devicesMapper.findById(id);
    }
}
