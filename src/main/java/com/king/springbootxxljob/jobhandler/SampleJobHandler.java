package com.king.springbootxxljob.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

import static com.xxl.job.core.biz.model.ReturnT.SUCCESS;

@Component
public class SampleJobHandler {
    @XxlJob("sampleJobHandler")
    public ReturnT<String> sampleJobHandler() throws Exception {
        XxlJobHelper.log("test-xxl-job>>param:" + XxlJobHelper.getJobParam());
        int i = 1 / 0;
        return SUCCESS;
    }
}
