/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.its360.incareer.web.page;

import java.io.Serializable;
import org.apache.myfaces.orchestra.conversation.Conversation;

/**
 * @organization ITS360
 * @author Ildar Gafarov badprogrammist@gmail.com
 */
public abstract class AbstractController implements Serializable {
    
    
    
    
    protected Conversation getConversation() {
        return Conversation.getCurrentInstance();
    }
    
    

    public void endConversation() {
        getConversation().invalidate();
    }
    
    
    
}
