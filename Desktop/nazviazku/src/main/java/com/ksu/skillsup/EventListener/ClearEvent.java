/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ksu.skillsup.EventListener;

import com.ksu.skillsup.Model.Contact;
import org.springframework.context.ApplicationEvent;

/**
 *
 * @author stoxa
 */
public class ClearEvent  extends ApplicationEvent {
    
    Contact deletedContact;

    public ClearEvent(Object source, Contact deletedContact) {
        super(source);
        this.deletedContact=deletedContact;
    }

    @Override
    public String toString() {
    return deletedContact.toString();
    }
}
