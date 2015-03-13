/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.its360.incareer.web.page.count;

import com.ocpsoft.pretty.faces.annotation.URLMapping;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;
import ru.its360.incareer.web.page.AbstractController;
import ru.its360.incareer.web.page.Navigation;

/**
 *
 * @author Ильдар
 */
@Named("count")
@Scope("conversation.manual")
@URLMapping(id = "count", pattern = "/count", viewId = "/pages/count/count.xhtml")
public class CountController extends AbstractController {

    private int count = 0;
    
    public void incrementCount() {
        ++count;
    }

    public String gotoCount() {
        return Navigation.getURL("count");
    }

    public int getCount() {
        return count;
    }

    

}
