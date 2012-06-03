File err = new File( basedir, "target/site/errors/404.html" )
assert err.exists()
assert err.getText().contains( '<base href="http://maven.apache.org/errors" />' )
