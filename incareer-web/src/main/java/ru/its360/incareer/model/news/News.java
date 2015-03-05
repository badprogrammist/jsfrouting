/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.its360.incareer.model.news;

import java.io.Serializable;
import java.util.UUID;

/**
 * @organization ITS360
 * @author Ildar Gafarov badprogrammist@gmail.com
 */
public class News implements Serializable {
    private UUID uuid;
    private String content;

    public News(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
    
}
