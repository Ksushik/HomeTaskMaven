/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ksu.skillsup.EventListener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author ksu
 */

@Component
public class DeleteContactListener implements ApplicationListener<ClearEvent> {

    @Override
    public void onApplicationEvent(ClearEvent event) {
        System.out.println("Контакт " + event.toString() + " был удалён");
    }
    
}
