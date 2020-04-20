/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummycex;

import java.util.Date;

/**
 *
 * @author Gab
 */
public class Message 
{
    /**
     * The author of the message
     */
    String  author  =   null;
    /**
     * The content of the message
     */
    String  content =   null;
    /**
     * The date when the message was created
     */
    Date    date    =   new Date();

    
    /**
     * 
     * @return the author of the content
     */
    public String getAuthor() {
        return this.author;
    }
    /**
     * @return true (The value has no semantic value, it is used only to avoid returning nulls). If the parameter is either null or empty, its value will be set to "Anonymous"
    */
    public Boolean setAuthor(String a) {
        if((author == null) || (author.isEmpty()))
            this.author =   a;
        return null;
    }
    
    /**
     * 
     * @return the content of the Message
     */
    public String getContent() {
        return this.content;
    }

    /**
     * 
     * @param content, the content of the message, the parameter content is null or empty, the content is set to "Undefined"
     * @return true (The value has no semantic value, it is used only to avoid returning nulls)
      */
    public Boolean setContent(String c) {
        if((content == null) || (content.isEmpty()))
            this.content =   c;
        return null;
    }

    @Override
    public String toString() {
        return "Message{" + "author=" + author + ", content=" + content + ", date=" + date + '}';
    }



}
