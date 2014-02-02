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
<a class="FlattrButton" style="display:none;"  href="http://opensource.org/"></a>
    <noscript><a href="https://flattr.com/thing/448050/Open-Source-Initiative-OSI" target="_blank">
    <img src="https://api.flattr.com/button/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0" /></a></noscript>'''.replace( "\n", System.getProperty( "line.separator" ) ) )
