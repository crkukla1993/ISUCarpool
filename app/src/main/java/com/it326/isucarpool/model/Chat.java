package com.it326.isucarpool.model;

import java.util.ArrayList;

/**
 * Created by Tim on 10/31/16.
 */

public class Chat
{
    private ArrayList<String> messages;
    private String id;

    public Chat(String input, String username) {
        this.messages = new ArrayList<String>();
        messages.add(input);
        id = username;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<String> messages) {
        this.messages = messages;
    }
}
