package com.epam;

import com.epam.observer.MusicVolumeChangerAdvisor;
import com.epam.subject.VolumeLevel;
import com.epam.subject.VolumeLevelStation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Nazar_Sheremeta on 2/11/14.
 */
public class Arena {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        VolumeLevelStation station = (VolumeLevelStation) ctx.getBean("levelDeviceStation");
        VolumeLevel level = (VolumeLevel) ctx.getBean("levelDevice");
        MusicVolumeChangerAdvisor metal = (MusicVolumeChangerAdvisor) ctx.getBean("MetalAdvisorObserver");
        MusicVolumeChangerAdvisor sadist = (MusicVolumeChangerAdvisor) ctx.getBean("SadisticAdvisorObserver");
        MusicVolumeChangerAdvisor lounge = (MusicVolumeChangerAdvisor) ctx.getBean("LoungeAdvisorObserver");
        MusicVolumeChangerAdvisor random = (MusicVolumeChangerAdvisor) ctx.getBean("RandomAdvisorObserver");
        station.registerObserver(metal);
        station.registerObserver(sadist);
        station.registerObserver(lounge);
        station.registerObserver(random);
        int volumeAmplifierLimit = 14;
        for(int i=0;i<volumeAmplifierLimit;i++){
            System.out.println("Current volume is : "+level.getInDbValue());
            level.setLevel(i*10L);
            station.notifyObserver();

        }

    }
}
