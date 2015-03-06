/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.its360.incareer.web.page;

import java.util.List;
import java.util.UUID;

/**
 * @organization ITS360
 * @author Ildar Gafarov badprogrammist@gmail.com
 */
public abstract class AbstractCRUDController<E> extends AbstractController<E> {

    protected abstract String getURLKey();
    
    public void prepareCreate() {
        setCurrent(getService().createEmptyEntity());
    }
    
    public void prepareView() {
        initCurrentFromId();
    }
    
    public void prepareEdit() {
        beginConversation();
        initCurrentFromId();
    }
    
    public void prepareList() {
        endConversation();
    }
    
    public String gotoCreate() {
        return Navigation.getURL("new_"+getURLKey());
    }
    
    public String gotoRoot() {
        return Navigation.getURL(getURLKey());
    }
    
    public String gotoList() {
        return Navigation.getURL("list_"+getURLKey());
    }
    
    public String gotoView() {
        return Navigation.getURL("view_"+getURLKey());
    }
    
    public String gotoEdit() {
        return Navigation.getURL("edit_"+getURLKey());
    }
    
    public List<E> getAll() {
        return getService().getAll();
    }
    
    public String save() {
        if (getCurrent() != null) {
            getService().save(getCurrent());
            endConversation();
            return gotoList();
        }
        return "";
    }
    
    protected boolean initCurrentFromId() {
        if (getId() != null && !getId().isEmpty()) {
            try {
                UUID uuid = UUID.fromString(getId());
                setCurrent(getService().get(uuid));
                return true;
            } catch (Exception ex) {
                return false;
            }
        } else {
            return false;
        }
    }
}
