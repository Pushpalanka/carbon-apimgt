/*
*  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.wso2.carbon.apimgt.impl.token;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.apimgt.api.APIManagementException;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class URLSafeJWTGenerator extends JWTGenerator {

    private static final Log log = LogFactory.getLog(URLSafeJWTGenerator.class);

    public String encode(String stringToBeEncoded) throws APIManagementException {
            return Base64.encodeBase64URLSafeString(stringToBeEncoded.getBytes(Charset.defaultCharset()));
    }
}
