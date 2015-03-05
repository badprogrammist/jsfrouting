/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.its360.incareer.web.page;

import javax.servlet.ServletContext;
import org.ocpsoft.rewrite.annotation.RewriteConfiguration;
import org.ocpsoft.rewrite.config.Configuration;
import org.ocpsoft.rewrite.config.ConfigurationBuilder;
import org.ocpsoft.rewrite.servlet.config.HttpConfigurationProvider;

/**
 * @organization ITS360
 * @author Ildar Gafarov badprogrammist@gmail.com
 */
@RewriteConfiguration
public class MappingConfigurationProvider extends HttpConfigurationProvider {

    @Override
    public Configuration getConfiguration(ServletContext t) {
        return ConfigurationBuilder.begin();
    }

    @Override
    public int priority() {
        return 0;
    }

}
