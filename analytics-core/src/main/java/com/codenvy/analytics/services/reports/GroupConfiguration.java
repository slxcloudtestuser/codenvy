/*
 * CODENVY CONFIDENTIAL
 * __________________
 *
 *  [2012] - [2014] Codenvy, S.A.
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Codenvy S.A. and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Codenvy S.A.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Codenvy S.A..
 */
package com.codenvy.analytics.services.reports;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/** @author <a href="mailto:areshetnyak@codenvy.com">Alexander Reshetnyak</a> */
@XmlRootElement(name = "group")
public class GroupConfiguration {

    private String                   name;
    private String                   description;
    private InitializerConfiguration initializer;

    @XmlElement(name = "initializer")
    public void setInitializer(InitializerConfiguration initializer) {
        this.initializer = initializer;
    }

    public InitializerConfiguration getInitializer() {
        return initializer;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "description")
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}