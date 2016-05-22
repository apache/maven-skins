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

// MSKINS-130 check that html structure is as clean as possible
String html = index.getText()
// active menu
assert html.contains( '<li class="active"><a href="#"><span class="none"></span>About</a>' )
// inactive menu
assert html.contains( '<li><a href="project-summary.html" title="Summary"><span class="none"></span>Summary</a>' )
assert html.contains( '<li><a href="https://maven.apache.org/plugins/index.html" class="externalLink" title="Plugins"><span class="none"></span>Plugins</a>' )
// breadcrumb
assert html.contains( '<li class=""><a href="https://www.apache.org/" class="externalLink" title="Apache">Apache</a><span class="divider">/</span></li>' )
