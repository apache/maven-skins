File index = new File( basedir, "target/site/index.html" )
assert index.exists()
assert 1 == index.getText().count( '<li id="publishDate" class="pull-right">Last Published: 1970-01-01</li>' )