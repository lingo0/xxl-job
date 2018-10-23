package com.xxl.job.executor.service.lshTestDemo.testParentJob;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * com.xxl.job.executor.service.lshTestDemo.testParentJob
 *
 * @author lingshenghang
 * 2018/9/20
 */
@Component
@JobHandler(value="parentJob")
public class ParentJob extends IJobHandler {
    @Override
    public ReturnT<String> execute(String param) throws Exception {
        XxlJobLogger.log("parentJob Job is start");

        double i = Math.random();
        XxlJobLogger.log("parentJob id :" + i);
        TimeUnit.SECONDS.sleep(1);

        return new ReturnT<>(String.valueOf(i));
    }
}
