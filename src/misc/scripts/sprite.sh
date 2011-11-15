#!/bin/sh
#------------------------------------------------------------------------------
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#   http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
#------------------------------------------------------------------------------
# $Id$

montage window-new.png \
        internet-web-browser.png \
        accessories-text-editor.png \
        image-x-generic.png \
        package-x-generic.png \
        document-properties.png \
        application-certificate.png \
        drive-harddisk.png \
        network-server.png \
        contact-new.png \
        expanded.png \
        collapsed.png \
        -tile 4x3 -geometry +2+2 -background none external-links.png
