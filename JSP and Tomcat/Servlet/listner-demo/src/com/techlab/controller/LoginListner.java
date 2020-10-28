package com.techlab.controller;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class LoginListner implements HttpSessionAttributeListener {

    public LoginListner() {
    }

    public void attributeAdded(HttpSessionBindingEvent e)  {
    	System.out.println("New user added");
    }

    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
    }

    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
    }
}
