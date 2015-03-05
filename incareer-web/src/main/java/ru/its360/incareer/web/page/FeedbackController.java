/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.its360.incareer.web.page;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;

/**
 *
 * @author Ильдар
 */
@Named("feedback")
@RequestScoped
//@URLMapping(id = "feedback", pattern = "/feedback", viewId = "/pages/feedback.xhtml")
@Join(path = "/feedback", to="/pages/feedback.xhtml")
public class FeedbackController implements Serializable {
    
    private String status = "none";
    
    public String getStatus() {
        return status;
    }
    
//    @URLAction
    @RequestAction
    public void init() {
        status = "init";
    }
    
}
