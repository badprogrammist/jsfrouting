/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.its360.incareer.web.page;

import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Ильдар
 */
@Named("feedback")
@RequestScoped
@URLMapping(id = "feedback", pattern = "/feedback", viewId = "/pages/feedback.xhtml")
public class FeedbackController implements Serializable {
    
    private String status = "none";
    
    public String getStatus() {
        return status;
    }
    
    @URLAction
    public void init() {
        status = "init";
    }
    
}
