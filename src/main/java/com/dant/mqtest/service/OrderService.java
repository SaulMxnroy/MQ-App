/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dant.mqtest.service;

import com.dant.mqtest.model.OrderRequest;
import com.dant.mqtest.model.OrderResponse;
/**
 *
 * @author dantl
 */
public interface OrderService {
    OrderRequest sendMessage(OrderRequest request);
    OrderResponse readMessage(); 
}
