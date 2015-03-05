/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.its360.incareer.web.page;

import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import ru.its360.incareer.model.news.CRUDService;
import ru.its360.incareer.model.news.News;
import ru.its360.incareer.model.news.NewsService;

/**
 *
 * @author Ильдар
 */
@Named("news")
@ConversationScoped
@URLMappings(mappings = {
    @URLMapping(id = "news", pattern = "/news", viewId = "/pages/news/news.xhtml"),
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

    @Inject
    private Conversation conversation;

    @Override
    protected CRUDService<News> getService() {
        return newsService;
    }

    @Override
    protected Conversation getConversation() {
        return conversation;
    }

    @Override
    protected String getUniqueRouteKey() {
        return "news";
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

    

}
