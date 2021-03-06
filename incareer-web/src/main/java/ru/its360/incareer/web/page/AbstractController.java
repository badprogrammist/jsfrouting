/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.its360.incareer.web.page;

import java.io.Serializable;
import java.util.UUID;
import javax.enterprise.context.Conversation;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import org.ocpsoft.rewrite.annotation.Parameter;
import ru.its360.incareer.model.news.CRUDService;

/**
 * @organization ITS360
 * @author Ildar Gafarov badprogrammist@gmail.com
 */
public abstract class AbstractController<E> implements Serializable {
    
    private E current;
    
    @Parameter
    private String id;
    
    protected abstract CRUDService<E> getService();
    protected abstract Conversation getConversation();
    
    public void validateIdParameter(FacesContext context, UIComponent component, Object value) {
        if(value != null) {
            try {
                String id = (String)value;
                UUID.fromString(id);
            } catch (Exception ex) {
                throw new ValidatorException(new FacesMessage(ex.toString()));
            }
        }
    }
    
    public void beginConversation() {
        if (getConversation().isTransient()) {
            getConversation().begin();
        }
    }

    public void endConversation() {
        if (!getConversation().isTransient()) {
            getConversation().end();
        }
    }
    
    public E getCurrent() {
        return current;
    }

    public void setCurrent(E current) {
        this.current = current;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
