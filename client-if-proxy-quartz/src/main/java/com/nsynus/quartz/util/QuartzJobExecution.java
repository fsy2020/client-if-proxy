package com.nsynus.quartz.util;

import org.quartz.JobExecutionContext;
import com.nsynus.quartz.domain.SysJob;

/**
 * 定时任务处理（允许并发执行）
 * 
 * @author nsynus
 *
 */
public class QuartzJobExecution extends AbstractQuartzJob
{
    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception
    {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
