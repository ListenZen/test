package cn.mapper;

import cn.entity.Devices;
import cn.util.PageBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DevicesMapper {
    //查询所有，分页，模糊查询
    public List<Devices> findAll(@Param("devices") Devices devices, @Param("pageBean") PageBean pageBean);

    //查询记录数
    public Integer count(Devices devices);

    //根据id查询
    @Select("select * from devices where id=#{id}")
    public Devices findById(Integer id);
}
