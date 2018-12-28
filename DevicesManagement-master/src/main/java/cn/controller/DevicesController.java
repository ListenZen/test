package cn.controller;

import cn.entity.Devices;
import cn.entity.Repair;
import cn.service.DevicesService;
import cn.service.RepairService;
import cn.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DevicesController {
    @Resource
    private DevicesService devicesService;
    @Resource
    private RepairService repairService;

    @RequestMapping("/devices.do")
    public String findAll(@RequestParam(required = false,defaultValue = "1")Integer pageNo, Devices devices, Model model){
        Integer countTotal = devicesService.count(devices);
        PageBean pageBean = new PageBean(pageNo,3,countTotal);
        List<Devices> list = devicesService.findAll(devices,pageBean);
        model.addAttribute("deviceName",devices.getDeviceName());
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("devices",list);
        return "devices";
    }

    @RequestMapping("/repair.do")
    public String findById(Integer id,Model model){
        Devices devices = devicesService.findById(id);
        List<Repair> list = repairService.findById(id);
        model.addAttribute("device",devices);
        model.addAttribute("repair",list);
        return "repair";
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public Repair addRepair(Repair repair){
        Repair r = repairService.addRepair(repair);
        return r;
    }
}
