/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

jQuery( document ).ready( function()
{
    // initialize the dropdown menu if found
    $( '.topbar' ).dropdown();

    // improve table layout
    jQuery( 'table.bodyTable' ).each( function()
    {
        jQuery( this ).removeClass( 'bodyTable' );
        jQuery( this ).addClass( 'zebra-striped' );
    } );

    // add prettyprint class to all 'pre' element child of 'div' whit class="source"
    var prettify = false;

    jQuery( 'div.source > pre' ).each( function()
    {
        jQuery( this ).addClass( 'prettyprint' );
        prettify = true;
    } );

    // if code blocks were found, invoke the prettifier ...
    if ( prettify )
    {
        prettyPrint();
    }

} );