/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.its360.incareer.web.page.news;

import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;
import ru.its360.incareer.model.news.CRUDService;
import ru.its360.incareer.model.news.News;
import ru.its360.incareer.model.news.NewsService;
import ru.its360.incareer.model.news.Tag;
import ru.its360.incareer.web.page.AbstractCRUDController;

/**
 *
 * @author Ильдар
 */
@Named("news")
@Scope("conversation.manual")
@URLMappings(mappings = {
    @URLMapping(id = "news", pattern = "/news", viewId = "/pages/news/list.xhtml"),
    @URLMapping(id = "new_news",parentId = "news", pattern = "/new", viewId = "/pages/news/create.xhtml"),
    @URLMapping(
            id = "edit_news",
            parentId = "news",
            pattern = "/edit/#{id: news.id}",
            viewId = "/pages/news/edit.xhtml"),
    @URLMapping(
            id = "view_news",
            parentId = "news",
            pattern = "/#{id: news.id}",
            viewId = "/pages/news/view.xhtml")
})
public class NewsController extends AbstractCRUDController<News> {

    @Inject
    private NewsService newsService;

    private int count = 0;
    
    
    public void incrementCount() {
        ++count;
    }
    
    

    @Override
    protected CRUDService<News> getService() {
        return newsService;
    }


    @Override
    protected String getURLKey() {
        return "news";
    }

    public void attachTag() {
        if(getCurrent() != null) {
            getCurrent().getTags().add(new Tag());
        }
    }
    
    
    @URLAction(mappingId = "news", onPostback = false)
    @Override
    public void prepareList() {
        super.prepareList();
    }
    
    @URLAction(mappingId = "new_news", onPostback = false)
    @Override
    public void prepareCreate() {
        super.prepareCreate();
    }

    @URLAction(mappingId = "view_news", onPostback = false)
    @Override
    public void prepareView() {
        super.prepareView();
    }

    @URLAction(mappingId = "edit_news", onPostback = false)
    @Override
    public void prepareEdit() {
        super.prepareEdit();
    }

    public int getCount() {
        return count;
    }

    

}
