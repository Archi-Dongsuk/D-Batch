package io.dongsuk.dbatch.common.batch;

import io.dongsuk.dbatch.job.sample.testJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class TestCronTrigger {

    @Autowired
    private SchedulerFactoryBean schedulerFactoryBean;

    private SchedulerFactory schedulerFactory;
    private Scheduler scheduler;

    public void createScheduler() throws SchedulerException {
        schedulerFactory = new StdSchedulerFactory();
        //scheduler = schedulerFactory.getScheduler();
        scheduler = schedulerFactoryBean.getScheduler();

        JobDetail job = JobBuilder.newJob(testJob.class).withIdentity("testJob").build();


        Trigger trigger = TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule("15 * * * * ?")).build();

        scheduler.scheduleJob(job, trigger);

    }
}