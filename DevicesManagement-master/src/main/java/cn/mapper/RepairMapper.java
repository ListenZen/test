package cn.mapper;

import cn.entity.Repair;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RepairMapper {
    //根据id查看信息
    @Select("select * from repair where deviceId=#{deviceId}")
    public List<Repair> findById(Integer deviceId);

    //添加维修信息
    @Insert("insert into repair(repairRecord,repairTime,deviceId) values(#{repairRecord},#{repairTime},#{deviceId})")
    public Integer addRepair(Repair repair);
}
