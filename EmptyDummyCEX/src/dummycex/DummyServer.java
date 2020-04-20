/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummycex;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Gab
 */
public class DummyServer 
{
    /**
     *
     * @return the Integer Value 1.0 if the server is connected
     */
    public Integer isConnected() {
        return null;
    }

    /**
     *
     * @param x1 the first Double Value
     * @param x2 the second Double Value
     * @return the maximum between x1 and x2
     */
    public Double getMaximumBetween(Double x1, Double x2) {
        return null;
    }

    /**
     *
     * @param x1 the first Double Value
     * @param x2 the second Double Value
     * @return the maximum between x1 and x2
     * @throws Exception if any of the arguments is null
     */
    public Double getMaximumBetweenWithException(Double x1, Double x2) throws Exception {
        return null;
    }

    /**
     *
     * @param v the value to be added
     * @return true (The value has no semantic value, it is used only to avoid
     * returning nulls)
     */
    public Boolean addValue(Integer v) {
        return null;
    }

    /**
     *
     * @return the average of all the values
     */
    public Integer getMinumumValue() {
        return null;
    }

    /**
     *
     * @param m the message content length must be returned
     * @return the message content length
     */
    public Integer getMessageContentLength(Message m) {
        return null;
    }

    /**
     *
     * @param m1 the message to be added to the server
     * @return True (The value has no semantic value, it is used only to avoid
     * returning nulls)
     */
    public Boolean addMessage(Message m1) {
        return null;
    }

    /**
     *
     * @param author
     * @return the list of complete messages (not just the content) posted by
     * the specified author
     */
    public ArrayList<Message> getAllMessagesBy(String author) {
        return null;
    }
}
