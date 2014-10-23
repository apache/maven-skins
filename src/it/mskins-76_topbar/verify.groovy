/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

File index = new File( basedir, "target/site/index.html" )
assert index.exists()
assert 1 == index.getText().count( '''\
<script type="text/javascript">
    /* <![CDATA[ */
        (function() {
            var s = document.createElement('script'), t = document.getElementsByTagName('script')[0];
            s.type = 'text/javascript';
            s.async = true;
            s.src = 'https://api.flattr.com/js/0.6/load.js?mode=auto';
            t.parentNode.insertBefore(s, t);
        })();
    /* ]]> */</script>'''.replace( "\n", System.getProperty( "line.separator" ) ) )

assert 1 == index.getText().count( '''\
<a class="FlattrButton" style="display:none;" rev="flattr;button:compact;" href="http://opensource.org/"></a>
    <noscript><a href="https://flattr.com/thing/448050/Open-Source-Initiative-OSI" target="_blank">
    <img src="https://api.flattr.com/button/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0" /></a></noscript>'''.replace( "\n", System.getProperty( "line.separator" ) ) )
