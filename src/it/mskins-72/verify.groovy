File index = new File( basedir, "target/site/index.html" )
int inceptionYear = 2002
int currentYear = Calendar.getInstance().get(Calendar.YEAR)
assert index.exists()
assert 1 == index.getText().count( """\
                                        <p class="pull-right">Copyright &copy;                    ${inceptionYear}&#x2013;${currentYear}
                        <a href="http://www.apache.org/">The Apache Software Foundation</a>.
            All rights reserved.      
                    
      </p>
""".replace( "\n", System.getProperty( "line.separator" ) ) )
