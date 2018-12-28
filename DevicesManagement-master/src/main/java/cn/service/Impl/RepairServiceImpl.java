package cn.service.Impl;

import cn.entity.Repair;
import cn.mapper.RepairMapper;
import cn.service.RepairService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service("repairService")
public class RepairServiceImpl implements RepairService {
    @Resource
    private RepairMapper repairMapper;

    @Override
    public List<Repair> findById(Integer deviceId) {
        return repairMapper.findById(deviceId);
    }

    @Override
    public Repair addRepair(Repair repair) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:MM:ss");
        String dataStr = simpleDateFormat.format(new Date());
        try {
            repair.setRepairTime(simpleDateFormat.parse(dataStr));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int flag = repairMapper.addRepair(repair);
        if(flag>0){
            return repair;
        }
        return null;
    }
}
