File index = new File( basedir, "target/site/index.html" )
assert index.exists()
assert !index.getText().contains( '$headContent' )