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
package com.codenvy.im.user;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/** @author Dmytro Nochevnov */
public class TestUserCredentials {

    @Test
    public void testInstantiation() {
        UserCredentials credentials = new UserCredentials();
        assertNull(credentials.getToken());
        assertNull(credentials.getAccountId());

        credentials = new UserCredentials("token");
        assertEquals(credentials.getToken(), "token");
        assertNull(credentials.getAccountId());

        credentials = new UserCredentials("token", "id");
        assertEquals(credentials.getToken(), "token");
        assertEquals(credentials.getAccountId(), "id");
    }

    @Test
    public void testSetupFields() {
        UserCredentials credentials = new UserCredentials();
        credentials.setToken("token");
        credentials.setAccountId("id");

        assertEquals(credentials.getToken(), "token");
        assertEquals(credentials.getAccountId(), "id");
    }
}