/********************************************************************************************
* Copyright (C) 2015 Acoustic, L.P. All rights reserved.
*
* NOTICE: This file contains material that is confidential and proprietary to
* Acoustic, L.P. and/or other developers. No license is granted under any intellectual or
* industrial property rights of Acoustic, L.P. except as may be provided in an agreement with
* Acoustic, L.P. Any unauthorized copying or distribution of content from this file is
* prohibited.
********************************************************************************************/
package com.ibm.tealeaf.aurora.tagging;

import java.util.ArrayList;
import java.io.Serializable;

import com.ibm.tealeaf.aurora.AuroraListItem;

/**
 * 
 * @author Sohil Shah (sohishah@us.ibm.com)
 * 
 */
public final class TagSession implements Serializable {
    private static final long serialVersionUID = 5563398114773796000L;

    private static TagSession singleton = null;

    private String customerId;
    private String orderSubtotal;
    private ArrayList<AuroraListItem> cartItems;
    private String city;
    private String state;
    private String zip;

    private TagSession() {

    }

    public static TagSession getInstance() {
        if (singleton == null) {
            synchronized (TagSession.class) {
                if (singleton == null) {
                    singleton = new TagSession();
                }
            }
        }
        return singleton;
    }

    public void startNewSession() {
        this.customerId = null;
        this.orderSubtotal = null;
        this.cartItems = null;
        this.city = null;
        this.state = null;
        this.zip = null;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOrderSubtotal() {
        return orderSubtotal;
    }

    public void setOrderSubtotal(String orderSubtotal) {
        this.orderSubtotal = orderSubtotal;
    }

    public ArrayList<AuroraListItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(ArrayList<AuroraListItem> cartItems) {
        this.cartItems = cartItems;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
