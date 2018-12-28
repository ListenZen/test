package cn.test;

import cn.entity.Devices;
import cn.service.Impl.DevicesServiceImpl;
import cn.util.PageBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DevicesTest {
    @Test
    public void testFindAll(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
        DevicesServiceImpl devicesService = (DevicesServiceImpl)context.getBean("devicesService");
        Devices devices = new Devices();
        devices.setDeviceName("");
        List<Devices> list = devicesService.findAll(devices,new PageBean(1,3,3));
        for(Devices d:list){
            System.out.println(d.getDeviceName());
        }
    }
}
