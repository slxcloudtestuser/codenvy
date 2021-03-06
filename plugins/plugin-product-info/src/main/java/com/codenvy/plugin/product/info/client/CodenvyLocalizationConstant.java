/*
 *  [2012] - [2016] Codenvy, S.A.
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
package com.codenvy.plugin.product.info.client;

import com.google.gwt.i18n.client.Messages;


/**
 * Codenvy product information constant.
 *
 * @author Oleksii Orel
 */
public interface CodenvyLocalizationConstant extends Messages {

    @Key("codenvy.tab.title")
    String codenvyTabTitle();

    @Key("codenvy.tab.title.with.workspace.name")
    String codenvyTabTitle(String workspaceName);

    @Key("get.support.link")
    String getSupportLink();

    @Key("get.product.name")
    String getProductName();

    @Key("support.title")
    String supportTitle();
}
