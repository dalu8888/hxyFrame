package com.hxy.demo.callBack;

import com.hxy.activiti.dto.ProcessTaskDto;
import org.springframework.stereotype.Component;

/**
 * 类的功能描述.
 *
 * @Auther hxy
 * @Date 2017/7/27
 */
@Component
public class ActCallBack {

    public void leaveBack(ProcessTaskDto processTaskDto){
        System.out.println("请假回调成功啦！！！！！！！");
    }

    public void declareBack(ProcessTaskDto processTaskDto){
        System.out.println("项目申请成功并且已在研究院库立项！！！！！！！");
    }
}
