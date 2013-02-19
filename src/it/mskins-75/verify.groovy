File index = new File( basedir, "target/site/index.html" )
assert index.exists()
assert 1 == index.getText().count( '''\
<!-- Piwik -->
    <script type="text/javascript">
    var pkBaseURL = (("https:" == document.location.protocol) ? "https://example.org/piwik/" : "http://example.org/piwik/");
    document.write(unescape("%3Cscript src='" + pkBaseURL + "piwik.js' type='text/javascript'%3E%3C/script%3E"));
    </script><script type="text/javascript">
    try {
    var piwikTracker = Piwik.getTracker(pkBaseURL + "piwik.php", 1);
    piwikTracker.trackPageView();
    piwikTracker.enableLinkTracking();
    } catch( err ) {}
    </script><noscript><p><img src="http://example.org/piwik/piwik.php?idsite=1" style="border:0" alt=""/></p></noscript>
    <!-- End Piwik Tag -->
''' )
