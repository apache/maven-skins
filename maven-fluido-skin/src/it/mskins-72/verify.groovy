File index = new File( basedir, "target/site/index.html" )
int inceptionYear = 2002
int currentYear = Calendar.getInstance().get(Calendar.YEAR)
assert index.exists()
assert 1 == index.getText().count( "<p class=\"pull-right\">Copyright &copy;" )